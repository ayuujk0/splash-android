package com.ayuujk.splashscreen;
/**
 ««« Created by @ayuujk01 on 03/03/17
 Splash Screen »»»
**/
import android.app.Activity;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SplashScreen extends Activity {

    @BindView(R.id.linear_splash) LinearLayout linearLayout;
    @BindView(R.id.ic_launcher) ImageView ic_launcher;

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        window.setFormat(PixelFormat.RGBA_8888);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        ButterKnife.bind(this);
        StartAnimations();
    }
    private void StartAnimations() {

        Thread timer = new Thread() {
            public void run() {
                try {
                    Animation anim = AnimationUtils.loadAnimation(SplashScreen.this, R.anim.alpha);
                    anim.reset();

                    linearLayout.clearAnimation();
                    linearLayout.startAnimation(anim);

                    anim = AnimationUtils.loadAnimation(SplashScreen.this, R.anim.up);
                    anim.reset();

                    ic_launcher.clearAnimation();
                    ic_launcher.startAnimation(anim);
                    //Time delay splash screen
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent i = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(i);
                }
            }
        };
        timer.start();

    }
}


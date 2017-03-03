# Splash Screen Android
La mayoria de las aplicaciones en el mercado cuentan con una pantalla de presentación al inicio que duran unos pocos segundos. 
Este tipo de presentaciones se les llama "splash screen", existen splash screen estaticas y con animaciones.
En este ejemplo crearemos un Splash screen con una simple animación slide up.

La imagen(clipart) que usaremos en esta aplicación fue obtenida desde 
https://romannurik.github.io/AndroidAssetStudio/icons-generic.html

Lo primero que vamos a definir es nuestro layout splash.xml donde colocaremos la imagen en una vista ImageView
Creamos nuestra actividad SplashScreen.java que se ocupara de la gestión del splash screen.

Especificar en el fichero AndroidManifest.xml que la primera actividad a ejecutar cuando arranque la aplicación sea la actividad SplashScreen.java, ya que gestionara el splash screen.

Con esto ya tendremos listo un bonito splash screen para nuestra aplicación.

![alt text](http://i.imgur.com/7sp5Lxr.png "Splash screen")

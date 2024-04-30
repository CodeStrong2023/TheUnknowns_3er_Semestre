package mundoPC;


import ar.com.system2023.mundopc.*;
//En vez de importar clase por clase a medida que se van usando, ponemos un * al final y esto permite que se exporten todas

public class mundoPC {

    public static void main(String[] args) {
//Definimos las variables
//Lo primero que hay que hacer es crear objetos de tipo raton, teclado, monitor y luego de tipo computadora, usando los objetos de monitor, raton y teclado
 //Creamos el objeto computadora, y el parametro que debemos pasarle es la marca, el monitor con marca, teclado con marca y raton tambien 
        Monitor monitorHP = new Monitor("HP", 13); //Importar la clase la clase que dice ar.com.system ( no la segunda opcion que aparece)
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora( "Computadora HP", monitorHP, tecladoHP, ratonHP );          

//Creamos mas objetos con otras marcas y luego un objeto de tipo orden
        Monitor monitorGamer = new Monitor("Gamer ", 32); 
        Teclado tecladoGamer  = new Teclado("Bluetooth", "Gamer ");
        Raton ratonGamer  = new Raton("Bluetooth", "Gamer ");
        Computadora computadoraGamer  = new Computadora( "Computadora Gamer ", monitorGamer , tecladoGamer , ratonGamer  );
        
        Monitor monitorLenovo = new Monitor("Lenovo ",  27); 
        Teclado tecladoLenovo  = new Teclado("USB", "Lenovo ");
        Raton ratonLenovo  = new Raton("USB", "Lenovo ");
        Computadora computadoraLenovo  = new Computadora( "Computadora Lenovo ", monitorLenovo , tecladoLenovo , ratonLenovo  );
        
        Monitor monitorMac = new Monitor("Mac  ",  32); 
        Teclado tecladoMac    = new Teclado("Bluetooth", "Mac ");
        Raton ratonMac    = new Raton("Bluetooth", "Mac ");
        Computadora computadoraMac    = new Computadora( "Computadora Mac  ", monitorMac   , tecladoMac   , ratonMac    );
        
        Monitor monitorAsus = new Monitor("Asus ",  22); 
        Teclado tecladoAsus    = new Teclado("USB", "Asus ");
        Raton ratonAsus    = new Raton("Bluetooth", "Asus ");
        Computadora computadoraAsus    = new Computadora( "Computadora Asus ", monitorAsus  , tecladoAsus  , ratonAsus  );
        
        Monitor monitorAcer = new Monitor("Acer ",  27); 
        Teclado tecladoAcer    = new Teclado("USB", "Acer");
        Raton ratonAcer    = new Raton("Bluetooth", "Acer");
        Computadora computadoraAcer    = new Computadora( "Computadora Acer", monitorAcer  , tecladoAcer  , ratonAcer  ); 
        
         Monitor monitorDell = new Monitor("Dell ",  35); 
        Teclado tecladoDell    = new Teclado("USB", "Dell");
        Raton ratonDell    = new Raton("Bluetooth", "Dell");
        Computadora computadoraDell    = new Computadora( "Computadora Dell", monitorDell  , tecladoDell  , ratonDell  ); 
        
        Monitor monitorSamsung = new Monitor("Samsung",  35); 
        Teclado tecladoSamsung    = new Teclado("USB", "Samsung");
        Raton ratonSamsung    = new Raton("USB", "Samsung");
        Computadora computadoraSamsung    = new Computadora( "Computadora Samsung", monitorSamsung  , tecladoSamsung  , ratonSamsung  ); 
        
        Monitor monitorPhilips = new Monitor("Philips",  32); 
        Teclado tecladoJalatec    = new Teclado("USB", "Jalatec");
        Raton ratonNoga   = new Raton("USB", "Noga");
        Computadora computadoraVorago    = new Computadora( "Computadora Vorago", monitorPhilips  , tecladoJalatec  , ratonNoga  ); 
        
        Monitor monitorHuawei = new Monitor("Huawei",  29); 
        Teclado tecladoNoga    = new Teclado("Bluetooth", "Noga");
        Raton ratonJalatec   = new Raton("USB", "Jalatec");
        Computadora computadoraHuawei    = new Computadora( "Computadora Huawei", monitorHuawei  , tecladoNoga  , ratonJalatec  ); 
        
        //Clases de tipo orden 
       
          Orden orden1 = new Orden(); //Con esta linea inicializamos el arreglo pero está vacio porque no le hemos agregado ningun elemento
          Orden orden2 = new Orden();
          Orden orden3 = new Orden();
          Orden orden4 = new Orden();
          Orden orden5 = new Orden();
          Orden orden6 = new Orden();
          Orden orden7 = new Orden();
          Orden orden8 = new Orden();
          Orden orden9 = new Orden();
          Orden orden10 = new Orden();
          
          orden1.agregarComputadora(computadoraHP);
          orden2.agregarComputadora(computadoraGamer);
          orden3.agregarComputadora(computadoraLenovo);
          orden4.agregarComputadora(computadoraMac);
          orden5.agregarComputadora(computadoraAsus);
          orden6.agregarComputadora(computadoraAcer);
          orden7.agregarComputadora(computadoraDell);
          orden8.agregarComputadora(computadoraSamsung);
          orden9.agregarComputadora(computadoraVorago);
          orden10.agregarComputadora(computadoraHuawei);
          
          orden1.mostrarOrden();
          orden2.mostrarOrden();
          orden3.mostrarOrden();
          orden4.mostrarOrden();
          orden5.mostrarOrden();
          orden6.mostrarOrden();
          orden7.mostrarOrden();
          orden8.mostrarOrden();
          orden9.mostrarOrden();
          orden10.mostrarOrden();

    }
}


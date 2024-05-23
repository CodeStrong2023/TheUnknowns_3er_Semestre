<<<<<<< HEAD

package test;

=======
package test;
>>>>>>> fe1a645b23c7c9d0be3421f216232b28ae62bcee
import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
<<<<<<< HEAD
        empleado = new Escritor("Juan",5000,TipoEscritura.CLASICO);
        //System.out.println("empleado = " + empleado);
        System.out.println(empleado.obtenerDetalles());// si queremos acceder a metodos escritor
        //empleado.getTipoEscritura(); //no se puede hacer
        //Downcasting
        //((Escritor)empleado).getTipoEscritura(); //tenemos dos opciones: esta es una 
        Escritor escritor = (Escritor)empleado; // esta es la segunda opcion
        escritor.getTipoEscritura();
        
        //Upcasting
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
    }
=======
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        //System.out.println("empleado = " + empleado);
        //System.out.println(empleado.obtenerDetalles()); //si queremos acceder al metodo escritor
        //empleado.getTipoEscritura(); NO SE PUEDE HACER
        
//Downcasting
        //((Escritor)empleado).getTipoEscritura(); //Tenemos 2 opciones: esta es una
        Escritor escritor = (Escritor)empleado; // Esta es la segunda opcion
        escritor.getTipoEscritura();
   
//Upcasting
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
    
    }   
>>>>>>> fe1a645b23c7c9d0be3421f216232b28ae62bcee
}

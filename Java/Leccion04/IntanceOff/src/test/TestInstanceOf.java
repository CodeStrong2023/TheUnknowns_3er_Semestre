package test;

import domain.*;

public class TestInstanceOf {
        public static void main(String[] args) {
                 //Definimos variables de la clase padre
                Empleado empleado1 = new Empleado("Juan", 10000);
                determinarTipo(empleado1);
                //Variable de la clase hija
                empleado1 = new Gerente("Jose", 5000, "Sistemas");
//                determinarTipo(empleado1);
        }
        //Variable de tipo:
        public static void determinarTipo(Empleado empleado){
                if(empleado instanceof Gerente){
                        //Clases hijas primero
                        System.out.println("Es de tipo Gerente"); 
                        Gerente gerente = (Gerente)empleado;
//                        ((Gerente) empleado).getDepartamento();
                        System.out.println("gerente = " + empleado);//Accede a la clase hija
                }
                else if(empleado instanceof Empleado){
                        System.out.println("Es de tipo Empleado"); 
//                        Gerente gerente = (Gerente)empleado;
//                        System.out.println("gerente = " + gerente.getDepartamento());//Accede a la clase hija
                }
                else  if(empleado instanceof Object){
                        System.out.println("Es de tipo Object");
                        }
        }
}
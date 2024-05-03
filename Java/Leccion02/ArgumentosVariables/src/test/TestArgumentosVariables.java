package test;

public class TestArgumentosVariables {
        public static void main(String[] args) {
                //para usar el metodo imprimirNumeros lo llamamos desde el main
                imprimirNumeros(3, 4, 5);
                //Si llamamos otra vez la metodo
                imprimirNumeros(1, 2);
                variosParametros("Juan",  "Perez", 7, 8, 9);
        }
        //definimos otro metodo (siempre los arg variables van al final)
        private static void variosParametros(String nombre, String apellido, int ...numeros){
                System.out.println("Nombre: " + nombre);
                System.out.println("Apellido: " + apellido);
                imprimirNumeros(numeros);
        }
              
        //Definimos el tipo: int y los tres puntos indican el argumento variable , esto es para recibir esos argumentos de los que no sabemos la cantidad
        private static void imprimirNumeros(int... numeros) { //esto se va a convertir en un arreglo.
                //usamos un ciclo for para que mientras el i sea menor a la long del arreglo que estamos recibiendo 
                for (int i = 0; i < numeros.length; i++)
                {
                        System.out.println("Elementos: " + numeros[i]);
                }
        }     
                
}


import java.util.Scanner;

public class CalculadoraUTN {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //true: ciclo infinito que termina con el break
        while(true) {
            System.out.println("******* Aplicacion Calculadora *******");
            mostrarMenu(); //Llamamos al menu

            //Agregamos excepciones
            try {
                var operacion = Integer.parseInt(entrada.nextLine());

                if (operacion >= 1 && operacion <= 4) {

                    //Metodo de los operandos
                    ejecutarOperacion(operacion, entrada);
                }//Fin If
                else if (operacion == 5) {
                    System.out.println("Hasta pronto...");
                    break;
                } else {
                    System.out.println("La opción:" + operacion + " es incorrecta.");
                } // Fin else
                System.out.println(); //Salto de linea
            }catch (Exception e){
                System.out.println("Ocurrió un error:" + e.getMessage());
                System.out.println();
            } //Fin catch
        }// Fin while
    }//Fin main

    private static void mostrarMenu(){
        //Mostramos el menú
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicación
                4. División
                5. Salir
                """);
        System.out.println("Operacion a realizar: ");

    } //Fin metodo mostrar menu

    private static void ejecutarOperacion(int operacion, Scanner entrada){
        //variables de operador y resultado
        System.out.println("Digite el valor para el operando1: ");
        var operando1 = Double.parseDouble(entrada.nextLine());
        System.out.println("Digite el valor para el operando2: ");
        var operando2= Double.parseDouble(entrada.nextLine());

        Double resultado;
        switch (operacion){
            case 1 ->{ //Suma
                resultado = operando1 + operando2;
                System.out.println("Resultado de la suma: "+resultado);
            }
            case 2 ->{ //resta
                resultado = operando1 - operando2;
                System.out.println("Resultado de la resta: "+resultado);
            }
            case 3 ->{ //multiplicacion
                resultado = operando1 * operando2;
                System.out.println("Resultado de la multiplicacion: "+resultado);
            }
            case 4 ->{ // Division
                resultado = operando1 / operando2;
                System.out.println("Resultado de la division: "+resultado);
            }
            default -> System.out.println("Opcion erronea "+operacion);
        }//Fin switch
    } // Fin ejecutarOperacion
}//Fin Clase

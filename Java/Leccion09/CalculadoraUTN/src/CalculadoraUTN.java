import java.util.Scanner;

public class CalculadoraUTN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("******* Aplicacion Calculadora *******");
        //Mostramos el menú
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicación
                4. División
                5. Salir
                """);
        System.out.println("Operacion a realizar: ");
        var operacion= Integer.parseInt(entrada.nextLine());

        if(operacion >= 1 && operacion<=4){

            System.out.println("Digite el valor para el operando1: ");
            var operando1 = Integer.parseInt(entrada.nextLine());
            System.out.println("Digite el valor para el operando2: ");
            var operando2= Integer.parseInt(entrada.nextLine());

            int resultado;
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

        }//Fin If
        if(operacion == 5){
            System.out.println("Hasta pronto...");
        }else {
            System.out.println("Opcion erronea");
        }


    }//Fin main
}//Fin Clase

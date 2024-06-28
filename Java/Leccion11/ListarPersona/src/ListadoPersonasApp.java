//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ListadoPersonasApp {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        Scanner entrada = new Scanner(System.in);
        //Definimos la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();

        //Empezamos con el menu
        var salir= false;
        while (!salir){
            mostrarMenu();
            try{
                salir=ejecutarOperacion(entrada, personas);
            }catch (Exception e){
                System.out.println("Ocurrio un error: "+e.getMessage());
            }
            System.out.printf(" ");
            }//Fin ciclo while
        }//Fin metodo main

        private static void mostrarMenu(){
            //Mostramos las opciones
            System.out.print("""
                       ******* Mostrar Personas *******
                       1. Agregar
                       2. Listar
                       3. Salir
                    """);
            System.out.print("Digite una de las opciones: ");
        }//Fin del metodo mostrarMenu

        private static boolean ejecutarOperacion(Scanner entrada, List<Persona> personas){

        }//Fin del metodoejecutarOperacion

}//Fin clase ListadoPersonasApp


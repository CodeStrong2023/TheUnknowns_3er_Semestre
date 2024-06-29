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
            var opcion = Integer.parseInt(entrada.nextLine());
            var salir = false;
            // revisamos la opcion digitada a travez de un switch
            switch (opcion){
                case 1 ->{//agregar una persona a la lista
                    System.out.print("digite el nombre: ");
                    var nombre = entrada.nextLine();
                    System.out.print("Digite el telefono: ");
                    var tel = entrada.nextLine();
                    System.out.print("Digite el correo: ");
                    var email: entrada.nextLine()
                    //creamos el objeto persona
                    var persona = new Persona(nombre, tel, email);
                    //agregamos la persona a la lista
                    personas.add(persona);
                    System.out.println("La lista tiene: "+personas.size()+" elementos");
                }//Fin del caso 1
                case 2 ->{//listar a las personas
                    System.out.println("Listado de personas: ");
                    //Mejoras con lamda y el metodo de referencia
                    //personas.forEach((persona) -> System.out.println(persona));
                    personas.forEach(System.out::println);
                }// fin caso 2
                case 3 -> {//salir del ciclo
                    System.out.println("Hasta pronto...");
                    salir = true;
                }//Fin del caso 3
                default -> System.out.println("Opcion Incorrecta "+opcion);
            }//Fin del switch
            return salir;
        }//Fin del metodoejecutarOperacion

}//Fin clase ListadoPersonasApp


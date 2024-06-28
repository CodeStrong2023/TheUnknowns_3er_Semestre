public class Persona {
    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas = 0;

    //Constructor vacio
    public Persona(){
        this.id = ++Persona.numeroPersonas;  //Seria null en este caso
    }

    //Constructor con parámentros(sobrecarga de constructores)
    public Persona(String nombre, String tel, String email) {
        //llamamos al constructor vacio (aunque lo hace por default al ejecutar)
        this();
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;


    }
}

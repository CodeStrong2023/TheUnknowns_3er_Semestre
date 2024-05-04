package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    static{ // bloque de inicializacion estatico
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
        //idPersona = 10; no es estatico por esto tenemos un error
    }
    
    { // bloque de inicializacion no estatico
        System.out.println("Ejecucion del bloque No estatico");
        this.idPersona = Persona.contadorPersonas++ ; //Incrementamos el atributo
    }
    
    //los bloques de inicializacion se ejecutan antes del constructor
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }
    
    public int getidPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}

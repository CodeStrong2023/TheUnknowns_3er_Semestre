
package domain;


public enum TipoEscritura {
    CLASICO ("Escritura a mano"),
    MODERNO ("Escritura digital");
    
    private final String descripcion;
    
    private TipoEscritura(String description){ //constructor
        this.descripcion = description;
    }
    
    //metodo get
    public String getDescription(){
        return this.descripcion;
    }
}


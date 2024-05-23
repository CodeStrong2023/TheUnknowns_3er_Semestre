<<<<<<< HEAD

package domain;


=======
package domain;

>>>>>>> fe1a645b23c7c9d0be3421f216232b28ae62bcee
public enum TipoEscritura {
    CLASICO ("Escritura a mano"),
    MODERNO ("Escritura digital");
    
    private final String descripcion;
    
<<<<<<< HEAD
    private TipoEscritura(String description){ //constructor
        this.descripcion = description;
    }
    
    //metodo get
    public String getDescription(){
        return this.descripcion;
    }
}

=======
    private TipoEscritura(String descripcion){ //Constructor
        this.descripcion = descripcion;
    }
    
    //Metodo get
    
    public String getDescripcion(){
        return this.descripcion;
    }
}
>>>>>>> fe1a645b23c7c9d0be3421f216232b28ae62bcee

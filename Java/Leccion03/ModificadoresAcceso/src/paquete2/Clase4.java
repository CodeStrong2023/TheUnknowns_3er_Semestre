
package paquete2;

public class Clase4 {
    private String atributoPrivate = "atributo Privado";
    private Clase4(){
        System.out.println("Constructor privado");
    }
    
    //creamos un constructor public para poder crear objetos
    public Clase4(String argumento){// aqui se puede llamar al construcotr vacio
        this();
        System.out.println("Constructor publico");
    }
    
    //metodo private
    private void metrodoPrivado(){
        System.out.println("Metodo Privado");
    }

    public String getAtributoPrivate() {
        return atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }
    
    
}

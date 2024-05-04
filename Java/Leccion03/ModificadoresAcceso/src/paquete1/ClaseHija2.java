
package paquete1;

public class ClaseHija2 extends Clase2{
    public ClaseHija2(){
        super();
        this.atributoDafault ="Modificacion del atributo default";
        System.out.println("atributoDefault"+ this.atributoDafault);
        this.metodoDefault();
    }
}

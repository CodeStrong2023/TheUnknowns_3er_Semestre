
package paquete1;

class Clase2 extends Clase1{ 
    String atributoDafault ="Valor del atributo Default";
    
   // Clase2(){
   //     System.out.println("Constructor Default");
   // }
    
    public Clase2(){
        super();
        this.atributoDafault = "Modificacion del atributo default";
        System.out.println("atributoDefault = " + this.atributoDafault);
        this.metodoDefault();
    }
    
    void metodoDefault(){
        System.out.println("Metodo Default");
    }
}

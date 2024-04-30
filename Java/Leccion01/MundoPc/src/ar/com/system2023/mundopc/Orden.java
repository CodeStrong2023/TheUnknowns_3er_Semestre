
package ar.com.system2023.mundopc;


public class Orden {
    private final int idOrden;
    private Computadora computadora[];// arreglo de objetos 
    private static int contadorOrden;
    private static final int MAX_COMPUTADORAS = 10;
    private int contadorComputadora;
    
    //constructor vacio
    public Orden(){
        this.idOrden = ++Orden.contadorOrden;
        this.computadora = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    //metodo para agregar una nueva computadora al arreglo
    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadora < Orden.MAX_COMPUTADORAS){
            this.computadora[this.contadorComputadora++] = computadora;
        }
        else{
            System.out.println("Has Superado el limite: "+Orden.MAX_COMPUTADORAS);
        }
    }
    
    
    
}
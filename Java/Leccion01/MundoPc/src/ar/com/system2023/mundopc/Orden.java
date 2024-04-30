
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
    
     //Metodo: Mostrar orden
        public void mostrarOrden() {
                System.out.println("Orden #: " + this.idOrden);
                System.out.println("Computadoras de la orden #: " + this.idOrden);
                //usamos un ciclo for con el iterador que comienza desde cero, para comparar cunado nuetro iterador sea menos a this.contadorcomputadora i ++
                for (int i = 0; i < this.contadorComputadora; i++)
                {
                        System.out.println(this.computadora[i]);
                }
        }
    
}

package test;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try{
          resultado = 10/0;  
        }catch(Excepcion e){
              System.out.println("Ocurrió un error");
              e.printStackTrace(System.out); //Se conoce como la pila de excepciones
        }      
        System.out.println("resultado = " + resultado);
    }
}

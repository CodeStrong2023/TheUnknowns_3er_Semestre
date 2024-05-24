<<<<<<< HEAD

package domain;


public class Rectangulo extends FiguraGeometrica{
    //Constructor
    public Rectangulo(String tipoFigura){
        super(tipoFigura);
    }
    
    @Override
    public void dibujar(){ //implementando el metodo
        System.out.println("Se imprime un: "+this.getClass().getSimpleName());
    }
=======
package domain;

public class Rectangulo extends FiguraGeometrica{
        //Constructor
        public Rectangulo(String tipoFigura) {
                super(tipoFigura);
        }

       @Override
       public void dibujar() {  //Implementando el metodo
               System.out.println("Se imprime un:  " + this.getClass().getSimpleName() );
       }       
        
>>>>>>> fe1a645b23c7c9d0be3421f216232b28ae62bcee
}

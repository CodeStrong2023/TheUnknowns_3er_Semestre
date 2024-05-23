<<<<<<< HEAD

package domain;

public abstract class FiguraGeometrica {
    protected String tipoFigura;
    
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    
    //metodo abstracto
    public abstract void dibujar();
    
    //agregamos el get y set

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
    @Override
    public String toString(){
        return "FiguraGeometrica{" + "tipoFigura=" + tipoFigura + "}";
    }
=======
package domain;

public abstract class FiguraGeometrica {
        protected String tipoFigura;
        
        protected FiguraGeometrica(String tipoFigura) {
                this.tipoFigura = tipoFigura;
        }
        //Metodo abstracto
        public abstract void dibujar();
        
        //Agregamos el get y set
        public String getTipoFigura() {
                return tipoFigura;
        }

        public void setTipoFigura(String tipoFigura) {
                this.tipoFigura = tipoFigura;
        } 
        //toString
        @Override
        public String toString() {
                return "FiguraGeometrica{" + "tipoFigura=" + tipoFigura + '}';
        }
        
>>>>>>> fe1a645b23c7c9d0be3421f216232b28ae62bcee
}

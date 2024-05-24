<<<<<<< HEAD

package domain;

public class Escritor extends Empleado{
    final TipoEscritura tipoEscritura;
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre,sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    
    //metodo para sobreescribir
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles()+", Tipo Escritura: "+tipoEscritura.getDescription();
    }
    
    @Override
    public String toString(){
        return "Escritor{" + "tipoEscritura=" + tipoEscritura + "}"+" "+super.toString();
=======
package domain;

public class Escritor extends Empleado {
    final TipoEscritura tipoEscritura;
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    
    //Metodo para sobreescribir
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + " ,Tipo Escritura: " + tipoEscritura.getDescripcion();
    }
    
    
    @Override
    public String toString(){
        return "Escritor{"+"tipoEscritura= "+tipoEscritura +"}"+" "+super.toString();
>>>>>>> fe1a645b23c7c9d0be3421f216232b28ae62bcee
    }
    
    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }
<<<<<<< HEAD
=======
    
>>>>>>> fe1a645b23c7c9d0be3421f216232b28ae62bcee
}

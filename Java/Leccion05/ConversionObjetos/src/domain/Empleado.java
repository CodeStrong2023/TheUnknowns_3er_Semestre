<<<<<<< HEAD

=======
>>>>>>> fe1a645b23c7c9d0be3421f216232b28ae62bcee
package domain;

public class Empleado {
    protected String nombre;
    protected double sueldo;
    
    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
<<<<<<< HEAD
    //metodo para la sobreescritura
    public String obtenerDetalles(){
        return "Nombre: "+this.nombre+", Sueldo: "+this.sueldo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getSueldo(){
        return sueldo;
    }
    
    public void setSueldo(double sueldo){
=======
    //metodo para sobreescritura
    public String obtenerDetalles(){
            return "nombre : "+ this.nombre + ", sueldo: " + this.sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
>>>>>>> fe1a645b23c7c9d0be3421f216232b28ae62bcee
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString(){
<<<<<<< HEAD
        return "Empleado{" + "nombre=" + ", sueldo=" + sueldo +"}";
    }
}
=======
        return "Empleado{"+"nombre: "+nombre+", sueldo: "+sueldo+"}";
    }
}
    
    
>>>>>>> fe1a645b23c7c9d0be3421f216232b28ae62bcee

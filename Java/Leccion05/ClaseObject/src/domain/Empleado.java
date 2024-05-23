<<<<<<< HEAD

package domain;

=======
package domain;

import java.util.Objects;

>>>>>>> fe1a645b23c7c9d0be3421f216232b28ae62bcee
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
        return "Empleado{" + "nombre=" + ", sueldo=" + sueldo +"}";
    }
<<<<<<< HEAD
    
    @Override
    public int hashCode(){
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.sueldo)^(Double.doubleToLongBits(this.sueldo) >>> 32));
        return hash;
    }
=======

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.sueldo) ^ (Double.doubleToLongBits(this.sueldo) >>> 32));
        return hash;
    }

    
    
    
>>>>>>> fe1a645b23c7c9d0be3421f216232b28ae62bcee
    
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        final Empleado other = (Empleado) obj;
        if(Double.doubleToLongBits(this.sueldo) != Double.doubleToLongBits(other.sueldo)){
            return false;
        }
        if(!Objects.equals(this.nombre, other.nombre)){
            return false;
        }
        return true;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> fe1a645b23c7c9d0be3421f216232b28ae62bcee

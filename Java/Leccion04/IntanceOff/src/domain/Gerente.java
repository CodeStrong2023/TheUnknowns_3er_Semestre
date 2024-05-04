package domain;

public class Gerente extends Empleado{
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    //sobreescribimos el metodo
        //Sobreescrbimos el metodo en la clase hija para que en test se muestre "departamento"
        //Debe tener el mismo nombre del metodo en la clase padre
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", Departamento: "+ this.departamento;
    }

}

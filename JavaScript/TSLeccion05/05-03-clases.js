// let persona3 = new Persona('Carla','Ponce') NO SE PERMITE USAR LA CLASE SI NO ESTA CREADA


class Persona{
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }
    get nombre(){
        return this._nombre;
    }
    set nombre(nombre){
        this._nombre = nombre;
    }
    get apellido(){
        return this._apellido;
    }

    set apellido(apellido){
        this._apellido = apellido;
    }
     //Sobreescritura
    nombreCompleto(){
        return super.nombreCompleto()+", "+this._departamento;
    }
    //Sobreescribiendo el metodo de la clase padre(Object)
    toString(){
        //Se aplica el polimorfismo que significa = multiples formas en tiempo de ejecucion
        //El metodo que se ejecuta depende si es una referencia de tipo padre o hija
        return this.nombreCompleto();
    }
}

class Empleado extends Persona{ //Clase hija
    constructor(nombre, apellid, departamento){
        super(nombre, apellido)
        this._departamento = departamento;

    }

    get departamento(){

    }

    set departamento(departamento){
        this._departamento = departamento;
    }

     //Sobreescritura
    nombreCompleto(){
        return super.nombreCompleto()+", "+this._departamento;
    }

}

let persona1 = new Persona("Martin", "Perez");
//console.log(persona1)
console.log(persona1.nombre);
persona1.nombre= "Juan Carlos";
console.log(persona1.nombre)

let persona2 = new Persona("Carlos", "Lara");
//console.log(persona2)
console.log(persona2.nombre)
persona2.nombre= "Maria Laura"
console.log(persona2.nombre)

let empleado1 = new Empleado("Maria", "Gimenez", "Sistemas");
console.log(empleado1);
console,log(empleado1.nombreCompleto());

//Metodo to string
//Object.prototype.toString //Esta es la manera de acceder a atributos y metodos de manera dinamica
console.log(empleado1.toString());
console.log(persona1.toString());

// let persona3 = new Persona('Carla','Ponce') NO SE PERMITE USAR LA CLASE SI NO ESTA CREADA


class Persona{ //Clase Padre

    static ContadorObjetosPersona = 0; //Atributo estático
    //email = 'Valor default email'; //Atributo NO estático
    static get MAX_OBJ(){ // Este metodo simula una constante
        return 5;
    }

    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
        if(Persona.contadorPersonas<Persona.MAX_OBJ){
            this.idPersona = ++Persona.contadorPersonas;
        }else{
            console.log("Se ha superado el maximo de objetos permitidos")
        }
        //console.log('se incrementa el contador: '+Persona.contadorObjetosPersona)
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
        return this._nombre+" "+this._apellido;
    }
    //Sobreescribiendo el metodo de la clase padre(Object)
    toString(){
        //Se aplica el polimorfismo que significa = multiples formas en tiempo de ejecucion
        //El metodo que se ejecuta depende si es una referencia de tipo padre o hija
        return this.nombreCompleto();
    }
    static saludar(){
        console.log("Saludosdesde este método static");
    }

    static saludar2(persona){
        console.log(persona.nombre+" "+persona.apellido);
    }
}

class Empleado extends Persona{ //Clase hija
    constructor(nombre, apellid, departamento){
        super(nombre, apellido)
        this._departamento = departamento;

    }

    get departamento(){
        return this._departamento
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
console.log(empleado1.nombreCompleto());

//Metodo to string
//Object.prototype.toString //Esta es la manera de acceder a atributos y metodos de manera dinamica
console.log(empleado1.toString());
console.log(persona1.toString());

//persona1.saludar(); no se utiliza desde el objeto
Persona.saludar();
Persona.saludar2(persona1);

Empleado.saludar();
Empleado.saludar2(empleado1);

//console.log(persona1.ContadorObjetosPersona);
console.log(Persona.ContadorObjetosPersona);
console.log(Empleado.ContadorObjetosPersona);

console.log(persona1.email);
console.log(empleado1.email);
//console.log(Persona.email); No se puede acceder desde la clase

console.log(persona1.toString());
console.log(persona2.toString());
console.log(Empleado1.toString());
console.log(Persona.contadorPersonas);

let persona3 = new Persona('Carla','Pertosi')
console.log(persona3.toString());
console.log(Persona.contadorPersonas);

console.log(Persona.MAX_OBJ);
// Persona.MAX_OBJ = 10;  no se puede modificar, ni alterar
console.log(Persona.MAX_OBJ);


let persona4 = new Persona('Franco','Diaz');
console.log(persona4.toString());

let persona5 = new Persona('Liliana', 'Paz')
console.log(persona5.toString());
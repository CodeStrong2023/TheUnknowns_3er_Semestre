let x = 10; //variable de tipo primitiva
console.log(x.length)
console.log('Tipos primitivos');

//Creacion de un objeto
let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 30,
    // Metodo o funcion en javascript dentro del objeto
    nombreCompleto: function(){ 
        return this.nombre + ' ' + this.apellido;
    } //Se pueden seguir agregando mas atributos o propiedades al objeto, por fuera de la {}
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona.nombreCompleto()); 
console.log('Ejecutando con un objeto');

//Creamos otro objeto en memoria
let persona2 = new Object(); 
persona2.nombre = 'Juan';
persona2.direccion = 'Salada 14';
persona2.telefono = '5492618252521';
console.log(persona2.telefono);
console.log('Creamos un nuevo objeto');

//Acceder a las propiedades de los objetos
console.log(persona['apellido']); //Accedemos como si fuera un arreglo
console.log('Usamos el ciclo for in');

//for in (propiedad es una variable)
for(propiedad in persona) {
    console.log(propiedad);
    console.log(persona[propiedad]);
}
console.log('Cambiamos y eliminamos un error');

//Cambiamos dinamicamente el valor de un objeto
persona.apellido = 'Betancud'; 
console.log(persona);

// Para agregar una propiedad nueva:
persona.apellida = 'Otro Apellido';
console.log(persona);

//Para eliminar una propiedad:
delete persona.apellida;
// Distintas formas de imprimir un objeto
console.log('Distintas formas de imprimir un objeto: forma 1');
// Numero 1: la mas sencilla: concatenar cada valor de cada propiedad
console.log(persona.nombre + ', ' + persona.apellido);

console.log('Distintas formas de imprimir un objeto: forma 2');
//Numero 2: A traves del ciclo for in
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

console.log('Distintas formas de imprimir un objeto: forma 3');
//Numero 3: La funcion Object.values(), regresa el objeto como un arreglo
let personaArray = Object.values(persona);
console.log(personaArray);

console.log('Distintas formas de imprimir un objeto: forma 4');
//Numero 4: Utilizaremos el metodo JSON.stringify (lo convierte en una cadena)
let personaString = JSON.stringify(persona);
console.log(personaString);

//get
console.log("Comenzamos a utilizar el metodo get");
console.log(persona.nombreEdad);

console.log("comenzamos el metodo get y set para idiomas");
persona.lang = "en";
console.log(persona.lang);

function Persona3(nombre,apellido,email){ //Constructor
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto= function(){
        return this.nombre+ " "+ this.apellido
    }
}
let padre = new Persona3("Leo","Lopez","lopezl@gmail.com");
padre.nombre = "Luis"; // modificamos el nombre
padre.telefono = "5492618282821"; // una propiedad exclusiva del objeto padre
console.log(padre);
console.log(padre.nombreCompleto()); //utilizamos la funcion
let madre = new Persona3("Laura","Contrera","contreral@gmail.com");
console.log(madre);
console.log(madre.telefono); //la propiedad no esta definida
console.log(madre.nombreCompleto());

//diferentes formas de crear objetos
//caso 1
let miObjeto = new Object(); //esta es una opcion formal
//caso 2
let miObjeto2 ={}; //esta opcion es breve y recomendada

//caso string
let miCadena1 = new String("Hola");//sintaxis formal
//caso string2 
let miCadena2 = "Hola"; //esta es la sintaxis simplificada y recomendada

//caso con numeros
let miNomero = new Number(1); //es formal no recomendable
//caso con numeros 2
let miNumero2 = 1;//sintaxis recomendada

//caso boolean 1
let miBoolean1 = new Boolean(false); //formal
//caso boolean 2
let miBoolean2 =false; //sintaxis recomendada

//caso arreglos 1
let miArreglo1 = new Array(); //formal
//caso arreglos 2
let miArreglo2 =[]; //sintaxis recomendada

//caso funcion 1
let miFuncion1 = new function(){}; // todo despues de new es considerado objeto
//caso funcion 2
let miFuncion2 = function(){}; //notacion simplificada y recomendada
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
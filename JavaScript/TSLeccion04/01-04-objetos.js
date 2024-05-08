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
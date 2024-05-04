miFuncion(8,2);

function miFuncion(a,b){
    // console.log("Sumamos: "+(a+b));
    return a + b;
}

//llamando la funcion
miFuncion(5,4);

let resultado = miFuncion(6, 7);
console.log(resultado);

//Declaramos una funcion del tipo expresion

let x = function (a ,b){return a + b};

resultado = x(5 ,6);
console.log(resultado)

//funciones de tipo self y invokeing

(function(a,b){
        console.log("Ejecutando la funcion "+( a + b ))
})(9,6);


console.log(typeof(miFuncion));

//como tipo objeto
function miFuncion2(a,b){
    console.log(arguments.length)
}

miFuncion2(5, 7, 3, 6);

//ToString
var miFuncionTexto = miFuncion2.toString();
console.log(miFuncionTexto);

//Funciones Flecha
const sumarFuncionFlecha = (a, b) => a + b ;
resultado = sumarFuncionFlecha(3,7);
console.log(resultado);


//Funcion de tipo expresion
let sumar = function(a = 4, b = 8 ){
    console.log(arguments[0]); //muestra el parametro de a: 
    console.log(arguments[1]); //muestra el parametro de b:
    
    return a + b + arguments[2];
}
resultado = sumar(3, 2, 9);
console.log(resultado); 

//Sumar todos los argumentos
let respuesta = sumarTodo(5, 4, 13, 10, 9);
console.log(respuesta);

function sumarTodo(){
    let suma = 0;
    for (let i = 0; i < arguments.length ; i++){
        suma += arguments[i]; //arguments para arreglos
    }
    return suma;
}


//Paso por valor - Paso por referencia
//Tipos primitivos

let k = 10;
function cambiarValor(a){
    a = 20;
}

cambiarValor(k); //k vale 10, recibe el valor a
console.log(k); //la funcion no afecto al valor de k, porque a fue una variable momentanea (paso por valor)

//Paso por referencia
//Se debe crear un objeto

const persona = {
    nombre: 'Juan',
    apellido: 'Lepez'
}

console.log(persona)
function cambiarValorObjeto(p1){
    p1.nombre = 'Ignacio';
    p1.apellido = 'Perez';
}

cambiarValorObjeto(persona);
console.log(persona);

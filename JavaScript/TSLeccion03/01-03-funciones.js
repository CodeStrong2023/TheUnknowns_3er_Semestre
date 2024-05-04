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
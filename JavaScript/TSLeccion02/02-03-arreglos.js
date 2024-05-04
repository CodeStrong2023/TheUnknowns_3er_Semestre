//Creacion de array o arreglos
// let autos = new Array("Ferrari","Renault","BMW"); esta es la sintaxis vieja
const autos = ["Ferrari","Renault","BMW"];
console.log(autos);

//recorrido de los elementos de un arreglo
console.log(autos[0]);
console.log(autos[2]);

for(let i = 0;i < autos.length;i++){
    console.log(i+" : "+autos[i]);
}

//modificar los elementos de un arreglo
autos[1]= "Volvo";
console.log(autos[1]);

//agregamos elementos a un arreglo
autos.push("Audi"); // aregamos elementos al final del arreglo
console.log(autos);

// otras formas de agregar elementos al arreglo
autos[autos.length] = "Porche";
console.log(autos);

//tercera forma de agregar elementos a un arreglo CUIDADO
autos[6] = "Renault";
console.log(autos);

// como preguntar si es un array o arreglo
console.log(Array.isArray(autos)); //devuelve un valor booleano

console.log(autos instanceof Array); // pregunta si la variable es una instancia de la clase array

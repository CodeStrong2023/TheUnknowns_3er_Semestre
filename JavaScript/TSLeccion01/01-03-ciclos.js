//ciclo while
//comenzamos con un contador
let contador = 0;
while(contador < 3){
    console.log(contador);
    contador++; //vamos aumentando para que no sea un ciclo infinito
}
console.log("Fin del ciclo while");

//ciclo do while --> se ejecuta primero el ciclo y luego revisa la condicion
let conteo = 0;
do{
    console.log(conteo);
    conteo++;
}while(conteo < 3);
console.log("Fin del ciclo do while");
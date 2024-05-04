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


//for
for(let contando = 0 ; contando < 3; contando++){
    console.log(contando);
}
console.log("Fin del ciclo for")

//palabra reservada break

for(let contando = 0 ; contando <= 10; contando++){
    if(contando % 2 == 0){
        console.log(contando); //muestra todos los pares
        break;
    }
}
console.log("Termina el ciclo al encontrar el primer numero par")

// palabra reservada continue y etiquetas labels
inicio:
for(let contando = 0;contando <= 10;contando++){
    if(contando % 2 != 0){
        continue inicio; // continua a la siguiente interacion
    }
    console.log(contando);
}
console.log("Termina el ciclo");
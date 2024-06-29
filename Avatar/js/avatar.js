let ataqueJugador
let ataqueEnemigo
let vidasJugador=3
let vidasEnemigo=3

function iniciarJuego(){
    let sectionSeleccionarAtaque = document.getElementById("seleccionar-ataque")
    sectionSeleccionarAtaque.style.display = "none"

    let botonPersonajeJugador = document.getElementById('boton-personaje');
    botonPersonajeJugador.addEventListener('click', seleccionarPersonajeJugador);
    
    let sectionReiniciar = document.getElementById('reiniciar')
    sectionReiniciar.style.display = 'none'
    
    // document.getElementById("reglas").style.display = "none"
    // document.getElementById("reglas-boton").addEventListener('click', mostrarReglas)
    // document.getElementById("boton-jugar").addEventListener('click', seleccionarPersonajeJugador)


    let botonPunio = document.getElementById('boton-punio') //Ahora creamos un escuchador de eventos
    botonPunio.addEventListener('click', ataquePunio)
    let botonPatada = document.getElementById('boton-patada')
    botonPatada.addEventListener('click', ataquePatada)
    let botonBarrida = document.getElementById('boton-barrida')
    botonBarrida.addEventListener('click', ataqueBarrida)
    //creamos una nueva variable
    let botonReiniciar = document.getElementById("boton-reiniciar")
    botonReiniciar.addEventListener('click', reiniciarJuego)
}

function mostrarReglas(){
    document.getElementById("reglas").style.display = "block"

}

function seleccionarPersonajeJugador(){
    let inputZuko = document.getElementById('zuko')
    let inputKatara = document.getElementById('katara')
    let inputAang = document.getElementById('aang')
    let inputToph = document.getElementById('toph')
    let spanPersonajeJugador = document.getElementById('personaje-jugador')

    let sectionSeleccionarAtaque = document.getElementById("seleccionar-ataque")
    sectionSeleccionarAtaque.style.display = "block" //mostramos

    let sectionSeleccionarPersonaje = document.getElementById("seleccionar-personaje")
    sectionSeleccionarPersonaje.style.display = "none"
    // document.getElementById("reglas").style.display = "none"


    if(inputZuko.checked){
        spanPersonajeJugador.innerHTML = 'Zuko'
    }else if(inputKatara.checked){
        spanPersonajeJugador.innerHTML = 'Katara'
    }else if(inputAang.checked){
        spanPersonajeJugador.innerHTML = 'Aang'
    }else if(inputToph.checked){
        spanPersonajeJugador.innerHTML = 'Toph'
    }else{
        let mensajeError = document.createElement('p')
        mensajeError.innerHTML= 'Selecciona un personaje'
        mensajeError.style.color = 'red'
        
        let seccionSeleccionarPersonaje = document.getElementById("seleccionar-personaje")
        seccionSeleccionarPersonaje.appendChild(mensajeError)
        
        setTimeout(()=>{
            seccionSeleccionarPersonaje.removeChild(mensajeError)
        },2000)
        reiniciarJuego()
        return
        
    }
    seleccinarPersonajeEnemigo()
}

function seleccinarPersonajeEnemigo(){ //esta función va dentro de seleccionarPersonajeJugador() al final
    let personajeAleatorio = aleatorio(1, 4) //A continuación creamos las variables para cada personaje
    let spanPersonajeEnemigo = document.getElementById('personaje-enemigo')

    //comenzamos con la lógica
    if(personajeAleatorio == 1){
        spanPersonajeEnemigo.innerHTML = 'Zuko'
    } else if(personajeAleatorio == 2){
        spanPersonajeEnemigo.innerHTML = 'Katara'
    } else if(personajeAleatorio == 3){
        spanPersonajeEnemigo.innerHTML = 'Aang'
    } else {
        spanPersonajeEnemigo.innerHTML = 'Toph'
    }
}

function ataquePunio(){ //Modificamos la variable global ataqueJugador
    ataqueJugador = 'Punio'
    ataqueAleatorioEnemigo()
}

function ataquePatada(){ //Modificamos la variable global ataqueJugador
    ataqueJugador = 'Patada'
    ataqueAleatorioEnemigo()
}

function ataqueBarrida(){ //Modificamos la variable global ataqueJugador
    ataqueJugador = 'Barrida'
    ataqueAleatorioEnemigo()
}

function ataqueAleatorioEnemigo(){//Ahora ocupando la variable global nueva le decimos el ataque y necesitamos la función aleatorio
    let ataqueAleatorio = aleatorio(1, 3)
    
    if(ataqueAleatorio == 1){
        ataqueEnemigo = 'Punio'
    } else if(ataqueAleatorio == 2){
        ataqueEnemigo = 'Patada'
    } else {
        ataqueEnemigo = 'Barrida'
    }
    combate()
}

//Nueva funcion para combinaciones de combate, se mostrara en forma de mensaje
function combate(){
    
    let spanVidasJugador = document.getElementById("vidas-jugador")
    let spanVidasEnemigos = document.getElementById("vidas-enemigo")
    
    if(ataqueEnemigo == ataqueJugador){
        crearMensaje("EMPATE")
    }else if( ataqueJugador == 'Punio' && ataqueEnemigo == 'Barrida'){
        crearMensaje("GANASTE")
        vidasEnemigo--
        spanVidasEnemigos.innerHTML = vidasEnemigo;
    } else if(ataqueJugador == 'Patada' && ataqueEnemigo == 'Punio'){
        crearMensaje("GANASTE")
        vidasEnemigo--
        spanVidasEnemigos.innerHTML = vidasEnemigo;
    } else if(ataqueJugador == 'Barrida' && ataqueEnemigo == 'Patada'){
        crearMensaje("GANASTE")
        vidasEnemigo--
        spanVidasEnemigos.innerHTML = vidasEnemigo;
    }else {
        crearMensaje("PERDISTE")
        vidasJugador--
        spanVidasJugador.innerHTML = vidasJugador;
    }
    //Revisar Vidas
    revisarVidas()
}

function revisarVidas(){
    if(vidasEnemigo == 0){
        crearMensajeFinal("FELICITACIONES!! HAS GANADO!")
    }else if(vidasJugador == 0){
        crearMensajeFinal("QUE PENA! HAS PERDIDO!")

    }
}

function crearMensajeFinal(resultado){
    let sectionReiniciar = document.getElementById('reiniciar')
    sectionReiniciar.style.display = 'block'

    let sectionMensaje = document.getElementById('mensajes')
    let parrafo = document.createElement('p')
//Aca le decimos que el contenido interno sea igual al del html, debemos cambiar lo que tenemos con variables
    parrafo.innerHTML = resultado
    
    sectionMensaje.appendChild(parrafo) //esta linea es para que el codigo se meta en el html
    let botonPunio = document.getElementById('boton-punio') //Ahora creamos un escuchador de eventos
    botonPunio.disabled = true
    let botonPatada = document.getElementById('boton-patada')
    botonPatada.disabled = true
    let botonBarrida = document.getElementById('boton-barrida')
    botonBarrida.disabled = true
}

//Nueva funcion para mandar mensajes al usuario
function crearMensaje(resultado){
    let sectionMensaje = document.getElementById('mensajes')
    let parrafo = document.createElement('p')
//Aca le decimos que el contenido interno sea igual al del html, debemos cambiar lo que tenemos con variables
    parrafo.innerHTML = 'Tu personaje atacó con ' + ataqueJugador + ' , el personaje del enemigo atacó con ' + ataqueEnemigo + ' ' + resultado
    sectionMensaje.appendChild(parrafo) //esta linea es para que el codigo se meta en el html
}

function reiniciarJuego(){
    location.reload();
}


function aleatorio(min, max){
    return Math.floor( Math.random() * (max - min +1) + min)
}

window.addEventListener('load', iniciarJuego)
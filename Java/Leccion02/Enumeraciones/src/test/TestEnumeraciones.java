
package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;
//para poder acceder a los elementos de una enumeracion, es como si fuera un atributo, aunque en este caso es estatico y final
public class TestEnumeraciones {
        public static void main(String[] args) {
//                System.out.println("Dia 1: " + Dias.LUNES); //importar dias
//                indicarDiaSemana(Dias.MARTES);
                //accedemos a continente
                System.out.println("Continente No. 4: " + Continentes.AMERICA); 
                System.out.println("No. de paises en el 4to. continente: " + Continentes.AMERICA.getPaises());
                System.out.println("No. de paises en el 4to. continente: " + Continentes.AMERICA.getHabitantes());

        }

package test;


public class TestAutoBoxingUnboxing {
    public static void main(String[] args) {
        
        //Clases envolventes o wrapper
        /*
            Clase envolventes de tipos primitivos
        
            int = la clase envolvente es Integer
            long = la clase envolvente es Long
            float = la clase envolvente es Float
            boolean = la clase envolvente es Boolean
            byte = la clase enolvente es Byte
            char = la clase envolvente es Character
            short = la clase envolvete es Short
            
        */
        int enteroPrim = 10; //tipo primitivo
        System.out.println("enteroPrim = " + enteroPrim);
        Integer entero = 10; //tipo object con la clase Integer
        System.out.println("entero = " + entero.doubleValue()); //Autoboxing
     
        int entero2 = entero; //Unboxing
        System.out.println("entero2 = " + entero2);
        
        
    }
}

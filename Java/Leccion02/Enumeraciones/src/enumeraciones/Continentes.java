package enumeraciones;

public enum Continentes {
    AFRICA(50,"1.2 billones"),
    EUROPA(36,"1.1 billones"),
    ASIA(44,"1.9 millones"),
    AMERICA(34,"150.2 millones"),
    OCEANIA(14,"1.2 billones");
    
    private final int paises;
    private final String habitantes;
    
    Continentes (int paises, String habitantes){
        this.paises = paises;
        this.habitantes = habitantes;
    }
    //METODO get
    
    public int getPaises(){
        return this.paises;
    }
    
    public String getHabitantes(){
        return this.habitantes;
    }
}
package Üben_SMÜ_Patterns.Strategy;

public class main {
    public static void main(String[] args){
        Sitz bank = new Bank();
        Sitz sitz = new Sportsitz();
        bank.beschreibung();
        sitz.beschreibung();
        bank.setArmlehne(new ZweiArmlehnen());
        bank.beschreibung();
    }
}
    

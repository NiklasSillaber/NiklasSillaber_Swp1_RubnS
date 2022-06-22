package Üben_SMÜ_Patterns.Factory;

public class main {

    public static void main (String[] args){
        Factory f = new Factory();
        Auto a = f.create(Fahrzeuge.L);
        a.fahren();
        Auto b = f.create(Fahrzeuge.S);
        b.fahren();
    }
    
}

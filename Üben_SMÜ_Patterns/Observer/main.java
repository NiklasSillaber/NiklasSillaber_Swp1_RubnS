package Üben_SMÜ_Patterns.Observer;

public class main {
    public static void main (String[] args){
        VerlagA v = new VerlagA();
        Bewerber n = new BewerberNiklas();
        Bewerber l = new BewerberLeo();
        v.addBewerber(n);
        v.addBewerber(l);
        v.setNachtricht(new Nachricht("JUHU"));
    }
}

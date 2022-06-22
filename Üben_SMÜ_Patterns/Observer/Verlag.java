package Üben_SMÜ_Patterns.Observer;

import java.util.ArrayList;

public abstract class Verlag {
    ArrayList<Bewerber> bewerber = new ArrayList<Bewerber>();
    
    public void addBewerber(Bewerber b){
        bewerber.add(b);
    }

    public void rempveBewerber(Bewerber b){
        bewerber.remove(b);
    }

    public void senden(Nachricht n){
        for (Bewerber b : bewerber){
            b.erhalten(n);
        }
    }
}

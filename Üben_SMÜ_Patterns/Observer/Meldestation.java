package Üben_SMÜ_Patterns.Observer;

import java.util.ArrayList;

public abstract class Meldestation {
    ArrayList<Abonnent> abos = new ArrayList<Abonnent>();

    public void addAbo(Abonnent a){
        abos.add(a);
    }
    public void removeAbo(Abonnent a){
        abos.remove(a);
    }
    public void benachrichtigen(Meldung m){
        for (Abonnent a : abos){
            a.erhalteMeldung(m);
        }
    }
}

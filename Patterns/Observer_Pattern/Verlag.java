package Patterns.Observer_Pattern;

import java.util.ArrayList;

public abstract class Verlag {
    
    ArrayList<Abonent> abos = new ArrayList<Abonent>();

    public void hinzufügen(Abonent a){
        abos.add(a);
    }

    public void entfernen(Abonent a){
        abos.remove(a);
    }

    public void versenden(Zeitung z){
        for(Abonent a : abos){
            a.erhalteZeitung(z);
        }
    }
}

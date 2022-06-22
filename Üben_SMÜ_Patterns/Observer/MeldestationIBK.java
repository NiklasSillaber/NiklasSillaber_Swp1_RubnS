package Üben_SMÜ_Patterns.Observer;

public class MeldestationIBK extends Meldestation {
    private Meldung aktuelleMeldung;

    public void setMeldung(Meldung m){
        this.aktuelleMeldung = m;
        benachrichtigen(m);
    }

    public Meldung getMeldung(){
        return this.aktuelleMeldung;
    }
}

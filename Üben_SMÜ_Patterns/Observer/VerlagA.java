package Üben_SMÜ_Patterns.Observer;

public class VerlagA extends Verlag{
    private Nachricht n;

    public void setNachtricht (Nachricht n){
        this.n = n;
        senden(n);
    }

    public Nachricht getNachricht(){
        return n;
    }

}

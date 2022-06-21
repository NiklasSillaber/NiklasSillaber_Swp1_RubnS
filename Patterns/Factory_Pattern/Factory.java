package Patterns.Factory_Pattern;

public class Factory {
    
    public Hund erstellen (Hunde h){
        Hund hund;
        
        switch(h){
            case CH:
                hund = new Chiwawa();
                break;
            case SC:
                hund = new Schäferhund();
                break;
            default:
                hund = new Chiwawa();
                break;
        }
        return hund;
    }
}

enum Hunde {
    CH, SC
}

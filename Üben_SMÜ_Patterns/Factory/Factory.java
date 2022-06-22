package Üben_SMÜ_Patterns.Factory;

public class Factory {
    public Auto create(Fahrzeuge z){
        Auto a;
        switch(z){
            case L:
                a = new Lambo();
                break;
            case S:
                a = new Seat();
                break;
            default:
                a = new Seat();
                break;
        }
        return a;
    }
}

enum Fahrzeuge {
    L, S
}

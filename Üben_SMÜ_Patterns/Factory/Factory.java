package Üben_SMÜ_Patterns.Factory;

public class Factory {

    public Auto create(Autotypen t){
        Auto a;
        switch(t){
            case BMW:
                a = new BMW();
                break;
            case SEAT:
                a = new Seat();
                break;
            default:
                a = new BMW();
                break;
        }
        return a;
    }
    
}

enum Autotypen {
    BMW, SEAT
}

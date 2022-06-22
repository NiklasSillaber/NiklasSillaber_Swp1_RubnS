package Üben_SMÜ_Patterns.Strategy;

public abstract class Sitz {
    Armlehne armlehne;

    public void setArmlehne(Armlehne a){
        armlehne = a;
    }

    public void beschreibung(){
        armlehne.vieViele();
    }
}

class Bank extends Sitz {
    public Bank() {
        setArmlehne(new DreiArmlehnen());
    }
} 

class Sportsitz extends Sitz {
    public Sportsitz() {
        setArmlehne(new ZweiArmlehnen());
    }
} 

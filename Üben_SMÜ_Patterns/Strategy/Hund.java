package Üben_SMÜ_Patterns.Strategy;

public abstract class Hund {
    private Bellverhalten b;

    public void setBellverhalten(Bellverhalten b){
        this.b = b;
    }

    public void bellen(){
        b.bellen();
    }
}

class Husky extends Hund{
    public Husky (){
        setBellverhalten(new BellenLaut());
    }
}

class Chichi extends Hund{
    public Chichi (){
        setBellverhalten(new BellenLeise());
    }
}

package Üben_SMÜ_Patterns.Strategy;

public interface Bellverhalten {
    public void bellen();
}

class BellenLaut implements Bellverhalten{

    @Override
    public void bellen() {
        System.out.println("WAUUUUUUUUUUUUUUUUUUUUUUU");
        
    }

}

class BellenLeise implements Bellverhalten{

    @Override
    public void bellen() {
        System.out.println("WAU");
        
    }

}

package Üben_SMÜ_Patterns.Strategy;

public interface Armlehne {
    public void vieViele();
}

class ZweiArmlehnen implements Armlehne{

    @Override
    public void vieViele() {
        System.out.println("2 Armlehnen");
    }

}

class DreiArmlehnen implements Armlehne{

    @Override
    public void vieViele() {
        System.out.println("3 Armlehnen");
    }

}

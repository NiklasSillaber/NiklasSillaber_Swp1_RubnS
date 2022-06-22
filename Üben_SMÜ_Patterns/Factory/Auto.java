package Üben_SMÜ_Patterns.Factory;

public interface Auto {
    public void fahren();
}

class BMW implements Auto {

    @Override
    public void fahren() {
        System.out.println("BRuuuuuuuuuuuuuuuuum");
    }
    
}

class Seat implements Auto {

    @Override
    public void fahren() {
        System.out.println("brum");
    }
    
}

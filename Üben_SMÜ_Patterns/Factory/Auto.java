package Üben_SMÜ_Patterns.Factory;

public interface Auto {
    public void fahren();
}

class Lambo implements Auto{

    @Override
    public void fahren() {
        System.out.println("BRUUUUUUUUM");
        
    }

}

class Seat implements Auto{

    @Override
    public void fahren() {
        System.out.println("sdjsd");
        
    }

}
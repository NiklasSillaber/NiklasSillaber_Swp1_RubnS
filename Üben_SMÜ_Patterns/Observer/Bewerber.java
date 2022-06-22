package Üben_SMÜ_Patterns.Observer;

public interface Bewerber {
    public void erhalten(Nachricht n);
}

class BewerberNiklas implements Bewerber {

    @Override
    public void erhalten(Nachricht n) {
        System.out.println("Niklas: " + n.getNachricht());
        
    }
    
} 

class BewerberLeo implements Bewerber {

    @Override
    public void erhalten(Nachricht n) {
        System.out.println("Leo: " + n.getNachricht());
        
    }
    
} 

package Patterns.Observer_Pattern;

public interface Abonent {
    public void erhalteZeitung(Zeitung z);
}

class FamHuber implements Abonent {

    @Override
    public void erhalteZeitung(Zeitung z) {
        System.out.println("Huber: " + z.getTitel());
    }
    
}

class FamDolm implements Abonent {

    @Override
    public void erhalteZeitung(Zeitung z) {
        System.out.println("Dolm: " + z.getTitel());
    }
    
}

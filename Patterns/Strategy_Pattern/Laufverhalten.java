package Patterns.Strategy_Pattern;

public interface Laufverhalten {
    public void laufen();
}

class SchnellLaufen implements Laufverhalten {

    @Override
    public void laufen() {
        System.out.println("I am speeeeed");
    }

}

class LangsamLaufen implements Laufverhalten {

    @Override
    public void laufen() {
        System.out.println("langsam laufen");
    }

}
package Patterns.Factory_Pattern;

public interface Hund {

    String bellen();

    String name();
    
}

class Chiwawa implements Hund {

    @Override
    public String bellen() {
        return "wauwau";
    }

    @Override
    public String name() {
        return "chiwawa";
    }

}

class Schäferhund implements Hund {

    @Override
    public String bellen() {
        return "WAUWAU";
    }

    @Override
    public String name() {
        return "schäfer";
    }
}
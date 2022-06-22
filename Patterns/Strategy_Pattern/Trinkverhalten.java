package Patterns.Strategy_Pattern;

public interface Trinkverhalten {
    public void trinken();
}

class VielTrinken implements Trinkverhalten {

    @Override
    public void trinken() {
        System.out.println("VIIIEEELLL WASSER");
    }

}

class WenigTrinken implements Trinkverhalten {

    @Override
    public void trinken() {
        System.out.println("WENIG WASSER");
    }

}
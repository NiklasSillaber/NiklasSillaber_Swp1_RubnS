package Üben_SMÜ_Patterns.Observer;

public interface Abonnent {
    public void erhalteMeldung(Meldung m);
}

class AbonnentNiklas implements Abonnent {

    @Override
    public void erhalteMeldung(Meldung m) {
        System.out.println("Niklas " + m.getTitel());
    }

}

class AbonnentDaniel implements Abonnent {

    @Override
    public void erhalteMeldung(Meldung m) {
        System.out.println("Daniel " + m.getTitel());
    }

}

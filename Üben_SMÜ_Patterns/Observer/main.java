package Üben_SMÜ_Patterns.Observer;

public class main {

    public static void main(String[] args) {
    
        MeldestationIBK ibk = new MeldestationIBK();
        Abonnent nikl = new AbonnentNiklas();
        Abonnent dani = new AbonnentDaniel();
        ibk.addAbo(nikl);
        ibk.addAbo(dani);
        ibk.setMeldung(new Meldung("Wasserspiegel erreicht"));
    }
}

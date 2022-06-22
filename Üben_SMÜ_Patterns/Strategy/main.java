package Üben_SMÜ_Patterns.Strategy;

public class main {
    public static void main(String[] args){
        Hund h = new Husky();
        Hund c = new Chichi();
        h.bellen();
        c.bellen();
        h.setBellverhalten(new BellenLeise());
        h.bellen();
    }
}

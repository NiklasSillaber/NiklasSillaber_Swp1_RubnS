package Patterns.Factory_Pattern;

public class main {

    public static void main(String[] args){
        Factory fac = new Factory();

        Hund chiwawa = fac.erstellen(Hunde.CH);
        Hund schäfer = fac.erstellen(Hunde.SC);
    
        System.out.println(chiwawa.name());
        System.out.println(schäfer.name());

    }

   

    
}

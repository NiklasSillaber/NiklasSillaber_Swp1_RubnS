package Abgabe_Rekursiv;

public class rekursivmain {
    public static void main(String[] args) {
        System.out.println("Summenfunktion");
        System.out.println("--> Iterativ: " + sumIterativ(5));
        System.out.println("--> Rekursiv: " + sumRekursiv(5));
        System.out.println();

        System.out.println("Fakultätsfunktion");
        System.out.println("--> Iterativ: " + fakIterativ(5));
        System.out.println("--> Rekursiv: " + fakRekursiv(5));
        System.out.println();

        System.out.println("Hoch-Funktion");
        System.out.println("--> Iterativ: " + powfakIterativ(5, 3));
        System.out.println("--> Rekursiv: " + powfakRekursiv(5, 3));
        System.out.println();

        System.out.println("Zusatz-Folge");
        System.out.println("--> Iterativ: " + sumFolgeIterativ(4));
        System.out.println("--> Rekursiv: " + sumFolgeRekursiv(4));
    }

    //iterative Methoden

    public static int sumIterativ(int i){
        int help = 0;
        for(int a = 0; a <= i; a ++){
            help += a;
        }
        return help;
    }

    public static int fakIterativ(int i){
        int help = 1;
        for(int a = 1; a <= i; a ++){
            help *= a;
        }
        return help;
    }

    public static int powfakIterativ(int base, int exp){
        int help = 1;
        for(int a = 1; a <= exp; a ++){
            help *= base;
        }
        return help;
    }

    //Zusatz Summe der Folge an = 3 * n bis zum n. Folgenglied berechnen

    public static int sumFolgeIterativ(int i){
        int help = 0;
        for(int a = 1; a <= i; a ++){
            help += a * 3;
        }
        return help;
    }

    //rekursive Methoden

    public static int sumRekursiv(int i){ 
        if (i <= 1){
            return 1;
        }
        else {
            return i + sumRekursiv(i - 1);
        }
    }

    public static int fakRekursiv(int i){ 
        if (i <= 1){
            return 1;
        }
        else {
            return i * fakRekursiv(i - 1);
        }
    }

    public static int powfakRekursiv(int base, int exp){ 
        if (exp < 1){
            return 1;
        }
        else {
            return base * powfakRekursiv(base, exp - 1);
        }
    }

    //Zusatz Summe der Folge an = 3 * n bis zum n. Folgenglied berechnen

    public static int sumFolgeRekursiv(int i){ 
        if (i < 1){
            return 0;
        }
        else {
            return 3 * i + sumFolgeRekursiv(i - 1);
        }
    }
}

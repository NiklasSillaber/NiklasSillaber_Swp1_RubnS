package Abgabe_Endrekursion;

public class endrekursivMain {
    public static void main(String[] args) {
        System.out.println("Summenfunktion");
        System.out.println("--> Rekursiv: " + sumRekursiv(5));
        System.out.println("--> Endrekursiv: " + sumEndRekursiv(0, 5));
        System.out.println();

        System.out.println("Fakultätsfunktion");
        System.out.println("--> Rekursiv: " + fakRekursiv(5));
        System.out.println("--> Endrekursiv: " + fakEndRekursiv(1, 5));
        System.out.println();

        System.out.println("Hoch-Funktion");
        System.out.println("--> Rekursiv: " + powfakRekursiv(5, 3));
        System.out.println("--> Endrekursiv: " + powfakEndRekursiv(5, 3, 1));
        System.out.println();

        System.out.println("Zusatz-Folge");
        System.out.println("--> Rekursiv: " + sumFolgeRekursiv(4));
        System.out.println("--> Endrekursiv: " + sumFolgeEndRekursiv(0, 4));
    }

    //rekursive Methoden

    public static int sumRekursiv(int i){ 
        if (i <= 1){
            return 1;
        }
        return i + sumRekursiv(i - 1);
    }

    public static int fakRekursiv(int i){ 
        if (i <= 1){
            return 1;
        }
        return i * fakRekursiv(i - 1);
    }

    public static int powfakRekursiv(int base, int exp){ 
        if (exp < 1){
            return 1;
        }
        return base * powfakRekursiv(base, exp - 1);
    }

    //Zusatz Summe der Folge an = 3 * n bis zum n. Folgenglied berechnen

    public static int sumFolgeRekursiv(int i){ 
        if (i < 1){
            return 0;
        }
        return 3 * i + sumFolgeRekursiv(i - 1);
    }

    //endrekursive Methoden

    public static int sumEndRekursiv(int m, int n){ 
        if (n == 0){
            return m;
        }
        return sumEndRekursiv(m + n, n - 1);
    }

    public static int fakEndRekursiv(int m, int n){ 
        if (n == 0){
            return m;
        }
        return fakEndRekursiv(m * n, n - 1);
    }

    public static int powfakEndRekursiv(int base, int expo, int m){   
        if (expo == 0){
            return m;
        }
        return powfakEndRekursiv(base, expo - 1, m * base);
    }

    //Zusatz Summe der Folge an = 3 * n bis zum n. Folgenglied berechnen

    public static int sumFolgeEndRekursiv(int m, int n){ 
        if (n == 0){
            return m;
        }
        return sumFolgeEndRekursiv(3 * n + m, n - 1);
    }

}

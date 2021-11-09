package Abgabe_Endrekursion;

public class endrekursivMain {
    public static void main(String[] args) {

        long timeSumRe1 = System.nanoTime();
        int sumRe = sumRekursiv(21);
        long timeSumRe2 = System.nanoTime();

        long timeSumEndRe1 = System.nanoTime();
        int sumEndRe = sumEndRekursiv(0, 21);
        long timeSumEndRe2 = System.nanoTime();
        
        int fakRe = fakRekursiv(3);
        int fakEndRe = fakEndRekursiv(1, 3);

        int powfakRe = powfakRekursiv(5, 3);
        int powfakEndRe = powfakEndRekursiv(5, 3, 1);

        int sumFolgeRe = sumFolgeRekursiv(6);
        int sumFolgeEndRe = sumFolgeEndRekursiv(0, 6);

        System.out.println("Summenfunktion");
        System.out.println("--> Rekursiv: " + sumRe + " Zeit: " + (timeSumRe2 - timeSumRe1) + "ns");
        System.out.println("--> Endrekursiv: " + sumEndRe + " Zeit: " + (timeSumEndRe2 - timeSumEndRe1) + "ns");
        System.out.println();

        System.out.println("Fakultätsfunktion");
        System.out.println("--> Rekursiv: " + fakRe);
        System.out.println("--> Endrekursiv: " + fakEndRe);
        System.out.println();

        System.out.println("Hoch-Funktion");
        System.out.println("--> Rekursiv: " + powfakRe);
        System.out.println("--> Endrekursiv: " + powfakEndRe);
        System.out.println();

        System.out.println("Zusatz-Folge");
        System.out.println("--> Rekursiv: " + sumFolgeRe);
        System.out.println("--> Endrekursiv: " + sumFolgeEndRe);
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

package Abgabe_Endrekursion;

public class endrekursivMain {
    public static void main(String[] args) {

        long start;
        long stop;

        //Summe
        System.out.println("Summenfunktion");

        start = System.nanoTime();
        int sumRe = sumRekursiv(21);
        stop = System.nanoTime();

        System.out.println("--> Rekursiv: " + sumRe + " Zeit: " + (stop - start) + "ns");

        start = System.nanoTime();
        int sumEndRe = sumEndRekursiv(0, 21);
        stop = System.nanoTime();
        
        System.out.println("--> Endrekursiv: " + sumEndRe + " Zeit: " + (stop - start) + "ns");
        System.out.println();

        //Fakultät
        System.out.println("Fakultätsfunktion");

        start = System.nanoTime();
        int fakRe = fakRekursiv(3);
        stop = System.nanoTime();

        System.out.println("--> Rekursiv: " + fakRe + " Zeit: " + (stop - start) + "ns");

        start = System.nanoTime();
        int fakEndRe = fakEndRekursiv(1, 3);
        stop = System.nanoTime();

        System.out.println("--> Endrekursiv: " + fakEndRe + " Zeit: " + (stop - start) + "ns");
        System.out.println();

        //Potenzfunktion
        System.out.println("Hoch-Funktion");

        start = System.nanoTime();
        int powfakRe = powfakRekursiv(5, 3);
        stop = System.nanoTime();

        System.out.println("--> Rekursiv: " + powfakRe + " Zeit: " + (stop - start) + "ns");

        start = System.nanoTime();
        int powfakEndRe = powfakEndRekursiv(5, 3, 1);
        stop = System.nanoTime();

        System.out.println("--> Endrekursiv: " + powfakEndRe + " Zeit: " + (stop - start) + "ns");
        System.out.println();

        //Zusatzfolge
        System.out.println("Zusatz-Folge");

        start = System.nanoTime();
        int sumFolgeRe = sumFolgeRekursiv(6);
        stop = System.nanoTime();

        System.out.println("--> Rekursiv: " + sumFolgeRe + " Zeit: " + (stop - start) + "ns");

        start = System.nanoTime();
        int sumFolgeEndRe = sumFolgeEndRekursiv(0, 6);
        stop = System.nanoTime();

        System.out.println("--> Endrekursiv: " + sumFolgeEndRe + " Zeit: " + (stop - start) + "ns");
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

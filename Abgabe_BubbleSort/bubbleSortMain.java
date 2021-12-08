package Abgabe_BubbleSort;
import java.util.Arrays;
import java.util.Random;

public class bubbleSortMain{
    public static void main(String[] args) {

        //Array der Größe 100 mit Random Zahlen füllen
        int[] x = randomArray(100);
        System.out.println("Unsortiertes Array:");
        System.out.println(Arrays.toString(x));
        System.out.println();
        System.out.println("Sortiertes Array:");

        //Zeit messen
        long start = System.nanoTime();
        int[] y = bubbleSort(x);
        long stop = System.nanoTime();

        //Ausgeben
        System.out.println(Arrays.toString(y));
        System.out.println("Benötigte Zeit für das Sortieren mit BubbleSort: " + (stop - start) + " Nanosekunden");

    }

    //BubbleSort
    public static int[] bubbleSort(int[] arr){
        for(int x = arr.length; x > 1; x--){
            for(int i = 0; i < x - 1; i++){
                if(arr[i] > arr[i + 1]){
                    int help = arr[i];
                    arr[i] = arr[i+1];
                    arr[i + 1] = help;
                }
            }
        }
        return arr;
    }

    public static int[] randomArray(int laenge){
        int[] array = new int[laenge];
        Random rand = new Random(); 

        for (int i = 0; i<array.length; i++){
            int value = rand.nextInt(100); 
            array[i] = value;
        }
        return array;
    }
}
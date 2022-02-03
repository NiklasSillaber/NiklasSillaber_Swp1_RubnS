package Abgabe_QuickSort;

public class main {
    
    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5, 8, 5, 34, 234, 5, 43, 23, 34, 4, 3, 3, 3, 90};

        //Array ausgeben
        System.out.println("Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();
        
        //sortieren (arr, low, high)
        quickSort(arr, 0, arr.length - 1);

        //Array ausgeben
        System.out.println("Sortiert: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //QuickSort
    static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            // pivot ... ist an der richitgen stelle 
            //alle kleineren links - alle größeren Rechts
            int pivot = sortAroundPivot(arr, low, high);
 
            //alle Elemente vor bibo und nach dem pivot sortieren
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }	

    //alle kleineren links - alle größeren Rechts (vom pivot)
    static int sortAroundPivot(int[] arr, int low, int high) {    
        //pivot ist das letzte Element ... kann auch ein anderes sein
        int pivot = arr[high];
     
        int i = (low - 1);
 
        for(int j = low; j <= high - 1; j++) {
         
            //schauen ob dieses Element kleiner als das pivot ist
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    //Funktion um Elemente in einem Array zu vertauschen
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}




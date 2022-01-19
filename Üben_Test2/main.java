package Üben_Test2;
import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        Integer[] arr = {1, 30, 4, 2, 5, 7, 1, 20, 3, 6, 90, 3, 6, 2, 78};
        char[] car = "NiklasdafdsfaASDSADdsdsaeegrts".toLowerCase().toCharArray();

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(car));
        arr = insertionSort(arr);
        
        System.out.println();
        System.err.println();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(car));
    }

    public static Integer[] bubbleSort(Integer[] arr) {

        for(int i = 0; i < arr.length; i ++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static Integer[] selectionSort(Integer[] arr){
        for(int i = 0; i < arr.length; i ++){
            int minX = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[minX] > arr[j]){
                    minX = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minX];
            arr[minX] = tmp; 
        }
        return arr;
    }

    public static Integer[] insertionSort(Integer[] arr){
        int j;
        int temp;
        for(int i = 0; i < arr.length; i++){
            temp= arr[i];
            j = i;
            while(j > 0 && arr[j-1] > temp){
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
        return arr;
    }

    

    
}



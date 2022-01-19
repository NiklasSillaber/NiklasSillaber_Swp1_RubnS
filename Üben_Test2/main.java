package Üben_Test2;
import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        Integer[] arr = {1, 30, 4, 2, 5, 7, 1, 20, 3, 6, 90, 3, 6, 2, 78, 20, 3, 5, 34,54, 45, 5,2 ,3};
        //char[] car = "NiklasdafdsfaASDSADdsdsaeegrts".toLowerCase().toCharArray();

        System.out.println(Arrays.toString(arr));
        System.out.println();
        //System.out.println(Arrays.toString(car));
        arr = bubbleSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        
    }

    public static Integer[] bubbleSort(Integer[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - i - 1; j++) {
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
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int tmp;
            if(min != i){
                tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }
        return arr;
    }

    public static Integer[] insertionSort(Integer[] arr){
        for(int i = 0; i < arr.length; i++){
            int tmp = arr[i];
            int j = i;
            while(j > 0 && arr[j - 1] > tmp){
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = tmp;
        }
        return arr;
    }

    
}



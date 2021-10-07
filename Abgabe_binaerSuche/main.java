package Abgabe_binaerSuche;
import java.util.Scanner;

public class main {
	static int stepsIterativ = 0;
	static int stepsBinary = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Array erstellen von 0 bis: ");
		int arrMax= sc.nextInt();
		int[] arr = new int[arrMax + 1];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		
		System.out.println  ();
		System.out.println("Array: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if(arr[i] % 20 == 0) {
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Bitte geben sie die gesuchte Zahl ein: ");
		int target = sc.nextInt();
		
		boolean containsIterativ = iterativSearch(target, arr);
		System.out.println();
		System.out.println("Iterative Suche:");
		System.out.println("Zahl enthalten -> " + containsIterativ);
		System.out.println("Schritte -> " + stepsIterativ);
		System.out.println();
		
		boolean containsBinaer = binarySearch(target, arr);
		System.out.println("Bin�re Suche:");
		System.out.println("Zahl entahlten -> " + containsBinaer);
		System.out.println("Schritte -> " + stepsBinary);
		
		double faster = (double) stepsIterativ / stepsBinary;
		String sFaster = String.format("%,.2f", faster);
		System.out.println();
		System.out.println("Bin�re Suche war " + sFaster + " Mal schneller");
	}
	
	public static boolean iterativSearch(int target, int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			stepsIterativ ++;
			if(arr[i] == target) {
				return true;	//gefunden
			}
		}
		return false;
	}
	
	public static boolean binarySearch(int target, int[] arr) {
		int min = 0;
		int max = arr.length - 1;
		int mid;
		
		while(min <= max) {
			stepsBinary ++;
			mid = (min + max) / 2;	//int rundet ab
			if(target == arr[mid]) {
				return true;	//gefunden
			}
			else if(arr[mid] < target) {
				min = mid + 1;
			}
			else {
				max = mid - 1;
			}
		}
		return false;
	}

}

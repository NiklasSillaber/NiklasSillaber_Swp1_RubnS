package Üben_Test3;

public class main {

    public static void main(String[] args) {
        String s = "hallo";
        int i = 1;
        String[] sArr = {"Nicht"};

        change(s, i, sArr);
        
        System.out.print(s + i + sArr[0]);

    }

    public static void change(String s, int i, String[] sArr){
        s = "tschau";
        i = 2;
        sArr[0] = "Juhu";
    }
    
}

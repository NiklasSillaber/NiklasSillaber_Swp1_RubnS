package Üben_Test3;

public class SingeltonDoubleLocked {
    private static SingeltonDoubleLocked instance;

    private SingeltonDoubleLocked(){}

    public static SingeltonDoubleLocked getInstance(){
        if (instance == null){
            synchronized (SingeltonDoubleLocked.class){
                if(instance == null){
                    instance = new SingeltonDoubleLocked();
                }
            }
        }
        return instance;
    }
}

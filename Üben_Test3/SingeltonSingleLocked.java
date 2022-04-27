package Üben_Test3;

public class SingeltonSingleLocked {
    private static SingeltonSingleLocked instance;

    private SingeltonSingleLocked(){}

    public static synchronized SingeltonSingleLocked getInstance(){
        if(instance == null){
            instance = new SingeltonSingleLocked();
        }
        return instance;
    }

}

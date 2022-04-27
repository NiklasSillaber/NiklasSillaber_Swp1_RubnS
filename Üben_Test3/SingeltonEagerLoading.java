package Üben_Test3;

public class SingeltonEagerLoading {
    private static SingeltonEagerLoading instance = new SingeltonEagerLoading();

    private SingeltonEagerLoading(){}

    public static SingeltonEagerLoading getInstance(){
        return instance;
    }
}

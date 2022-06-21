package Patterns.Proxy_Pattern;

public class RealInternet implements Internet{

    //hier keine Ckecks
    //diese Methode wird später im ProxyInternet aufgerufen

    @Override
    public void connect(String server) throws Exception {
        System.out.println("Connecting to " + server);
    }
}

package Üben_SMÜ_Patterns.Proxy;

public class RealInternet implements Internet{

    @Override
    public void verbinden(String url) throws Exception {
        System.out.println("Verbinden zu: " + url);
        
    }
    
}

package Patterns.Proxy_Pattern;

public class main {

    public static void main(String[] args) throws Exception{
        Internet i = new ProxyInternet();
        i.connect("www.google.com");
    }
    
}

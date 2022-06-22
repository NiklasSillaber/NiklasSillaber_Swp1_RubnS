package Üben_SMÜ_Patterns.Proxy;

public class main {
    public static void main(String[] args) throws Exception{
        Internet p = new ProxyInternet();
        p.verbinden("sdasd");
        p.verbinden("dolm");
    }
}

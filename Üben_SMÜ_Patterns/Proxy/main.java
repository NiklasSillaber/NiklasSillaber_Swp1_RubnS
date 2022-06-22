package Üben_SMÜ_Patterns.Proxy;

public class main {
    public static void main(String[] args) throws Exception{
        File f = new ProxyFile();
        f.openFile("Dolm");
        f.openFile("Wurm");
    }
}

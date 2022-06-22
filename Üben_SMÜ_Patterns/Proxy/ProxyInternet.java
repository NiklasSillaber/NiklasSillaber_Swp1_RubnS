package Üben_SMÜ_Patterns.Proxy;

import java.util.ArrayList;

public class ProxyInternet implements Internet {
    RealInternet i = new RealInternet();
    static ArrayList<String> banned;

    static {
        banned = new ArrayList<String>();
        banned.add("youtube");
        banned.add("dolm");
    }

    @Override
    public void verbinden(String url) throws Exception {
        if (banned.contains(url)){
            throw new Exception("Gebannte Seite");
        }
        else {
            i.verbinden(url);
        }
        
    }
}

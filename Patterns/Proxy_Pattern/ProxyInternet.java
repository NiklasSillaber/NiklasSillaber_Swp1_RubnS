package Patterns.Proxy_Pattern;

import java.util.ArrayList;

public class ProxyInternet implements Internet{
    Internet internet = new RealInternet();
    static ArrayList<String> banned;

    static {
        banned = new ArrayList<String>();
        banned.add("www.youtube.com");
        banned.add("www.dolm.com");
    }

    @Override
    public void connect(String server) throws Exception {
        if(banned.contains(server)){
            throw new Exception("Diese Seite ist gebannt");
        }
        else {
            internet.connect(server);
        }
    }

}

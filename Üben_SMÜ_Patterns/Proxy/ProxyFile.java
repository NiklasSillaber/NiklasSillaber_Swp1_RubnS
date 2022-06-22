package Üben_SMÜ_Patterns.Proxy;

import java.util.ArrayList;

public class ProxyFile implements File {

    public static ArrayList<String> banned;
    RealFile file = new RealFile();
    
    static {
        banned = new ArrayList<String>();
        banned.add("Virus");
        banned.add("Wurm");
    }

    @Override
    public void openFile(String filename) throws Exception {
        if(banned.contains(filename)){
            throw new Exception("Virus");
        }
        else {
            file.openFile(filename);
        }
        
    }
    
}

package Üben_SMÜ_Patterns.Proxy;

public class RealFile implements File {
    
    @Override
    public void openFile(String filename) throws Exception {
        System.out.println("File " + filename + " wird geöffnet");
    }
}

package Patterns.Observer_Pattern;

public class Zeitung {
    private String name;

    public Zeitung(String name){
        this.name = name;
    }
    
    public String getTitel(){
        return this.name;
    }
}
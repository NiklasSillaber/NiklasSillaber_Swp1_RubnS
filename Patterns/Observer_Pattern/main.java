package Patterns.Observer_Pattern;

public class main {

    public static void main(String[] args){
        TTVerlag verlag = new TTVerlag();
        Abonent huber = new FamHuber();
        Abonent dolm = new FamDolm();
    
        verlag.hinzufügen(huber);
        verlag.hinzufügen(dolm);
        Zeitung neue = new Zeitung("Skandal");
        verlag.setZeitung(neue);
    }
}

package Patterns.Observer_Pattern;

public class TTVerlag extends Verlag {

    Zeitung aktuelleZeitung;

    public void setZeitung(Zeitung z){
        aktuelleZeitung = z;
        versenden(z);
    }

    public void removeZeitung(){
        aktuelleZeitung = null;
    }
}

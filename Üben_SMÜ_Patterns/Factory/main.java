package Üben_SMÜ_Patterns.Factory;

public class main {
    public static void main(String[] args){
        Factory f = new Factory();
        Auto bmw = f.create(Autotypen.BMW);
        Auto seat = f.create(Autotypen.SEAT);
        bmw.fahren();
        seat.fahren();
    }
}

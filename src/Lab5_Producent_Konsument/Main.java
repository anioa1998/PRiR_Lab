package Lab5_Producent_Konsument;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Magazyn m = new MagazynImpl(3);
        Thread producent = new Producent(m);
        Thread konsument = new Konsument(m);
        producent.start();
        konsument.start();
        Thread.sleep(1*1000);
        producent.interrupt();
        konsument.interrupt();
    }
}

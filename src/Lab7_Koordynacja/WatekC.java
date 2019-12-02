package Lab7_Koordynacja;

public class WatekC extends Thread{
    koordynator koordynator;
    public WatekC(koordynator k) {this.koordynator = k;}

    @Override
    public void run() {
        try {
            while (true) {
                koordynator.startC();
                System.out.println("== Watek C");
                sleep((int) (Math.random() * 20));
                koordynator.koniecC();
            }
        } catch (Exception e) { }
    }

}

package Lab7_Koordynacja;

public class WatekA extends Thread {

    koordynator koordynator;
    public WatekA(koordynator k) {this.koordynator = k;}

    @Override
    public void run() {
        try {
            while (true) {
                koordynator.startA();
                System.out.println("= Watek A ="); //System.out.println("Watek B");
                sleep((int) (Math.random() * 20));
                koordynator.koniecA();
            }
        } catch (Exception e) {
        }
    }
}

package Lab7_Koordynacja;

public class main {
    public static void main(String[] args) throws InterruptedException {

        koordynator koordynator = new koordynatorimpl();
        Thread A_Watek = new WatekA(koordynator);
        Thread B_Watek = new WatekB(koordynator);
        A_Watek.start();
        B_Watek.start();
        Thread.sleep((int) (Math.random() * 500));
        A_Watek.interrupt();
        B_Watek.interrupt();
    }
}

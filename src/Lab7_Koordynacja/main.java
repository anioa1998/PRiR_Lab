package Lab7_Koordynacja;

public class main {
    public static void main(String[] args) throws InterruptedException {

        koordynator koordynator = new koordynatorimpl();
        Thread A_Watek = new WatekA(koordynator);
        Thread B_Watek = new WatekB(koordynator);
        Thread C_Watek = new WatekC(koordynator);
        A_Watek.start();
        B_Watek.start();
        C_Watek.start();
        Thread.sleep((int) (Math.random() * 500));
        A_Watek.interrupt();
        B_Watek.interrupt();
        C_Watek.interrupt();
    }
}

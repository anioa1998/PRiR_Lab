package Lab4;

public class NewThread1 extends Thread {

    Licznik licz;
    MonitorImpl monitor;

    public NewThread1(MonitorImpl m, Licznik licz) {
        this.licz = licz;
        this.monitor = m;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("W1 " + i);
            monitor.proceduraWejsciowaWatek1();
            licz.increment();
            monitor.proceduraWyjsciowaWatek1();
        }
    }
}

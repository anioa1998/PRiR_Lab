package Lab4;

public class NewThread2 extends Thread {

    Licznik licz;
    MonitorImpl monitor;

    public NewThread2(MonitorImpl m, Licznik licz) {
        this.licz = licz;
        this.monitor = m;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("W2 " + i);
            monitor.proceduraWejsciowaWatek2();
            licz.increment();
            monitor.proceduraWyjsciowaWatek2();
        }
    }
}

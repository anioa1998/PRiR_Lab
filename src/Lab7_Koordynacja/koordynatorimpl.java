package Lab7_Koordynacja;

public class koordynatorimpl implements koordynator {

    boolean blokadaA = false;
    boolean blokadaB = true;

    @Override
    synchronized public void startA() throws InterruptedException {
        while(blokadaA) wait();
        blokadaB = true;
    }

    @Override
    synchronized public void startB() throws InterruptedException {
        while(blokadaB) wait();
        blokadaA = true;
    }

    @Override
    synchronized public void koniecA() {
        this.notifyAll();
        blokadaB = false;
        blokadaA = true;
    }

    @Override
    synchronized public void koniecB()
    {
        this.notifyAll();
        blokadaA = false;
        blokadaB = true;
    }
}

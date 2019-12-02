package Lab7_Koordynacja;

public interface koordynator {
    void startA() throws InterruptedException;
    void startB() throws InterruptedException;
    void startC() throws InterruptedException;
    void koniecA() throws InterruptedException;
    void koniecB() throws InterruptedException;
    void koniecC();
}

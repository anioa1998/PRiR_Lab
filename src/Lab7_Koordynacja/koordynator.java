package Lab7_Koordynacja;

public interface koordynator {
    void startA() throws InterruptedException;
    void startB() throws InterruptedException;
    void koniecA();
    void koniecB();
}

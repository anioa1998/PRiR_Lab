package Lab5_Producent_Konsument;

public interface Magazyn<T>{

    void add (T product) throws InterruptedException;
    T get() throws InterruptedException;
}

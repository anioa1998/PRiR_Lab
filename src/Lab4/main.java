package Lab4;

public class main {

    public static void main(String[] args) throws InterruptedException {
        Licznik nowyLicznik = new Licznik();
        MonitorImpl nowyMonitor = new MonitorImpl();

        Thread Watek1 = new NewThread1(nowyMonitor,nowyLicznik);
        Thread Watek2 = new NewThread2(nowyMonitor,nowyLicznik);

        Watek1.start();
        Watek2.start();
        Watek1.join();
        Watek2.join();

        System.out.println(nowyLicznik.get());
    }
    //dwa wątki odpalamy, dwie klasy, monitor, licznik (mon i licz przekazywane do obu wątków)
    //piszemy procedury wejsciowe i wyjsciowe dla watkow obu
    //klasa watku ma konstruktor który przyjmuje jako argument monitor i licznik
    //każdy wątek ma swoj run, dokładnie taki sam, pętla od 1 do 100
    //z obiektu klasy monitor wywolujemy procedura wejscia watku 1/2 - zamiast proc. wej. synchronized
    //pomiedzy proc. wej i proc. wyj inkrementacja licznika
    //proc. wyj. -> release tego semafora, wyjscie z sekcji krytycznej


}

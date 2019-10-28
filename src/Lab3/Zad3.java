package Lab3;

public class Zad3 {

    public static void main(String[] args) throws InterruptedException {

        System.out.println(Zad2ThreadSync.licznik.get());

        int ileWatkow = 10;

        Zad2ThreadSync watki[] = new Zad2ThreadSync[ileWatkow];

        for(int i = 0; i < ileWatkow; i++){
            watki[i] = new Zad2ThreadSync(i + 1);
        }

        for(Zad2ThreadSync w : watki) {
            w.start();
        }

//        for(Zad2ThreadSync wt : watki) {
//            wt.join();
//        }

        for(int j = 0; j < ileWatkow; j++){
            watki[j].join();
        }

        System.out.println(Zad2ThreadSync.licznik.get());

    }

    public static class LicznikSync
    {
        int licznik;
        LicznikSync() {licznik = 0;}
        synchronized void increment() { licznik++; }

        int get() {
            return licznik;
        }
    }

    static class Zad2ThreadSync extends Thread {
        private int numer;
        static LicznikSync licznik = new LicznikSync();

        Zad2ThreadSync(int id ) { numer = id;}

        @Override
        public void run()
        {
            System.out.println("Watek: " + numer);
            for(int i = 0; i < 100000; i++)
                licznik.increment();
        }
    }
}

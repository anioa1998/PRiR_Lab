package Lab5_Producent_Konsument;

public class Konsument extends Thread{

    Magazyn<String> magazyn;

    public Konsument (Magazyn<String> m) {
        this.magazyn = m;
    }

    public void run() {
        int i = 0;
        try {
            while(true){
                String produkt = magazyn.get();
                if (Thread.interrupted()) throw new InterruptedException();
                System.out.println("Odczytałem z magazynu: " + produkt);
                Thread.sleep(20);
            }
        } catch (InterruptedException e) {
            System.out.println("Koniec watku konsumenta");
        }
    }
}
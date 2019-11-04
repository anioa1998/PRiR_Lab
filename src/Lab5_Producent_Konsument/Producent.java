package Lab5_Producent_Konsument;

public class Producent extends Thread{

    Magazyn<String> magazyn;

    public Producent(Magazyn<String> m) {
        this.magazyn = m;

    }

    public void run() {

        int i = 0;
        try {
            while(true) {
                String produkt = "" + i;
                magazyn.add(produkt);
                i++;
                Thread.sleep(20);
                System.out.println("Wrzucilem do magazynu: " + produkt + " +++++++");
            }
        } catch (InterruptedException e) {
            System.out.println("Koniec wątku Producenta");
        }

    }
}
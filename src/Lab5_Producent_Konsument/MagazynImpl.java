package Lab5_Producent_Konsument;

public class MagazynImpl implements Magazyn<String> {

    int size;
    String[] element = new String[size];
    int licznik_elementow;
    // boolean jestTowar = false;
    int indexZapisu = 0;
    int indexOdczytu = 0;

    MagazynImpl(int s) {
        this.size = s;
    }

    @Override
    public synchronized void add(String product) throws InterruptedException {
        while (licznik_elementow == size) {
            this.wait();
        }
        //this.element = product;
        //jestTowar = true;
        //for(int i =0; i<size; i++)
        indexZapisu = (indexZapisu++) % size;
        licznik_elementow++;
        notifyAll();

    }

    @Override
    public synchronized String get() throws InterruptedException {
        while (licznik_elementow == 0) {
            this.wait();
        }
        //jestTowar = false;
        int temp = indexOdczytu;
        indexOdczytu = (indexOdczytu++) % size;
        licznik_elementow--;
        notifyAll();
        return element[indexOdczytu];
    }
}

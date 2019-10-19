package Lab2_Zajecia.ksiazkaTelefoniczna;

public class Osoba {
    private static int id_licznik = 0;

    private int id;
    private String imie;
    private String nazwisko;
    private String nrTelefonu;

    public int getId() {
        return id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNrTelefonu() {
        return nrTelefonu;
    }

    public void setNrTelefonu(String nrTelefonu) {
        this.nrTelefonu = nrTelefonu;
    }

    public Osoba(String imie, String nazwisko, String nrTelefonu) {
        id_licznik += 1;
        this.id = id_licznik;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrTelefonu = nrTelefonu;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", nrTelefonu='" + nrTelefonu + '\'' +
                '}';
    }
}

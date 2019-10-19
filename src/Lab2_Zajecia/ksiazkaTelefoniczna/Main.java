package Lab2_Zajecia.ksiazkaTelefoniczna;

public class Main {
    public static void main(String[] args) {

        KsiazkaTelefoniczna nowaKsiazka = new KsiazkaTelefoniczna();
        Osoba o1 = new Osoba("Franek", "Kimono","665825899");
        Osoba o2 = new Osoba("Sebastian","Franc","730688794");
        Osoba o3 = new Osoba("Adam","Kimono","555555555");
        Osoba o4 = new Osoba( "Adam","Kowalski", "523541523");
        nowaKsiazka.dodajOsobe(o1);
        nowaKsiazka.dodajOsobe(o2);
        nowaKsiazka.dodajOsobe(o3);
        nowaKsiazka.dodajOsobe(o4);

        System.out.println(nowaKsiazka.getByImie("Adam").toString());
        System.out.println(nowaKsiazka.getByNazwisko("Kimono").toString());

    }
}

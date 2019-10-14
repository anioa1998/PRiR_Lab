package Lab2_Zajecia.ksiazkaTelefoniczna;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class KsiazkaTelefoniczna {
    Map<String, List<Osoba>> quickNazwisko = new HashMap<String, List<Osoba>>();
    Map<String, List<Osoba>> quickImie = new HashMap<String, List<Osoba>>();
    List<Osoba> allOsoba;

    List<Osoba> getByImie(String imie) {
        return quickImie.get(imie);
    }

    List<Osoba> getByNazwisko(String nazwisko) {
        return quickNazwisko.get(nazwisko);
    }

    void dodajOsobe(Osoba o) {
        allOsoba.add(o);
    }

    void removeOsoba(int id) {
        Osoba o = null;

        for (Osoba osb : allOsoba) {
            if (osb.getId() == id) {
                o = osb;
            }
        }

        allOsoba.remove(o);
        List<Osoba> temp = quickImie.get(o.getImie());
        temp.remove(o);
        List<Osoba> temp2 = quickNazwisko.get(o.getNazwisko());
        temp2.remove(o);

    }

    void read(File file) {
        try (Scanner sc = new Scanner(new File("plik.csv")))
        {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}

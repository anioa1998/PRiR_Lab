package Lab2_Zajecia.ksiazkaTelefoniczna;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class KsiazkaTelefoniczna {
    Map<String, List<Osoba>> quickNazwisko = new HashMap<String, List<Osoba>>();
    Map<String, List<Osoba>> quickImie = new HashMap<String, List<Osoba>>();
    List<Osoba> allOsoba = new ArrayList<>();

    List<Osoba> getByImie(String imie) {
        return quickImie.get(imie);
    }

    List<Osoba> getByNazwisko(String nazwisko) {
        return quickNazwisko.get(nazwisko);
    }

    void dodajOsobe(Osoba o) {
        allOsoba.add(o);

        boolean nazwiskoCheck = false;
        boolean imieCheck = false;

        for (Map.Entry<String, List<Osoba>> entry : quickNazwisko.entrySet()) {
            if (entry.getKey() == o.getNazwisko()) {
                nazwiskoCheck = true;
                entry.getValue().add(o);
            }
        }
        if (!nazwiskoCheck) {
            List<Osoba> temp = new ArrayList<>();
            temp.add(o);
            quickNazwisko.put(o.getNazwisko(), temp);
        }
        for (Map.Entry<String, List<Osoba>> entry : quickImie.entrySet()) {
            if (entry.getKey() == o.getImie()) {
                imieCheck = true;
                entry.getValue().add(o);
            }
        }
        if (!imieCheck) {
            List<Osoba> temp = new ArrayList<>();
            temp.add(o);
            quickImie.put(o.getImie(), temp);
        }
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
        try (Scanner sc = new Scanner(new File("plik.csv"))) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}

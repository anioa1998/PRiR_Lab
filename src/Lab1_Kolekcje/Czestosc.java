package Lab1_Kolekcje;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Czestosc {
    public static void main(String[] args) {


        try (Scanner sc = new Scanner(new File("tekst.txt"))) {

            Map<String, Integer> mp = new LinkedHashMap<>();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

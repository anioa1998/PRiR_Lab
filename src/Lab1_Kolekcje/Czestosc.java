package Lab1_Kolekcje;

import com.sun.source.tree.Tree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;


public class Czestosc {
    public static void main(String[] args) {


        try (Scanner sc = new Scanner(new File("tekst.txt"))) {

            Map<String, Integer> map = new TreeMap<>();


            while (sc.hasNext()) {

                String word = toUpperCase(sc.next()).replaceAll("[^\\p{L}\\p{N}]+", ""); //formuła na wczytywanie znaków unicode w regex
                if (map.containsKey(word))
                    map.put(word, map.get(word) + 1);
                else
                    map.put(word, 1);
            }
            int i = 0;

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (i != 0 && i < 11) {
                    String k = entry.getKey();
                    Integer v = entry.getValue();
                    System.out.println("Word: " + k + "; How many times: " + v);
                    i++;
                } else if (i == 0)
                    i++;
                else
                    break;

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
//17.10 10:00

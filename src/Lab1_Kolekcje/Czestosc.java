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
                if(map.containsKey(word))
                    map.put(word, map.get(word) + 1);
                else
                    map.put(word, 1);
            }
            System.out.println(map);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

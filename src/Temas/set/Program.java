package Temas.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();

        set.add("Tv");
        set.add("Notebook");
        set.add("Tablet");

        // contains
        // verifica se tem o objeto com esse nome e retorna true ou false
        set.contains("Tv");

        // remover
        set.remove("Tablet");

        // Remove com base em um predicado
        set.removeIf(x -> x.length() >= 3);
        set.removeIf(x -> x.charAt(0) == 'T');

        System.out.println(set.contains("Notebook"));
        for (String p : set) {
            System.out.println(p);
        }
    }
}

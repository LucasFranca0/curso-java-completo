package Temas.set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program1 {
    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        // União
        // c copia tudo que tem em a e depois adiciona os itens que tem em b
        // que não são repetidos, pois Set não permite repetições
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        // Intersecçção
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        // Diferença  - Somente os elementos que a tem de diferente do conjunto b.
        // Ou seja, remove todos os elementos b que são iguais
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}

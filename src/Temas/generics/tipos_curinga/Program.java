package Temas.generics.tipos_curinga;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);
        System.out.println("Maior valor: " + Collections.max(myInts));
        System.out.println();

        List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
        printList(myStrs);
        System.out.println("Ordem nome letra maior: " + Collections.max(myStrs));
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}

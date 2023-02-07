package Temas.generics.curingas_delimitados.problema_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Temas.generics.tipos_curinga.Program.printList;

/*
## Problema 2 (princípio get/put)

Vamos fazer um método que copia os elementos de uma lista
 para uma outra lista que pode ser mais genérica que a primeira.

 */
public class Program {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>();
        copy(myInts, myObjs);
        printList(myObjs);
        copy(myDoubles, myObjs);
        printList(myObjs);
    }

    // Método vai receber uma Lista de origem mais específica e uma Lista de destino mais genérica
    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number number : source) {
            destiny.add(number);
        }
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}

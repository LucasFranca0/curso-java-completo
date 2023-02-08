package Temas.equals_and_hashCode;

import Temas.equals_and_hashCode.entities.Client;

public class Program1 {
    public static void main(String[] args) {

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        String s1 = "Test";
        String s2 = "Test";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));

        // == compara a posição de memória e não o conteúdo dos Objetos
        System.out.println(c1 == c2);

        // O compilador dá um tratamento especial para literais, então será true
        // Mas se fosse 'String s1 = new String("Test");' seria false
        System.out.println(s1 == s2);
    }
}

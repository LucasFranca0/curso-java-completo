package Temas.map.exercicio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Exercicio do HackerRank
public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> telefones = new HashMap();
        String name = null;
        int phone = 0;
        System.out.println("Informe ");
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nome");
            name = in.nextLine();
            System.out.println("Telefone");
            phone = in.nextInt();

            telefones.put(name, phone);
            in.nextLine();
        }
        while (in.hasNextLine()) {
            String s = in.nextLine();
            if (telefones.containsKey(s)) {
                System.out.println(s + "=" + telefones.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
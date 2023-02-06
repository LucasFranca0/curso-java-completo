package Temas.generics;

import Temas.generics.services.PrintService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        PrintService<String> ps = new PrintService<>();

        System.out.print("How many values? ");
        int n = scan.nextInt();

   /* // Convertendo String em Integer
        ps.addValue(Integer.valueOf("1"));*/

        for (int i = 0; i < n; i++) {
            String value = scan.next();
            ps.addValue(value);
        }

        ps.print();
        String x = ps.first();
        System.out.println("First: " + x);

        scan.close();
    }
}

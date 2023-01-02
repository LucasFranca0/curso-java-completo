package Temas.poo.membros_estáticos;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double valorDolar = scan.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double quantidade = scan.nextDouble();
        double valorSemIof = CurrencyConverter.convertDolar(valorDolar, quantidade);
        double valorComIof = CurrencyConverter.conversaoIof();

        System.out.printf("value without iof = %.2f%n", valorSemIof);
        System.out.printf("Amount to be paid in reais = %.2f%n", valorComIof);
        ;
        ;
    }
}

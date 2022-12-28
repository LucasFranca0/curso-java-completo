package Temas.estruturas_repititivas;

import java.util.Locale;
import java.util.Scanner;

// Do While
// Primeiro executa o código que tem dentro do corpo e depois valida
// a condição. Se verdadeira, repete, senão finaliza.

public class DoWhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char resp;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');
        sc.close();

    }

}

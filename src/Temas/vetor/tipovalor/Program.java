package Temas.vetor.tipovalor;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double soma = 0;

        System.out.println("Digite um número de pessoas:");
        int n = scan.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite a altura da pessoa " + (i + 1));
            vect[i] = scan.nextDouble();
            soma += vect[i];
        }

        System.out.println();
        for (double i : vect) {
            System.out.print(i + "\n");
        }

        double avg = soma / n;

        System.out.println("AVERAGE HEIGHT: " + String.format("%.2f", avg));
        scan.close();
    }
}

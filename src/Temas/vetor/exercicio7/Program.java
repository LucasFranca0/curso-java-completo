package Temas.vetor.exercicio7;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.

 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double soma = 0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = scan.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = scan.nextDouble();
            soma += vetor[i];
        }

        double media = soma / n;

        System.out.print("\nMEDIA DO VETOR = " + String.format("%.3f", media) + "\n");
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < media) {
                System.out.println(vetor[i]);
            }
        }

        scan.close();
    }
}

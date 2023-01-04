package Temas.vetor.exercicio6;

import java.util.Locale;
import java.util.Scanner;
/*
Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado
 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = scan.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = scan.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = scan.nextInt();
        }

        int[] vetorC = new int[n];
        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < n; i++) {
            vetorC[i] += vetorA[i] + vetorB[i];
            System.out.println(vetorC[i]);
        }

    }

}

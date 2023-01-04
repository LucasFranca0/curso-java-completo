package Temas.vetor.exercicio4;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.
 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n = scan.nextInt();
        scan.nextLine();

        int[] vetor = new int[n];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = scan.nextInt();
        }

        int quant_pares = 0;
        System.out.println("\nNUMEROS PARES: ");
        for (int i = 0; i < vetor.length; i++) {
          if (vetor[i] % 2 == 0) {
              System.out.print(vetor[i] + "  ");
              quant_pares++;
          }
        }
        System.out.println("\n\nQUANTIDADE DE PARES = " + quant_pares);
            scan.close();
    }
}

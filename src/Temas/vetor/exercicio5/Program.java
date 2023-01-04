package Temas.vetor.exercicio5;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).

 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n = scan.nextInt();
        double[] vetor = new double[n];
        double maior = 0;
        int posicao = 0;

        for (int i = 0; i < vetor.length; i++) {
            scan.nextLine();
            System.out.print("Digite um numero: ");
            vetor[i] = scan.nextDouble();

            if (vetor[i] > maior) {
                maior = vetor[i];
                posicao = i;
            }
        }

        System.out.print("\nMAIOR VALOR = " + maior + "\n");
        System.out.print("POSICAO DO MAIOR VALOR = " + posicao);
        scan.close();
    }
}

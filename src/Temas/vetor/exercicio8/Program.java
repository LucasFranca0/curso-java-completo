package Temas.vetor.exercicio8;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"

 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = scan.nextInt();
        double mediaPares;
        int[] vetor = new int[n];

        int soma = 0;
        int quantidadePares = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = scan.nextInt();

            if ((vetor[i] % 2) ==  0) {
                soma += vetor[i];
                quantidadePares++;
            }
        }

        if (quantidadePares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        }
        else {
            mediaPares = soma / quantidadePares;
            System.out.println("MEDIA DOS PARES = " + String.format("%.1f", mediaPares));
        }

        scan.close();
    }
}

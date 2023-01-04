package Temas.vetor.exercicio1;

import java.util.Locale;
import java.util.Scanner;

/*
      Negativos

Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

 */
public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Digite um número: ");
            arr[i] = scan.nextInt();
            if (arr[i] < 0) {}
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.println(arr[i]);
            }
        }
    }
}

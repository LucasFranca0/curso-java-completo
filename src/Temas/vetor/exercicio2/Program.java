package Temas.vetor.exercicio2;

/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor

 */

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n = scan.nextInt();
        double soma = 0;
        double avg = 0;

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = scan.nextDouble();
            soma += vect[i];
        }

        System.out.print("\nVALORES = ");
        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + "  ");
        }

        avg = soma / vect.length;
        System.out.println("\nSOMA = " + soma);
        System.out.println("MEDIA = " + avg);

    }
}

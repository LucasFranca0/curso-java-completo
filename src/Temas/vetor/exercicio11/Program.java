package Temas.vetor.exercicio11;

import java.util.Locale;
import java.util.Scanner;

/*
Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens
 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double maiorAltura = 0, menorAltura = 100, mediaMulheres = 0, somaMulheres = 0;
        int numeroHomens = 0, numeroMulheres = 0;

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = scan.nextInt();

        char[] genero = new char[n];
        double[] altura = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            altura[i] = scan.nextDouble();
            System.out.print("Genero da " + (i + 1) + "a pessoa: ");
            genero[i] = scan.next().toUpperCase().charAt(0);

            if (genero[i] == 'F') {
                somaMulheres += altura[i];
                numeroMulheres++;
            }

            if (genero[i] == 'M') {
                numeroHomens++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }

            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
        }

        mediaMulheres = somaMulheres / numeroMulheres;
        System.out.println("\nMenor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorAltura);
        System.out.println("Media das alturas das mulheres = " + String.format("%.2f", mediaMulheres));
        System.out.println("Numero de homens = " + numeroHomens);
    }
}

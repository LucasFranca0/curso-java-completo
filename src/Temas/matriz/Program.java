package Temas.matriz;

import java.util.Locale;
import java.util.Scanner;

/*
  Matriz é como se fosse um vetor de vetores.

 */
public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[][] matriz = new int[n][n];

        // For para percorrer a linha da matriz
        for (int i = 0; i < matriz.length; i++) {
            // For para percorrer a coluna da matriz
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scan.nextInt();
            }
        }

        System.out.println();
        System.out.println("Main diagonal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        int count = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    count++;
                }
            }
        }

        System.out.println();
        System.out.print("Negative numbers = " + count);

        scan.close();
    }
}

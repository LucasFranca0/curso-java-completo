package Temas.funcao;

import java.util.Scanner;

public class Aula {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three numbers :");
        int valor1 = scan.nextInt();
        int valor2 = scan.nextInt();
        int valor3 = scan.nextInt();

        int higher = max(valor1, valor2, valor3);

        showResult(higher);

        scan.close();
    }

    // Criando função para calculcar o maior valor de 3 números
    public static int max(int valor0, int valor1, int valor2) {
        int aux;

        if (valor0 > valor1 && valor0 > valor2) {
            aux = valor0;
        } else if (valor1 > valor2 && valor1 > valor0) {
            aux = valor1;
        } else {
            aux = valor2;
        }
        return aux;
    }

    public static void showResult(int value) {
        System.out.println("Higher = " + value);
    }
}


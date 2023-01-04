package Temas.vetor.exercicio9;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.
 */

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = scan.nextInt();
        scan.nextLine();

        int maiorIdade = 0;
        String nome_pessoa = "";

        String[] nomes = new String[n];
        int[] idade = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            nomes[i] = scan.next();
            System.out.print("Idade: ");
            idade[i] = scan.nextInt();

            if (idade[i] > maiorIdade) {
                maiorIdade = idade[i];
                nome_pessoa = nomes[i];
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + nome_pessoa);
        scan.close();
    }
}

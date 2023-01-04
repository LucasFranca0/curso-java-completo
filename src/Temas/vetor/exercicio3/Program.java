package Temas.vetor.exercicio3;

import Temas.vetor.exercicio3.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

// Vetor tipo referência(Classe)

/*
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.
 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double soma = 0;
        double mediaAltura = 0;

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = scan.nextInt();

        Pessoa[] vect = new Pessoa[n];

        for (int i = 0; i < vect.length; i++) {
            scan.nextLine();
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            String name = scan.nextLine();
            System.out.print("Idade: ");
            int idade = scan.nextInt();
            System.out.print("Altura: ");
            double altura = scan.nextDouble();

            vect[i] = new Pessoa(name, idade, altura);
        }

        int menores = 0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getAltura();

            if (vect[i].getIdade() < 16) {
                menores++;
            }
        }

        double porcentagem_menores = ((double) menores / vect.length) * 100;
        //outra forma de calcular porcentagem  porcentagem_menores = menores * 100.0 / vect.length;
        mediaAltura = soma / vect.length;

        System.out.print("\nAltura média: " + String.format("%.2f", mediaAltura) + "\n");
        System.out.print("% de pessoas com menos de 16 anos: " + String.format("%.2f", porcentagem_menores) + "%\n");

        System.out.println("Nome das pessoas com menos de 16 anos: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                System.out.println(vect[i].getNome());
            }
        }

        scan.close();

    }
}

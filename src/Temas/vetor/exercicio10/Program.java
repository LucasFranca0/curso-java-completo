package Temas.vetor.exercicio10;

import Temas.vetor.exercicio10.entities.Estudante;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).
 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double media = 0;

        System.out.print("Quantos alunos serão digitados? ");
        int n = scan.nextInt();

        Estudante[] alunos = new Estudante[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "º aluno: ");
            scan.nextLine();
            String nome = scan.nextLine();
            double nota1 = scan.nextDouble();
            double nota2 = scan.nextDouble();
            alunos[i] = new Estudante(nome, nota1, nota2);
        }


        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < alunos.length; i++) {
            media = (alunos[i].getNota1() + alunos[i].getNota2()) / 2.0;
            if (media >= 6) {
                System.out.println(alunos[i].getNome() + "  || MEDIA FINAL: " + media);
            }
        }

       scan.close();
    }
}

package Temas.list.exercicio1;

import Temas.list.exercicio1.entities.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
   Pensando em fixar o conhecimento adquirido pensei em desenvolver um programa
   para receber dados de alunos e informar se ele foi aprovado ou não.
 */
public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scan.nextInt();

        // Criando uma lista do tipo referência(classe) e implementando com a classe ArrayList
        List<Student> students = new ArrayList<>();

        // Laço For para inserir os dados na lista
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.print("Enter the id of the student: ");
            int id = scan.nextInt();
            // verifica se o id já existe
            while (hasId(students, id)) {
                System.out.println("Student with id " + id + " already exists");
                System.out.print("Enther another id: ");
                id = scan.nextInt();
            }
            System.out.print("Enter the name of the student: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Enter the first note: ");
            double grade1 = scan.nextDouble();
            System.out.print("Enter the second note: ");
            double grade2 = scan.nextDouble();

            // adiciona os dados via construtor ao gerar uma instancia da classe Student
            students.add(new Student(id, name, grade1, grade2));
        }



        // Gera outra lista apenas de alunos aprovados
        List<Student> aprovados = students.stream().filter(x -> x.getApproved() == true).collect(Collectors.toList());
        System.out.println();
        System.out.println("Approved students: ");
        // Imprime todos os alunos aprovados
        for (Student alunos : aprovados) {
            System.out.println(alunos);
        }

        System.out.println();
        System.out.println("--------------------------------------------------------------------");

        // Imprime todos os elementos da lista
        System.out.println("All the students: ");
        for (Student alunos : students) {
            System.out.println(alunos);
        }
    }

    // Verifica se o id já existe
    public static boolean hasId(List<Student> list, int id) {
        Student student = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return student != null;
    }

}

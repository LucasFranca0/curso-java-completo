package Temas.poo.exercicio3;

import Temas.poo.exercicio3.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Informe o nome do aluno: ");
        student.name = scan.nextLine();

        System.out.print("Média primeiro semestre: ");
        student.semestre1 = scan.nextDouble();

        System.out.print("Média segundo semestre: ");
        student.semestre2 = scan.nextDouble();

        System.out.print("Média terceiro semestre: ");
        student.semestre3 = scan.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", student.mediaFinal());
        if (student.mediaFinal() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.pontosFaltando());
        } else {
            System.out.println("PASS");
        }
        scan.close();
    }

}

package Temas.poo.exercicio2;

import Temas.poo.exercicio2.entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class FuncionarioProgram {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        System.out.print("Name: ");
        funcionario.name = scan.nextLine();
        System.out.print("Gross salary: ");
        funcionario.grossSalary = scan.nextDouble();
        System.out.print("Tax: ");
        funcionario.tax = scan.nextDouble();
        System.out.println();
        System.out.println("Employee: " + funcionario);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = scan.nextDouble();
        funcionario.increaseSalary(percentage);
        System.out.println();
        System.out.println("Updated data: " + funcionario);
        scan.close();
    }
}

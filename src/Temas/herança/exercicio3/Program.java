package Temas.herança.exercicio3;

import Temas.herança.exercicio3.entities.Contributors;
import Temas.herança.exercicio3.entities.LegalPerson;
import Temas.herança.exercicio3.entities.PhysicalPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        List<Contributors> list = new ArrayList<>();


        System.out.print("Enter the number of tax payers: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char ch = scan.next().toLowerCase().charAt(0);
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Anual income: ");
            double income = scan.nextDouble();
            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double health = scan.nextDouble();
                list.add(new PhysicalPerson(name, income, health));
            }
            if (ch == 'c') {
                System.out.print("Number of employees: ");
                int employees = scan.nextInt();
                list.add(new LegalPerson(name, income, employees));
            }
        }

        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID: ");
        for (Contributors contributors : list) {
            System.out.println(contributors.getName() + ": $ " + String.format("%.2f", contributors.taxAmount()));
            sum += contributors.taxAmount();
        }


        System.out.println("");
        System.out.print("TOTAL TAXES: " + String.format("%.2f", sum));

    }
}

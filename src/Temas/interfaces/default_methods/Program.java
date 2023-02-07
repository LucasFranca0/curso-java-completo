package Temas.interfaces.default_methods;
import Temas.interfaces.default_methods.entities.BrazilInterestService;
import Temas.interfaces.default_methods.entities.InterestService;
import Temas.interfaces.default_methods.entities.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = scan.nextDouble();
        System.out.print("Months: ");
        int months = scan.nextInt();

        InterestService is = new BrazilInterestService(2.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("%.2f", payment));
    }
}

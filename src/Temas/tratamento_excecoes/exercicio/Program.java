package Temas.tratamento_excecoes.exercicio;

import Temas.tratamento_excecoes.exercicio.model.entities.Account;
import Temas.tratamento_excecoes.exercicio.model.entities.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = null;

        try {

            scan = new Scanner(System.in);
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = scan.nextInt();
            System.out.print("Holder: ");
            scan.nextLine();
            String holder = scan.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = scan.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = scan.nextDouble();

            Account account = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double amount = scan.nextDouble();
            account.withdraw(amount);

            System.out.println("New balance: " + account.getBalance());
        } catch (DomainException e) {
            System.out.println(e.getMessage());
        } finally {
            if (scan != null) {
                scan.close();
            }
        }

    }
}

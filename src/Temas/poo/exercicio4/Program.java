package Temas.poo.exercicio4;

import Temas.poo.exercicio4.entities.Bank;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        // Instanciando classe
        Bank bank;

        System.out.print("Enter account number: ");
        int accountNumber = scan.nextInt();

        System.out.print("Enter account holder: ");
        scan.nextLine();
        String accountHolder = scan.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char response = scan.next().toLowerCase().charAt(0);

        // Se for fazer o deposito inicial
        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = scan.nextDouble();
            // instancia classe com construtor com 3 parametros e recebe o valor da variável initialDeposit
            bank = new Bank(accountNumber, accountHolder, initialDeposit);
        } else {
            // caso não, irá instanciar e receber 2 parametros. Balance = 0
            bank = new Bank(accountNumber, accountHolder);
        }

        System.out.println("Account data: ");
        System.out.println(bank + "\n");

        System.out.print("Enter a deposit value: ");
        double amount = scan.nextDouble();
        bank.deposit(amount);

        System.out.println("Updated account data:");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", bank.getAccountNumber(), bank.getAccountHolder(), bank.getBalance());

        System.out.print("Enter a withdraw value: ");
        amount = scan.nextDouble();
        bank.withdraw(amount);

        System.out.println("Updated account data:");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", bank.getAccountNumber(), bank.getAccountHolder(), bank.getBalance());
    }
}

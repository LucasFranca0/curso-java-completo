package Temas.herança;


import Temas.herança.entities.Account;
import Temas.herança.entities.BusinessAccount;
import Temas.herança.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1002, "Joao", 0.0);
        BusinessAccount bacc = new BusinessAccount(1003, "Maria", 0.0, 500.0);

        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Anna", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004,"Bob", 0.0, 0.1 );

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);

        // Irá dar ume erro na hora da execução,
        // pois o Objeto 'acc3' foi instanciado como SavingsAccount.
       // BusinessAccount acc5 = (BusinessAccount)acc3;

        // instanceof para verificar qual o tipo do Objeto
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}

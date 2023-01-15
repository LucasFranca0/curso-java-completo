package Temas.herança;


import Temas.herança.entities.Account;
import Temas.herança.entities.BusinessAccount;
import Temas.herança.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1002, "Joao", 1000.0);
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

        // instanceof para verificar qual o tipo do Objeto // Instancia
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        // Testando sobreposição
        acc.withdraw(200.0);
        System.out.println(acc.getBalance());

        Account acc7 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance());

        Account acc8 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc8.withdraw(200.0);
        System.out.println(acc8.getBalance());

        // Polimorfismo //
        //é um recurso que permite que variáveis de um mesmo tipo mais genérico
        // possam apontar para objetos de tipos específicos  diferentes, tendo
        // assim comportamentos diferentes conforme cada tipo específico.

        Account x = new Account(1020, "Alex", 1000.0);
        // Upcasting = associação feita em tempo de execução
        Account y = new SavingsAccount(1023,"Maria", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println("Total X = " + x.getBalance());
        System.out.println("Total Y = " + y.getBalance());
    }
}

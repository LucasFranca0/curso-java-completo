package Temas.poo.exercicio4.entities;

/* Observações:

 O Balance(Saldo) só pode ser alterado pelo saque ou deposito. Não pode ser alterado pelo Set.
 O accountNumber não pode ser alterado, portanto, só poderá ser iniciado com um valor enviado via parametros do construtor.
 */

public class Bank {

    // Atributos
    private Integer accountNumber;
    private String accountHolder;
    private double balance;

    // Construtor
    // Visando melhor manutenção do código, é chamada a função deposit passando um valor como argumento.
    // Se no futuro a regra de deposito mudar e for inserida uma taxa, só precisará alterar a regra de 'deposit()'
    public Bank(Integer accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        deposit(initialDeposit);
    }

    public Bank(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    // Métodos
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit must be positive");
        } else {
            balance += amount;
            System.out.println("Sucessfully deposited: " + amount + "\n");
        }
    }

    public void withdraw(double amount) {
        balance -= amount + 5; // Valor a ser sacado + 5(taxa de saque). Exemplo: 300.00 + taxa 5.00 = 305.00
    }

    // Método para mostrar as informações
    public String toString() {
        return "Account Number: " + accountNumber + "\n" +
                "Account Holder: " + accountHolder + "\n" +
                "Balance: $ " + String.format("%.2f", balance);
    }

    // Getters & Setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }


}

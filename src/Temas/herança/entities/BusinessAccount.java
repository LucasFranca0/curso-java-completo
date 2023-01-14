package Temas.herança.entities;

public class BusinessAccount extends Account {

    private Double loanLimit;

    private BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        // Constutor da super classe
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    @Override
    public void withdraw(double amount) {
        // super para chamar o método da superclasse
        super.withdraw(amount);
        // - taxa de 2.0
        balance -= 2.0;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
           balance += amount - 10.0;
        }
    }
}

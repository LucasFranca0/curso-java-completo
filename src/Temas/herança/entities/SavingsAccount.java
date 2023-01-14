package Temas.herança.entities;

// 'final' para não deixar a classe ser herdada
// public final class SavingsAccount extends Account
public class SavingsAccount extends Account {

    private Double interestRate;

    public SavingsAccount () {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    // Sobreposição, usamos o @Override para informar
    // ao compilador que é uma sobreposição. E, também, se o nome do método estiver errado,
    // ele irá acusar ume erro
    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}

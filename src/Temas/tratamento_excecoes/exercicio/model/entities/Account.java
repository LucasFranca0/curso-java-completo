package Temas.tratamento_excecoes.exercicio.model.entities;


import Temas.tratamento_excecoes.exercicio.model.entities.exceptions.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    // Constructors
    public Account() {

    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) throws DomainException {
        if (balance < 0) {
            throw new DomainException("Invalid balance");
        }
        if (withdrawLimit < 0) {
            throw new DomainException("Invalid withdraw limit");
        }
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    // Methods
    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount) throws DomainException {
        validateWithdraw(amount);
        balance -= amount;
    }

    //Method responsible for validation
    private void validateWithdraw(double amount) throws DomainException {
        if (amount > balance) {
            throw new DomainException("Withdraw error: Not enough balance");
        }
        if (amount > withdrawLimit) {
            throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
        }
    }

    // Getters and setters

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }


    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
}

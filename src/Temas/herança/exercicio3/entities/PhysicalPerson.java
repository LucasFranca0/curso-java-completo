package Temas.herança.exercicio3.entities;

public class PhysicalPerson extends Contributors {
    private Double healthExpenses;

    public PhysicalPerson(String name, Double annualIncome, Double healthExpenses) {
        super(name, annualIncome);
        this.healthExpenses = healthExpenses;
    }

    public Double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    @Override
    public Double taxAmount() {
        if (annualIncome < 20000.00) {
            return (annualIncome * 15 / 100) - (healthExpenses * 50 / 100);
        } else {
            return (annualIncome * 25 / 100) - (healthExpenses * 50 / 100);
        }
    }
}

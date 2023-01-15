package Temas.herança.exercicio3.entities;

public class LegalPerson extends Contributors {

    private Integer numberEmployees;

    public LegalPerson(String name, Double annualIncome, Integer numberEmployees) {
        super(name, annualIncome);
        this.numberEmployees = numberEmployees;
    }

    public Integer getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(Integer numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    @Override
    public Double taxAmount() {

        if (numberEmployees > 10) {
            return (annualIncome * 14) / 100;
        } else {
            return (annualIncome * 16) / 100;
        }
    }
}

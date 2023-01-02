package Temas.poo.exercicio2.entities;

public class Funcionario {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
     return grossSalary - tax;
    }

    public  void increaseSalary(double percentage) {
        // Calcular porcentagem e receber o valor da porcentagem
        // Exemplo: grossSalary(1000) + o calculo da porcentagem(100) = grossSalary(1100)
     grossSalary += grossSalary * percentage / 100.0;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", netSalary());
    }



}



package Temas.composicao.entities;

import Temas.composicao.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/*
    Composição
    • É um tipo de associação que permite que um objeto contenha outro
    • Relação "tem-um" ou "tem-vários"

    Vantagens:
    • Organização: divisão de responsabilidades
    • Coesão
    • Flexibilidade
    • Reuso
 */

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    // Composição de objetos
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    // Constructors
    public Worker() {

    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    // Métodos
    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract contract : contracts) {
            cal.setTime(contract.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month) {
                sum += contract.totalValue();
            }
        }
        return sum;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name= " + name + "\n" +
                ", level= " + level + "\n" +
                ", baseSalary= " + baseSalary + "\n" +
                ", department= " + department + "\n" +
                ", contracts= " + contracts + "\n";
    }
}

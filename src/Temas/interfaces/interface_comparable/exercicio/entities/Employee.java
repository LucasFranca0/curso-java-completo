package Temas.interfaces.interface_comparable.exercicio.entities;

public class Employee implements Comparable<Employee>{
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    // Interface comparable ser
    @Override
    public int compareTo(Employee o) {
        return -salary.compareTo(o.getSalary());
    }
}

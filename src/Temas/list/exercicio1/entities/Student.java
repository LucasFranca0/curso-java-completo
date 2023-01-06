package Temas.list.exercicio1.entities;

public class Student {

    private Integer id;
    private String name;
    private Double grade1;
    private Double grade2;
    private Double media;
    private Boolean approved;

    // Construtor
    public Student(Integer id, String name, Double grade1, Double grade2) {
        this.id = id;
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        average(grade1, grade2);
    }


    // Cálculo de média
    public void average(double grade1, double grade2) {
        media = (grade1 + grade2) / 2;
        if (media > 6.0) {
            this.approved = true;
        } else {
            this.approved = false;
        }
    }

    // Método para organizar os dados a serem mostrados na tela
    public String toString() {
        return "Student id: " + id +
                ", name= " + name + "" +
                ", grade 1 = " + grade1 +
                ", grade 2 = " + grade2 +
                ", media= " + media +
                ", approved= " + approved;
    }

    // Getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGrade1() {
        return grade1;
    }


    public void setGrade1(Double grade1) {
        this.grade1 = grade1;
    }

    public Double getGrade2() {
        return grade2;
    }

    public void setGrade2(Double grade2) {
        this.grade2 = grade2;
    }

    public Boolean getApproved() {
        return approved;
    }

}

package Temas.vetor.exercicio12.entities;

public class Rent {
    private String name;
    private String email;

    public Rent(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String toString() {
        return name + ", " + email;
    }

    public String getName() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

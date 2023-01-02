package Temas.poo.exercicio3.entities;

public class Student {

    public String name;
    public double semestre1;
    public double semestre2;
    public double semestre3;

    public double mediaFinal() {
      return semestre1 + semestre2 + semestre3;
    }

    public double pontosFaltando() {
        if (mediaFinal() < 60.0) {
            return 60.0 - mediaFinal();
        }
        else {
            return 0.0;
        }
    }
}

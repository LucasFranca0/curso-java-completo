package Temas.herança.classe_abstrata.entities;

// Abstract
// Se uma classe tem um método abstrato, então
// ela também tem que ser abstrata

import Temas.herança.classe_abstrata.enumerations.Color;

public abstract class Shape {
    private Color color;

    public Shape() {}
    public Shape(Color color) {
        this.color = color;
    }

    // Método abstrato //
    // Não tem corpo pois é manipulado por uma subclasse
    public abstract double area();

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

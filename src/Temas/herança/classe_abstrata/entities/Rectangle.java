package Temas.herança.classe_abstrata.entities;

import Temas.herança.classe_abstrata.enumerations.Color;

// É obrigado a implementar o método abstrato da superclasse abstrata
// No caso, o método area();
public class Rectangle extends Shape{

    private Double width;
    private Double height;

    public Rectangle() {
       super();
    }

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}

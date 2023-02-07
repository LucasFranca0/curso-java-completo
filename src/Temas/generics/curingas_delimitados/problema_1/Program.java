package Temas.generics.curingas_delimitados.problema_1;

import Temas.generics.curingas_delimitados.problema_1.model.entities.Circle;
import Temas.generics.curingas_delimitados.problema_1.model.entities.Rectangle;
import Temas.generics.curingas_delimitados.problema_1.model.entities.Shape;


import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(myCircles));

    }

    public static double totalArea(List<? extends Shape> list) {
/*       // Não podemos Adicionar items a lista, pois o subtipo de Shape passado na List, pode não ser compatível com Rectangle
        list.add(new Rectangle(3.0, 4.0));*/
        double sum = 0.0;
        for (Shape shape : list) {
            sum += shape.area();
        }
        return sum;
    }
}
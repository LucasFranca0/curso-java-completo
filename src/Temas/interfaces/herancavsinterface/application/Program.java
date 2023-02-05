package Temas.interfaces.herancavsinterface.application;

import Temas.interfaces.herancavsinterface.entities.AbstractShape;
import Temas.interfaces.herancavsinterface.entities.Circle;
import Temas.interfaces.herancavsinterface.entities.Rectangle;
import Temas.interfaces.herancavsinterface.enums.Color;

import java.util.Locale;

/*
Aspectos em comum entre herança e interfaces

- Relação é-um
- Generalização/especialização
- Polimorfismo

Diferença fundamental

- Herança => reuso
- Interface => contrato a ser cumprido
 */

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        AbstractShape s1 = new Circle(Color.WHITE, 2.0);
        AbstractShape s2 = new Rectangle(Color.BLACK, 3.0, 4.0);

        System.out.println("Circle color: " + s1.getColor());
        System.out.println("Circle Area: " + String.format("%.3f", s1.area()));
        System.out.println("Rectangle color: " + s2.getColor());
        System.out.println("Rectangle area: " + String.format("%.2f", s2.area()));
    }
}

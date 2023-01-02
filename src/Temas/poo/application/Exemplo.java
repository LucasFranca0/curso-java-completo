package Temas.poo.application;

import Temas.poo.Triangle;

import java.util.Locale;
import java.util.Scanner;

// Problema resolvido com Orientação a Objeto usando a Classe Triangle
// Instanciação da Classe =  Objeto
// Instanciar uma classe: x = new Triangle();
//
// Instanciação (alocação dinâmica de memória)
// Ao instanciar uma classe: x = new Triangle();
// Vai ser criado um objeto do tipo Triangle na área de memória Heap e no Stack ficará um endereço para o objeto criado na área de memória Heap
//
// Memória: Stack faz referência a área Heap de memória


public class Exemplo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        // Chamando atributos da classe Triangle
        x.a = scan.nextDouble();
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = scan.nextDouble();
        y.b = scan.nextDouble();
        y.c = scan.nextDouble();

        // Chamando método da classe Triangle
        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        scan.close();
    }
}

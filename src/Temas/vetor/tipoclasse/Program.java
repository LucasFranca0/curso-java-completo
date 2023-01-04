package Temas.vetor.tipoclasse;

import Temas.vetor.tipoclasse.entities.Product;

import java.util.Locale;
import java.util.Scanner;

// Vetor do tipo referência(Classe) é necessário instanciar a classe
// e passar os parametros para o vetor apontar para a posição do objeto
//
// Exemplo:
//
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        double soma = 0;

        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            scan.nextLine();
            String name = scan.next();
            double price = scan.nextDouble();
            vect[i] = new Product(name, price);
            soma = soma + vect[i].getPrice();
        }

        double avg = soma / vect.length;
        System.out.println("Average: " + avg);
    }
}

package Temas.poo.construtor_encapsulamento;

import Temas.poo.construtor_encapsulamento.entities.Product;

import java.util.Locale;
import java.util.Scanner;

/*
 * Toda classe em Java é uma subclasse da classe Object.
 *
 * Object possui os seguintes métodos:
 *  getClass - retorna o tipo do objeto
 *  equals - compara se o objeto é igual a outro
 *  hashCode - retorna um código hash do objeto
 *  toString - converte o objeto para string
 *
 */


public class ProductProgram {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Price: ");
        double price = scan.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = scan.nextInt();

        // Instanciando e passando o construtor com parametros para obrigar a informar os dados antes de instanciar
        Product product = new Product(name, price, quantity);

        // pular linha
        System.out.println();

        // Se não converter para toString() dentro da classe Product irá aparecer "Temas.poo.construtor.entities.Product@34c45dca"
        // Para converter para String é necessário criar o método toString() na classe Product
        System.out.println("Product data: " + product.toString());
        // A chamada do toString() não é necessária, pois o Java detecta que o objeto está em um contexto de "println"

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");

        // variável para ser passada como parametro do método addProducts()
        quantity = scan.nextInt();
        // Adicionar produtos
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);


        // Remover produtos
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = scan.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);

       scan.close();

    }
}

package Temas.herança.exercicio2;

import Temas.herança.exercicio2.entities.ImportedProduct;
import Temas.herança.exercicio2.entities.Product;
import Temas.herança.exercicio2.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
        Fazer um programa para ler os dados de N
        produtos (N fornecido pelo usuário). Ao final,
        mostrar a etiqueta de preço de cada produto na
        mesma ordem em que foram digitados.
        Qualquer produto possui nome e preço. Produtos
        importados possuem uma taxa de alfândega, e
        produtos usados possuem data de fabricação.
        Estes dados específicos devem ser
        acrescentados na etiqueta de preço conforme
        exemplo (próxima página). Para produtos
        importados, a taxa e alfândega deve ser
        acrescentada ao preço final do produto.
        Favor implementar o programa conforme
        projeto ao lado.
        */
public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = scan.nextInt();

        List<Product> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = scan.next().toLowerCase().charAt(0);
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Price: ");
            double price = scan.nextDouble();

            if (ch == 'c') {
                Product product = new Product(name, price);
                list.add(product);
            }
            if (ch == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                scan.nextLine();
                String data = scan.nextLine();
                Date date = sdf.parse(data);
                Product product = new UsedProduct(name, price, date);
                list.add(product);
            }
            if (ch == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = scan.nextDouble();
                Product product = new ImportedProduct(name, price, customsFee);
                list.add(product);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product prod : list) {
            System.out.println(prod.priceTag());
        }
    }
}

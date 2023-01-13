package Temas.composicao.exercicio;

import Temas.composicao.exercicio.entities.Client;
import Temas.composicao.exercicio.entities.Order;
import Temas.composicao.exercicio.entities.OrderItem;
import Temas.composicao.exercicio.entities.Product;
import Temas.composicao.exercicio.entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Email: ");
        String email = scan.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(scan.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        scan.nextLine();
        String status = scan.nextLine();
        // Outra forma: OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), OrderStatus.valueOf(status), client);

        System.out.print("How many items to this order? ");
        int n = scan.nextInt();



        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + "#" + (i + 1) + " item data: ");
            System.out.print("Product name: ");
            scan.nextLine();
            String productName = scan.nextLine();
            System.out.print("Product price: ");
            double price = scan.nextDouble();

            Product product = new Product(productName, price);

            System.out.print("Quantity: ");
            int quantity = scan.nextInt();

            OrderItem item = new OrderItem(quantity, price, product);

            order.addItem(item);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        scan.close();
    }
}

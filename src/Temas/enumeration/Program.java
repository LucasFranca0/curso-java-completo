package Temas.enumeration;

import Temas.enumeration.entities.Order;
import Temas.enumeration.enumeration.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Order order = new Order(100, new Date(), OrderStatus.PROCESSING);

        // Ele imprime o status na forma de String conforme o nome dado
        // O Enum é transformado em String.
        System.out.println(order);

        // Converter um String para enum
        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}

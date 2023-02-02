package Temas.interfaces.exemplo1.application;

import Temas.interfaces.exemplo1.model.entities.CarRental;
import Temas.interfaces.exemplo1.model.entities.Vehicle;
import Temas.interfaces.exemplo1.model.services.BrazilTaxService;
import Temas.interfaces.exemplo1.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = scan.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(scan.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(scan.nextLine(), fmt);


        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Entre com o preço por hora: ");
        double pricerPerHour = scan.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = scan.nextDouble();

        RentalService rentalService = new RentalService(pricerPerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("FATURA: ");
        System.out.println("Pagamento basico: " + cr.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + cr.getInvoice().getTax());
        System.out.println("Pagamento total: " + cr.getInvoice().getTotalPayment());
        scan.close();
    }
}

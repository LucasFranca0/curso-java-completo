package Temas.interfaces.exercicio.application;

import Temas.interfaces.exercicio.model.entities.Contract;
import Temas.interfaces.exercicio.model.entities.Installment;
import Temas.interfaces.exercicio.service.ContractService;
import Temas.interfaces.exercicio.service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Numero: ");
        int numero = scan.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(scan.next(), fmt);
        System.out.print("Valor do contrato: ");
        double valorContrato = scan.nextDouble();

        Contract contract = new Contract(numero, data, valorContrato);


        System.out.print("Entre com o numero de parcelas: ");
        int parcelas = scan.nextInt();

        ContractService service = new ContractService(new PaypalService());

        service.processContract(contract, parcelas);

        System.out.println("Parcelas:");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        scan.close();
    }
}

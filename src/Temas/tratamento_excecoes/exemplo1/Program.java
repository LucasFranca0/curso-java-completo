package Temas.tratamento_excecoes.exemplo1;


import Temas.tratamento_excecoes.exemplo1.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// Solução ruim que retorna uma String no método da classe

public class Program {
    public static void main(String[] args) throws ParseException {

        Date now = new Date();
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int number = scan.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        // Chamada de método que pode gerar uma exceção
        // Opções: 1- Tratar a exceção(Try, Catch)
        // 2- Propagar a exceção colocando a palavra throws + classe da exceção
        Date checkIn = sdf.parse(scan.next());
        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(scan.next());

        if (checkIn.before(now)) {
            System.out.println("Error in reservation: the date has to be after or equal to the current date");
        } else if (!checkOut.after(checkIn)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(scan.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(scan.next());


            String error = reservation.updateDate(checkIn, checkOut);

            if (error != null) {
                System.out.println("Error in reservation: " + error);
            } else {
                System.out.println("Reservation: " + reservation);
            }
            scan.close();
        }
    }
}
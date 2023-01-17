package Temas.tratamento_excecoes.exemplo2.model;


import Temas.tratamento_excecoes.exemplo2.model.entities.Reservation;
import Temas.tratamento_excecoes.exemplo2.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
// Solução ruim que retorna uma String no método da classe

public class Program {
    public static void main(String[] args) {

        Scanner scan = null;

        try {
            Date now = new Date();
            scan = new Scanner(System.in);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            System.out.print("Room number: ");
            int number = scan.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(scan.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(scan.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(scan.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(scan.next());


            reservation.updateDate(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        } catch (ParseException e) {
            System.out.println("Invalid date format");
        }
        // Exceção com mensagem personalizada
        catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        }
        // Tipo de exceção genérico para ser feito o upcastring para RuntimeException
        // Herança e upcasting
        catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }
        finally {
            if (scan != null) {
                scan.close();
            }
        }

    }

}


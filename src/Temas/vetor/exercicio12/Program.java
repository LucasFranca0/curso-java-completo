package Temas.vetor.exercicio12;

import Temas.vetor.exercicio12.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = scan.nextInt();
        Rent[] rents = new Rent[10];

        for (int i = 0; i < n; i++) {
            scan.nextLine();
            System.out.println("Rent #" + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Email: ");
            String email = scan.nextLine();
            System.out.print("Room: ");
            int room = scan.nextInt();

            System.out.println();
            rents[room] = new Rent(name, email);
        }

        System.out.println("\nBusy rooms: ");
        for (int i = 0; i < rents.length; i++) {
            if (rents[i] != null) {
                System.out.println(i + ": " + rents[i]);
            }
        }

        scan.close();
    }
}

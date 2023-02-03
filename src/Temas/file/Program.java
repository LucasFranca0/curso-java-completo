package Temas.file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// Classe File para ler arquivos
public class Program {
    public static void main(String[] args) {
        // Instancia o File com o endereço do arquivo
        File file = new File("C:\\Users\\Lucas\\Downloads\\in.txt");
        Scanner scan = null;
        try {
            scan = new Scanner(file);
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (scan != null) {
                scan.close();
            }
        }

    }
}

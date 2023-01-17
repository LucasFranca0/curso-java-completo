package Temas.tratamento_excecoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Finally

public class Program2 {
    public static void main(String[] args) {

        // Ler arquivo
        File file = new File("C:\\Programação\\Programação\\Java\\teste_arquivos_java\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            // Código básico para ler um arquivo
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            // "e.getMessage();" mostra a mensagem padrão
            // quando o arquivo não é encontrado
            System.out.println("Error opening file: " + e.getMessage());
        }
        // Bloco que deve ser executado independente do Try ter dado certo ou não
        finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("Finally block executed");
        }
    }
}

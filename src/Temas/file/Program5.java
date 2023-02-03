package Temas.file;

import java.io.File;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();
        File path = new File(strPath);
        // Caminho completo junto do nome do arquivo
        System.out.println("getPath: " + path.getPath());
        // Mostra só o caminho ignorando o nome
        System.out.println("getParent: " + path.getParent());
        // Mostra apenas o nome do arquivo
        System.out.println("getName: " + path.getName());
    }
}

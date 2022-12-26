package Temas.dados;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {

        // Converter a localidade para Estados unidos. Utiliza-se "." em vez de "," como no Brasil.
        Locale.setDefault(Locale.US);
        // Scanner para entrada de Temas.concatenacao.dados
        Scanner scan = new Scanner(System.in);
        String x;
        int y;
        double z;
        char c;

        // String
        System.out.println("Digite algo: ");
        x = scan.next();
        System.out.println("Você digitou: " + x);

        // Integer
        System.out.println("Digite um número: ");
        y = scan.nextInt();
        System.out.println("Você digitou: " + y);

        // Double
        System.out.println("Digite um valor: ");
        z = scan.nextDouble();
        System.out.println("Você digitou: " + z);

        // Character
        // charAt(0) pega o primeiro character do String
        System.out.println("Digite um caractere: ");
        c = scan.next().charAt(0);
        System.out.println("Você digitou: " + c);

        // Vários Temas.concatenacao.dados na mesma linha. Só digitar os Temas.concatenacao.dados e separá-los por espaço.
        x = scan.next();
        y = scan.nextInt();
        z = scan.nextDouble();
        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


        // Quebra de linha com NextLine
        // Necessário utilizar um nextLine depois do nextInt, pois ele consome um NextLine ao apertar enter
        String a, b, d;
        y = scan.nextInt();
        scan.nextLine();
        a = scan.nextLine();
        b = scan.nextLine();
        d = scan.nextLine();

        System.out.println("DADOS DIGITADOS: ");
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);

        // Fechar o Scanner quando não for mais utilizar
        scan.close();

    }
}

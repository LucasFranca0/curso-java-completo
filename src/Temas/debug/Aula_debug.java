package Temas.debug;

import java.util.Locale;
import java.util.Scanner;

/*
 Para marcar uma linha de breakpoint:
     Run -> Toggle breakpoint

 Para iniciar o debug:
     Botão direito na classe -> Debug ou no canto superior direito, icone de debug.

 Para executar uma linha:
     F7

 Para interromper o debug:
     Botão de Stop

 */
public class Aula_debug {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double largura = scan.nextDouble();
        double comprimento = scan.nextDouble();
        double metroQuadrado = scan.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);
        scan.close();
    }
}

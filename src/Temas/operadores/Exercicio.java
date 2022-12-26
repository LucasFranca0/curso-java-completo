package Temas.operadores;

import java.util.Locale;
import java.util.Scanner;

// Operadores de atribuição cumulativa
// Exercicio para calcular a conta de telefone.
// 100 minutos por 50R$. Se passar de 100 minutos, cada minuto excedente custará 2R$
public class Exercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe os minutos: ");
        int minutos = scan.nextInt();

        double conta = 50.0;
        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }

        System.out.printf("Valor da conta = R$ %.2f\n", conta);

        scan.close();
    }
}

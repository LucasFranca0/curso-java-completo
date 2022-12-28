package Temas.operadores_bitwise;

import java.util.Scanner;

/*
 * &  = Operação "E" bit a bit
 * | = Operação "OU" bit a bit
 * ^ = Operação "OU-exclusiv" bit a bit
 *
 * Ele compara bit a bit (0 e 1) e vai fazendo comparações
 * e retorna o valor das comparações em um número, por exemplo: 89 & 60 = 24
 *
 * Aplicação comum: programação de baixo nível, micro-controlador, arduino, programação de interface com rede.
 * Usado também para verificar um bit do endereço de rede
 */
public class Aula {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1 = 89;
        int n2 = 60;

        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);

        // Testar valor de bit

        // O número 32 tem o 6 bit como 1 e os outros como 0.
        // Se o número digitado tiver o 6 bit(de trás para frente) como 1, então será true, senão false.
        int mask = 32;
        int n = scan.nextInt();

        if ((n & mask) != 0) {
            System.out.println("6th bit is true!");
        }
        else {
            System.out.println("6th bit is false!");
        }
        scan.close();
    }
}

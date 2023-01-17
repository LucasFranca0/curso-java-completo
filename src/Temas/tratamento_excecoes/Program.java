package Temas.tratamento_excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    // Tratamento de exceções
    - Try, Catch, Finally
    -  stack trace - pilha de chamadas de método:
    É quando um método é chamado por outro método, que chama outro método
 */
public class Program {
    public static void main(String[] args) {

        method1();
        System.out.println("End of program");
    }

    public static void method1() {
        System.out.println("****Start Method1****");
        method2();
        System.out.println("****End Method1****");
    }

    public static void method2() {
        System.out.println("****Start Method2****");
        Scanner sc = new Scanner(System.in);
        // Try é a parte onde fica o código que pode gerar uma exceção
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        // Fica o tratamento da exceção para o programa continuar rodando mesmo com o erro
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
            // Imprime na tela o rastreamento do stack
            e.printStackTrace();
            sc.next();

        } catch (InputMismatchException e) {
            System.out.println("Input error");
        }

        sc.close();
        System.out.println("****End Method2****");
    }
}

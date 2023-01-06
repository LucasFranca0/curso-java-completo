package Temas.boxing_unboxing;

/*
Boxing: é o processo de conversão de um objeto tipo valor para
um objeto tipo referência compatível.

Unboxing: É o processo de conversão de um objeto tipo
referência para um objeto tipo valor compatível

Wrapper classes

- São classes equivalentes ao tipos primitivos
- Boxing e unboxing é natural na linguagem
- Uso comum: campos de entidades em sistema de informação (IMPORTANTE!)
  - Pois tipos referência (classes) aceitam valor null e usufruem dos recursos OO

** **

 */
public class Program {
    public static void main(String[] args) {

        int x = 20;

        //Integer obj = x; // Wrapper classes auxilia no boxing e unboxing
        // em vez de fazer o exemplo abaixo, poderia simplesmente fazer 'Integer obj = x;'

        Object obj = x; // Boxing

        System.out.println(obj);

        int y = (int) obj; // Unboxing
        System.out.println(y);


    }
}

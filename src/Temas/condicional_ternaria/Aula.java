package Temas.condicional_ternaria;


// If ternário
public class Aula {
    public static void main(String[] args) {

        double preco = 34.5;
        double desconto;

        // If - Else Padrão //
        if (preco < 20.0) {
            desconto = preco * 0.1;
        } else {
            desconto = preco * 0.05;
        }
        System.out.println(preco - desconto);

        // If - Else ternario //
        desconto = (preco < 20.0)? (preco * 0.1) : (preco * 0.05);

        System.out.println(preco - desconto);
    }
}

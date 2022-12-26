package Temas.escopo;

/*
 * Escopo de variável é a região do programa onde a variável é válida, ou seja,
 * onde ela pode ser referenciada
 */
public class Aula {
    public static void main(String[] args) {

        // price pode ser acessada por toda a classe
        double price = 400.00;
        double discount;

        if (price < 200.00) {
            // discount só irá existir dentro desse if
             discount = price * 0.1;
        }
        else {
            discount = 0;
        }

        System.out.println(discount);

    }
}

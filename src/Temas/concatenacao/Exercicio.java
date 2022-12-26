package Temas.concatenacao;

import java.util.Locale;

public class Exercicio {
    public static void main(String[] args) {
        double x = Math.random();
        String nome = "Lucas";
        int idade = 22;
        double renda = 4000.0;

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n%n", nome, idade, renda);

        // Exercicio concatenar as variáveis abaixo pelo souf

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        // Char é declarado entre '' aspas simples
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Product:%n%s, wich price is $ %.2f%n%s, wich price is $ %.2f%n%n", product1, price1, product2, price2);
        System.out.printf("Record:%n%d years old, code %s and gender: %s%n%n", age, code, gender);
        System.out.printf("Measue with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);

        // Configurar localização para ajustar a formatação de valor para "." em vez de ","
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);
    }
}

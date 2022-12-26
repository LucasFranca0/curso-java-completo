package Temas.concatenacao;

import java.util.Locale;

public class Aula {
    public static void main(String[] args) {
        double x = 10.35723;
        System.out.println("Hello world!");

        // "printf" pega por padrão o formato do computador que estiver usando
        // para formatar as casas decimais.
        // "%.2f" para duas casas decimais  e "%n" para quebra de linha
        System.out.printf("%.4f%n", x);

        // Configurar localização para ajustar a formatação
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);

        // Concatenar elementos com "printf"
        System.out.printf("RESULTADO = %.2f metros%n", x);

        // Concatenar vários elementos
    }
}
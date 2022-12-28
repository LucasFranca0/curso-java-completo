package Temas.funcoes_para_string;

// toLowerCase() = deixa a String com letras minusculas
// toUpperCase() = deixa a String com letras maiusculas
// trim() = elimina os espaços nos cantos da String
// substring() = recebe um valor no "()" e informa a partir de qual characterer em diante irá exibir
// replace() = troca um valor por outro. No caso abaixo, troca 'a' por 'x'.

public class Aula {
    public static void main(String[] args) {

        // Declaração de variáveis

        String original = "abcde FGHIJ ABC abc DEFG       ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.trim().substring(2);
        // irá começar do character 2 até o 9
        String s05 = original.trim().substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");

        // Imprimindo valores

        System.out.println("Original: -" + original + " -");
        System.out.println("toLowerCase: -" + s01 + " -");
        System.out.println("toUpperCase: -" + s02 + " -");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
    }
}

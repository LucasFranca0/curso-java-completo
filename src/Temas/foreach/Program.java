package Temas.foreach;

// Laço que percorre todos os elementos de um Array
public class Program {
    public static void main(String[] args) {

        String[] words = new String[]{"eat", "tea", "tan", "ate", "nat"};

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        // Tem o mesmo efeito do For acima, porém o apelido "word" que vai servir como elemento do array
        for (String word : words) {
            System.out.println(word);
        }
    }
}

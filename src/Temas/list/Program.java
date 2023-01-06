package Temas.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
  List é uma estrutura de dados parecida com Array,
  porém ela tem algumas particularidadas.

  - List é do tipo interface, por isso não pode ser instanciada, é necessário implementá-la.
  Classes que implementam: ArrayList, LinkedList, etc.

  - List não aceita tipos primitivos.

 */
public class Program {
    public static void main(String[] args) {

        // Necessário instanciar com uma classe que implementa essa interface,
        // como abaixo: ArrayList, que pega algumas características de um vetor, como acesso
        // a dados por posição, e não sequencial como de uma List normal.
        List<String> list = new ArrayList<>();

        // Adicionando dados a lista
        list.add("Maria");
        list.add("Alex");
        list.add("Marco");
        list.add("Bob");
        list.add("Fred");
        list.add("Maria");
        list.add("Alexandre");
        list.add("Marconi");
        list.add("Arnaldo");

        // Inserir dados em uma determinada posição
        list.add(2, "Lucas");

        // Verificar tamanho da lista
        System.out.println(list.size());

        // Imprimir dados da lista
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------------------------");
        // remover elemento da lista
        list.remove("Lucas"); // ela consegue remover um dado comparado o valor dele com outro
        list.remove(1); // removendo por posição

        // Removendo por predicado. Função lambda
        list.removeIf(x -> x.charAt(0) == 'M'); /* remove todos que tiver a primeira letra iniciada com 'M' */

        for (String x : list) {
            System.out.println(x);
        }

        // Para encontrar a posição de um elemento usa-se 'indexOf'
        System.out.println("Index of Bob: " + list.indexOf("Bob")); // retorna a posição
        System.out.println("Index of Lucas: " + list.indexOf("Lucas")); // se não existe, retorna -1

        System.out.println("---------------------------------");
        // Filtrar a lista para exibir apenas elementos que iniciem com determinada letra, por exemplo.
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        // converte a lista para 'stream()' que aceita operações com expressões lambdas
        // 'Filter()' recebe o predicado (x -> x.charAt(0) == 'A') e devolve um stream() filtrado conforme predicado.
        // 'stream()' não é compatível com 'list', temos que pegar ele e converter de novo para 'list'
        // Para converter, chama-se o collect

        for (String x : result) {
            System.out.println(x);
        }

        // Encontrar primeiro elemento de acordo com o predicado
        System.out.println("-----------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}

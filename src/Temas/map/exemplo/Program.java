package Temas.map.exemplo;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        // Inserir
        // Chave e Valor
        cookies.put("username", "Maria");
        cookies.put("email", "maria@gamail.com");
        cookies.put("phone", "99773211");

        // remover do Map pela chave
        cookies.remove("email");

        cookies.put("phone", "2131232913");

        // Verifica se contém um valor
        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));

        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println("ALL COOKIES:");
        for(String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}

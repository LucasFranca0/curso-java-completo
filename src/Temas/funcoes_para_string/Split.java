package Temas.funcoes_para_string;

// Split é uma função que serve para recortar uma String
public class Split {
    public static void main(String[] args) {
        String s = "potato apple lemon orange";

        // Vai cortar em várias partes separadas pelo espaço " " e guardar num vetor
        String[] vect = s.split(" ");

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);
    }
}

package Temas.dados;

public class Aula {
    public static void main(String[] args) {
        int x, y;

        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.println(y);




        // Area Trapézio //
        double b, B, h, area;

        // Boa prática double utilizar ".0"
        b = 6.0;
        B = 8.0;
        h = 5.0;
        area = (b + B) / 2.0 * h;
        System.out.println("Área do trapézio: " + area);

        // Boa prática float //

        float b1, B1, h1, area1;
        b1 = 6f;
        B1 = 8f;
        h1 = 5f;
        area1 = (b1 + B1) / 2f * h1;
        System.out.println("Área do trapézio: " + area);


        // Casting - Conversão de valores de int para double
        // Exemplo 1
        int z = 5;
        double d = 2 * x;
        System.out.println(z);
        System.out.println(d);

        // Exemplo 2
        int a1, b2;
        double resultado;
        a1 = 5;
        b2 = 2;
        resultado = (double) a1 / b2;
        System.out.println("Casting. Resultado: " + resultado);

        // Exemplo 3
        double a3;
        int b3;

        a3 = 5.0;
        b3 = (int) a3;
        System.out.println("Casting de double para int: " + b3);

    }
}

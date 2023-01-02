package Temas.poo;

// O prefixo "public" indica que o atributo ou método
// pode ser usado em outros arquivos
public class Triangle {

        // Atributos de uma classe
        public double a;
        public double b;
        public double c;

        // Método de uma classe
        public double area() {
                double p = (a + b + c) / 2.0;
                return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
}

package Temas.poo.membros_estáticos;

// Membros estáticos =  é independente de instância para funcionar. Pode ser chamado diretamente pelo nome da classe.
// como o Math.sqrt(), por exemplo. 2

// Conversor de dolar
public class CurrencyConverter {

    public static final int IOF = 6;
    public static double resultado;

    // Converte o dolar e adiciona IOF
    public static double convertDolar(double valorDolar, double quantidade) {
       return resultado = valorDolar * quantidade;
    }

    public static double conversaoIof() {
       return resultado += (resultado * IOF) / 100;
    }



}

package Temas.estruturas_repititivas;


/*
    Enquanto a condição for verdadeira irá executar os comandos que estiver dentro do While.
 */
public class While {
    public static void main(String[] args) {

       double x = 100;
       double y = 100;

        while (x != y){
            System.out.println("olha");
            x = Math.sqrt(y);
        }

        System.out.println("Não acontece nada. Pois o valor de x não é diferente de y");

        while (x == y){
            System.out.println("olha");
            x = Math.sqrt(y);
            System.out.println("Raiz quadrada de y: " + x);
        }
    }

}

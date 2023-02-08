package Temas.equals_and_hashCode;

  /*      Equals
         Método que compara se o objeto é igual a outro,retornando**true**ou**false**.

         Hash code
         Método que retorna um número inteiro representando um código gerado
         a partir das informações do objeto
*/
public class Program {
    public static void main(String[] args) {
        String a = "Maria";
        String b = "Alex";
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}

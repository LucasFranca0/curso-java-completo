package Temas.tratamento_excecoes.exemplo2.model.exceptions;


/*
// Classe criada para exceção personalizada //
//Exceções Implícitas:
 Exceções que não precisam de tratamento e demonstram serem contornáveis.
 Esse tipo origina-se da subclasse Error ou RunTimeException.

// Explícitas: Exceções que precisam ser tratadas e apresentam
  condições incontornáveis. Esse tipo origina do modelo throw e necessita
  ser declarado pelos métodos. É originado da subclasse Exception
  ou IOException.
 */

// Poderia usar tanto RuntimeException ou Exception
public class DomainException extends RuntimeException {

    // Para permitir que possa instanciar a exceção personalizada
    // passando uma mensagem para ela
    public DomainException(String message) {
        super(message);
    }
}

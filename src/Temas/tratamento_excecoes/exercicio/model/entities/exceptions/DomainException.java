package Temas.tratamento_excecoes.exercicio.model.entities.exceptions;

public class    DomainException extends Exception {

    // Construtor para receber uma mensagem e assim personalizar a exceção
    public DomainException(String message) {
        super(message);
    }
}

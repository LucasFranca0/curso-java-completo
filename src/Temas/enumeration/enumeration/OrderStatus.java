package Temas.enumeration.enumeration;

/*
  ENUMERATIONS
  - É um tipo especial que serve para especificar de forma literal um conjunto
  de constantes relacionadas.

   - Palavra chave em Java: enum
   - Vantagem: melhor semântica, código mais legível e auxiliado pelo compilador.
 */

public enum OrderStatus {
    PENDING_PAYMENT,
    PROCESSING,
    SHIPPED,
    DELIVERED;
}

package Temas.interfaces.exercicio.service;

public interface OnlinePaymentService {
    Double paymentFee(Double amount);
    Double interest(Double amount, Integer months);
}

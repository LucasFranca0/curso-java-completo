package Temas.interfaces.exercicio.service;

import Temas.interfaces.exercicio.model.entities.Contract;
import Temas.interfaces.exercicio.model.entities.Installment;

import java.time.LocalDate;


public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
        double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.interest(basicQuota, i);
            double paymentFee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + paymentFee;
            contract.getInstallments().add(new Installment(dueDate, quota));
        }
    }
}

package s16Interfaces.Exercicio001.model.entities.services;

public interface OnlinePaymentService {
    double paymentFee(double amount);

    double interest(double amount, int months);

}

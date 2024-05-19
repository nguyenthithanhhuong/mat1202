package lab10.strategy.ex01;

public interface PayStrategy {
    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}
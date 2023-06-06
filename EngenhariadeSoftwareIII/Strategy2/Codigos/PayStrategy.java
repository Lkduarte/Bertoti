package EngenhariadeSoftwareIII.Strategy2.Codigos;

public interface PayStrategy {
    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}

package EngenhariadeSoftwareIII.Strategy2;

public interface PayStrategy {
    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}

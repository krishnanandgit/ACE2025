package Payment;


public class PaymentNotFoundException {
    private String message;

    public PaymentNotFoundException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "PaymentNotFoundException: " + message;
    }
}

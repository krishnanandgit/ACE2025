package Payment;


public class InvalidPaymentAmountException {
    private String message;

    public InvalidPaymentAmountException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "InvalidPaymentAmountException: " + message;
    }
}

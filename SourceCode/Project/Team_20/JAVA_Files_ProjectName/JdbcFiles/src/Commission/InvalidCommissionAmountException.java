package Commission;


public class InvalidCommissionAmountException {
    private String message;

    public InvalidCommissionAmountException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

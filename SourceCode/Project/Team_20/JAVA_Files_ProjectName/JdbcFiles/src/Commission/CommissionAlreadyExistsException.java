package Commission;

public class CommissionAlreadyExistsException {
    private String message;

    public CommissionAlreadyExistsException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

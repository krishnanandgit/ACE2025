package Commission;


public class CommissionNotFoundException {
    private String message;

    public CommissionNotFoundException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

package items;

public class InvalidItemException {
    private String message;

    public InvalidItemException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

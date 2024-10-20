package items;

public class ItemNotFoundException {
    private String message;

    public ItemNotFoundException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

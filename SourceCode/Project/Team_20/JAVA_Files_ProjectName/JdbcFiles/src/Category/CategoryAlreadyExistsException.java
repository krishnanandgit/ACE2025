package Category;


public class CategoryAlreadyExistsException {
    private String message;

    public CategoryAlreadyExistsException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

package Category;


public class CategoryNotFoundException {
    private String message;

    public CategoryNotFoundException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

package Review;

public class ReviewAlreadyExistsException {
    private String message;

    public ReviewAlreadyExistsException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ReviewAlreadyExistsException: " + message;
    }
}

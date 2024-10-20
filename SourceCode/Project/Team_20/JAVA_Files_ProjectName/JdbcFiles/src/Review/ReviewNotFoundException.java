package Review;

public class ReviewNotFoundException {
    private String message;

    public ReviewNotFoundException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ReviewNotFoundException: " + message;
    }
}

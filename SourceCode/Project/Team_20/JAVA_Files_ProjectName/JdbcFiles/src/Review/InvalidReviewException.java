package Review;


public class InvalidReviewException {
    private String message;

    public InvalidReviewException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "InvalidReviewException: " + message;
    }
}

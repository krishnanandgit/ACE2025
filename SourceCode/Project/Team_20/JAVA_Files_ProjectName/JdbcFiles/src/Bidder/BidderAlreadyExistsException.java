package Bidder;

public class BidderAlreadyExistsException {
    private String message;

    public BidderAlreadyExistsException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String toString() {
        return "BidderAlreadyExistsException: " + message;
    }
}

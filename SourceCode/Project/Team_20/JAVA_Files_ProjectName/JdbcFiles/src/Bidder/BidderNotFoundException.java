package Bidder;

public class BidderNotFoundException {

    private String message;

    public BidderNotFoundException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "BidderNotFoundException: " + message;
    }
}

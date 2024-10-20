package auction;

public class AuctionAlreadyExistsException {
    private String message;

    public AuctionAlreadyExistsException(String message) {
        this.message = message;
    }

    public String toString() {
        return "AuctionAlreadyExistsException: " + message;
    }
}
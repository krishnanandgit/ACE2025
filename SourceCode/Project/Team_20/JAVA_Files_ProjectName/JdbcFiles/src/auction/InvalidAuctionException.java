package auction;
public class InvalidAuctionException {
    private String message;

    public InvalidAuctionException(String message) {
        this.message = message;
    }

    public String toString() {
        return "InvalidAuctionException: " + message;
    }
}

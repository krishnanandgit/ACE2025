package Auctioneer;
public class AuctioneerException {
    private String message;
    public AuctioneerException(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

    public String toString() {
        return "AuctioneerException: " + message;
    }
}

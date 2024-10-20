package auction;
public class AuctionNotFoundException {
    private String message;

    public AuctionNotFoundException(String message) {
        this.message = message;
    }

    
    public String toString() {
        return "AuctionNotFoundException: " + message;
    }
}

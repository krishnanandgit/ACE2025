import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Auction {
    private Item item;
    private Date startTime;
    private Date endTime;
    private Auctioneer auctioneer;
    private List<Bid> bids = new ArrayList<>();
    private double highestBid;
    private Bidder highestBidder;
    public Auction(Item item, Date startTime, Date endTime, Auctioneer auctioneer) {
        this.item = item;
        this.startTime = startTime;
        this.endTime = endTime;
        this.auctioneer = auctioneer;
        this.highestBid = item.getStartingBid();
    }
    public boolean placeBid(Bid bid) {
        if (new Date().before(endTime) && bid.getAmount() > highestBid) {
            highestBid = bid.getAmount();
            highestBidder = bid.getBidder();
            bids.add(bid);
            return true;
        }
        return false;
    }
    public double getHighestBid() {
        return highestBid;
    }
    public Bidder getHighestBidder() {
        return highestBidder;
    }
}

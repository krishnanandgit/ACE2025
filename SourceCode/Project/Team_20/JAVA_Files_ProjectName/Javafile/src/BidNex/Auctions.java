package Demo;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Auctions {
    private static final MinimumBidIncrementException AuctionUtility = null;
	private Item item;
    private Date startTime;
    private Date endTime;
    private Auctioneer auctioneer;
    private double highestBid;
    private Bidder highestBidder;
    private String status;

    public Auctions(Item item, Date startTime, Date endTime, Auctioneer auctioneer)
            throws InvalidStartDateException, InvalidEndDateException, InvalidStartingBidException {
        if (startTime.before(new Date())) {
            throw new InvalidStartDateException("Auction start date must be in the future.");
        }
        if (endTime.before(startTime)) {
            throw new InvalidEndDateException("Auction end date must be after the start date.");
        }
        if (item.getStartingBid() <= 0) {
            throw new InvalidStartingBidException("Starting bid must be greater than zero.");
        }
        this.item = item;
        this.startTime = startTime;
        this.endTime = endTime;
        this.auctioneer = auctioneer;
        this.highestBid = item.getStartingBid();
        this.status = "Upcoming"; // Initial status
    }

    public boolean placeBid(Bidder bid) throws MinimumBidIncrementException, InvalidAuctionStatusException {
        if (!"Ongoing".equals(this.status)) {
            throw new InvalidAuctionStatusException("Bids can only be placed on ongoing auctions.");
        }
        if (new Date().before(endTime) && bid.getAmount() > highestBid) {
            double minIncrement = AuctionUtility.calculateMinimumBidIncrement(highestBid);
            if (bid.getAmount() < highestBid + minIncrement) {
                throw new MinimumBidIncrementException("Bid must be at least " + minIncrement + " higher than the current highest bid.");
            }
            highestBid = bid.getAmount();
            highestBidder = bid.getBidder();
            Bidder.add(bid);
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

    public Item getItem() {
        return item;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public Auctioneer getAuctioneer() {
        return auctioneer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) throws InvalidAuctionStatusException {
        if (!isValidStatusTransition(this.status, status)) {
            throw new InvalidAuctionStatusException("Invalid status transition from " + this.status + " to " + status);
        }
        this.status = status;
    }

    private boolean isValidStatusTransition(String currentStatus, String newStatus) {
        switch (currentStatus) {
            case "Upcoming":
                return "Ongoing".equals(newStatus) || "Cancelled".equals(newStatus);
            case "Ongoing":
                return "Closed".equals(newStatus) || "Cancelled".equals(newStatus);
            case "Closed":
                return false; // Closed auctions cannot transition to any other status
            default:
                return false;
        }
    }
}

class AuctionNotFoundException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AuctionNotFoundException(String message) {
        super(message);
    }
}

class InvalidAuctionStatusException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAuctionStatusException(String message) {
        super(message);
    }
}

class InvalidStartDateException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidStartDateException(String message) {
        super(message);
    }
}

class InvalidEndDateException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidEndDateException(String message) {
        super(message);
    }
}

class InvalidStartingBidException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidStartingBidException(String message) {
        super(message);
    }
}

class MinimumBidIncrementException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MinimumBidIncrementException(String message) {
        super(message);
    }
    public static void validateAuctionDates(Date startDate, Date endDate)
            throws InvalidStartDateException, InvalidEndDateException {
        if (startDate.before(new Date())) {
            throw new InvalidStartDateException("Auction start date must be in the future.");
        }
        if (endDate.before(startDate)) {
            throw new InvalidEndDateException("Auction end date must be after the start date.");
        }
    }
    public double calculateMinimumBidIncrement(double currentHighestBid) throws MinimumBidIncrementException {
        double minIncrement = currentHighestBid * 0.05; // 5% of the current highest bid
        if (minIncrement <= 0) {
            throw new MinimumBidIncrementException("Minimum bid increment must be greater than zero.");
        }
        return minIncrement;
    }

   
    private static Map<Integer, Auctioneer> auctioneerMap = new HashMap<>();
    private static Map<String, Auctioneer> emailMap = new HashMap<>();

    public static boolean isEmailDuplicate(String email) {
        return emailMap.containsKey(email);
    }

    public static void addAuctioneer(Auctioneer auctioneer) {
        auctioneerMap.put(auctioneer.getUserId(), auctioneer);
        emailMap.put(auctioneer.getEmail(), auctioneer);
    }

    public static void addAuction(Auction auction) {
    }


    
    
    
    
    
    public static boolean checkAuctionEligibility(String auctionID) throws AuctionNotFoundException, InvalidAuctionStatusException {
        Auction auction = findAuctionByID(auctionID);
        if (!"Ongoing".equals(auction.getStatus())) {
            throw new InvalidAuctionStatusException("Auction is not eligible for bidding as it is not 'Ongoing'.");
        }
        return true;
    }

    private static Auction findAuctionByID(String auctionID) {
		// TODO Auto-generated method stub
		return null;
	}



	// Validate Starting Bid
    public static void validateStartingBid(double startingBid) throws InvalidStartingBidException {
        if (startingBid <= 0) {
            throw new InvalidStartingBidException("Starting bid must be greater than zero.");
        }
    }

   }



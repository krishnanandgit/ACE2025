package Demo;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Commission {
    private Auction auction;
    private double commissionRate;

    public Commission(Auction auction, double commissionRate) throws InvalidCommissionRateException, InvalidAuctionIDException {
        if (commissionRate < 0 || commissionRate > 100) {
            throw new InvalidCommissionRateException("Commission rate must be between 0 and 100.");
        }
        if (auction == null || auction.getAuctionID() == null) {
            throw new InvalidAuctionIDException("Invalid auction ID.");
        }
        this.auction = auction;
        this.commissionRate = commissionRate;
    }

    public Commission(Auctions auction2, double commissionRate2) {
	}

	public double calculateCommission() throws InvalidSalePriceException {
        if (auction.getHighestBid() <= 0) {
            throw new InvalidSalePriceException("Sale price must be greater than zero.");
        }
        return auction.getHighestBid() * (commissionRate / 100);
    }

    public Auction getAuction() {
        return auction;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) throws InvalidCommissionRateException {
        if (commissionRate < 0 || commissionRate > 100) {
            throw new InvalidCommissionRateException("Commission rate must be between 0 and 100.");
        }
        this.commissionRate = commissionRate;
    }
}

class CommissionNotFoundException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public CommissionNotFoundException(String message) {
        super(message);
    }
}

class InvalidSalePriceException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidSalePriceException(String message) {
        super(message);
    }
}

class InvalidCommissionRateException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidCommissionRateException(String message) {
        super(message);
    }
}

class InvalidAuctionIDException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAuctionIDException(String message) {
        super(message);
    }



    private Map<String, Commission> commissionMap = new HashMap<>();

    public double calculateCommissionAmount(String auctionID) throws CommissionNotFoundException, InvalidSalePriceException {
        Commission commission = getCommissionByID(auctionID);
        return commission.calculateCommission();
    }

    public void createCommissionRecord(Auction auction, double commissionRate) throws InvalidCommissionRateException, InvalidAuctionIDException {
        Commission commission = new Commission(auction, commissionRate);
        commissionMap.put(auction.getAuctionID(), commission);
    }

    public Commission getCommissionByID(String auctionID) throws CommissionNotFoundException {
        if (!commissionMap.containsKey(auctionID)) {
            throw new CommissionNotFoundException("Commission not found for auction ID: " + auctionID);
        }
        return commissionMap.get(auctionID);
    }

    public void validateCommissionRate(double rate) throws InvalidCommissionRateException {
        if (rate < 0 || rate > 100) {
            throw new InvalidCommissionRateException("Commission rate must be between 0 and 100.");
        }
    }

    public void validateSalePrice(double salePrice) throws InvalidSalePriceException {
        if (salePrice <= 0) {
            throw new InvalidSalePriceException("Sale price must be greater than zero.");
        }
    }

    public void updateCommissionRate(String auctionID, double newRate) throws CommissionNotFoundException, InvalidCommissionRateException {
        Commission commission = getCommissionByID(auctionID);
        commission.setCommissionRate(newRate);
    }
}

class Auction {
    private String auctionID;
    private double highestBid;

    public Auction(String auctionID, double highestBid) {
        this.auctionID = auctionID;
        this.highestBid = highestBid;
    }

    public Auction(Item item1, Date date, Date date2, Auctioneer auctioneer) {
	}

	public String getAuctionID() {
        return auctionID;
    }

    public double getHighestBid() {
        return highestBid;
    }

	public void setStatus(String newStatus) {
		
	}

	public Object getStatus() {
		return null;
	}
}

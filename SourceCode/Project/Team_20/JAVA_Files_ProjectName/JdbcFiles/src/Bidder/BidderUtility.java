package Bidder;

	public class BidderUtility {
	    private BidderDAO bidderDAO;

	    public BidderUtility() {
	        bidderDAO = new BidderDAO();
	    }

	    public void addBidder(int bidderId, String username, String email, String password) {
	        bidder newBidder = new bidder(bidderId, username, email, password);
	        bidderDAO.addBidder(newBidder);
	    }

	    public bidder getBidder(int bidderId) {
	        return bidderDAO.getBidderById(bidderId);
	    }

	    public void updateBidder(int bidderId, String newUsername, String newEmail, String newPassword) {
	        bidderDAO.updateBidder(bidderId, newUsername, newEmail, newPassword);
	    }

	    public void deleteBidder(int bidderId) {
	        bidderDAO.deleteBidder(bidderId);
	    }

	    public void displayBidders() {
	        bidderDAO.displayAllBidders();
	    }
	}

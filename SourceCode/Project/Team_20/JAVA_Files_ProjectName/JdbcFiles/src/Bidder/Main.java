package Bidder;

public class Main {
    public static void main(String[] args) {
        BidderDAO bidderDAO = new BidderDAO();

        bidderDAO.addBidder(new bidder(1, "JohnDoe", "john@example.com", "password123"));
        bidderDAO.addBidder(new bidder(2, "JaneDoe", "jane@example.com", "password456"));

        bidderDAO.displayAllBidders();

        bidderDAO.updateBidder(1, "JohnUpdated", "john.updated@example.com", "newpassword");

        bidderDAO.displayAllBidders();

        bidder bidder = bidderDAO.getBidderById(1);
        if (bidder != null) {
            System.out.println("Fetched bidder: " + bidder);
        }

        bidderDAO.deleteBidder(2);

        bidderDAO.displayAllBidders();
    }
}

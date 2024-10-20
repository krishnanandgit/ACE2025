package auction;

public class auctionUtility {


    private AuctionDAO auctionDAO;

    public auctionUtility() {
        auctionDAO = new AuctionDAO();
    }

    public void addAuction(int auctionId, String startTime, String endTime, int status, int reservePrice) {
        Auction newAuction = new Auction(auctionId, startTime, endTime, status, reservePrice);
        auctionDAO.addAuction(newAuction);
    }

    public Auction getAuction(int auctionId) {
        return auctionDAO.getAuctionById(auctionId);
    }

    public void updateAuction(int auctionId, String newStartTime, String newEndTime, int newStatus, int newReservePrice) {
        auctionDAO.updateAuction(auctionId, newStartTime, newEndTime, newStatus, newReservePrice);
    }

    public void deleteAuction(int auctionId) {
        auctionDAO.deleteAuction(auctionId);
    }

    public void displayAuctions() {
        auctionDAO.displayAllAuctions();
    }
}

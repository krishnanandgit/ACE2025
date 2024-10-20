package Auctioneer;

public class AuctioneerUtility {
    private AuctioneerDAO auctioneerDAO;

    public AuctioneerUtility() {
        auctioneerDAO = new AuctioneerDAO();
    }

    public void addAuctioneer(int auctioneerId, String name, String contactInfo) {
        Auctioneer newAuctioneer = new Auctioneer(auctioneerId, name, contactInfo);
        auctioneerDAO.addAuctioneer(newAuctioneer);
    }

    public Auctioneer getAuctioneer(int auctioneerId) {
        return auctioneerDAO.getAuctioneerById(auctioneerId);
    }

    public void updateAuctioneer(int auctioneerId, String newName, String newContactInfo) {
        auctioneerDAO.updateAuctioneer(auctioneerId, newName, newContactInfo);
    }

    public void deleteAuctioneer(int auctioneerId) {
        auctioneerDAO.deleteAuctioneer(auctioneerId);
    }

    public void displayAuctioneers() {
        auctioneerDAO.displayAllAuctioneers();
    }
}

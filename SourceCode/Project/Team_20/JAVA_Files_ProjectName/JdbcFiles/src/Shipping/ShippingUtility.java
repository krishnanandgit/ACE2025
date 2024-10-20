package Shipping;


public class ShippingUtility {
    private ShippingDAO shippingDAO;

    public ShippingUtility() {
        shippingDAO = new ShippingDAO();
    }

    public void addShipping(int shippingId, int auctionId, int bidderId, int shippingStatus, String shippingAddress) {
        Shipping newShipping = new Shipping(shippingId, auctionId, bidderId, shippingStatus, shippingAddress);
        shippingDAO.addShipping(newShipping);
    }

    public Shipping getShipping(int shippingId) {
        return shippingDAO.getShippingById(shippingId);
    }

    public void updateShipping(int shippingId, int newAuctionId, int newBidderId, int newShippingStatus, String newShippingAddress) {
        shippingDAO.updateShipping(shippingId, newAuctionId, newBidderId, newShippingStatus, newShippingAddress);
    }

    public void deleteShipping(int shippingId) {
        shippingDAO.deleteShipping(shippingId);
    }

    public void displayShippings() {
        shippingDAO.displayAllShippings();
    }
}

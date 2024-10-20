package auction;


public class Main {
    public static void main(String[] args) {
        auctionUtility auctionUtility = new auctionUtility();

        auctionUtility.addAuction(1, "2024-10-17 10:00:00", "2024-10-17 18:00:00", 1, 500);
        auctionUtility.addAuction(2, "2024-10-18 09:00:00", "2024-10-18 17:00:00", 0, 300);

        auctionUtility.displayAuctions();

        auctionUtility.updateAuction(1, "2024-10-17 11:00:00", "2024-10-17 19:00:00", 1, 550);

        auctionUtility.displayAuctions();

        Auction auction = auctionUtility.getAuction(1);
        if (auction != null) {
            System.out.println("Fetched auction: " + auction);
        }

        auctionUtility.deleteAuction(2);

        auctionUtility.displayAuctions();
    }
}

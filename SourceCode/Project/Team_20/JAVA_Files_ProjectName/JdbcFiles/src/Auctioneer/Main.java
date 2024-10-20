package Auctioneer;

public class Main {
    public static void main(String[] args) {
        AuctioneerUtility auctioneerUtility = new AuctioneerUtility();

        auctioneerUtility.addAuctioneer(1, "John Doe", "john@example.com");
        auctioneerUtility.addAuctioneer(2, "Jane Smith", "jane@example.com");

        auctioneerUtility.displayAuctioneers();

        auctioneerUtility.updateAuctioneer(1, "Johnathan Doe", "johnathan@example.com");

        auctioneerUtility.displayAuctioneers();

        Auctioneer auctioneer = auctioneerUtility.getAuctioneer(1);
        if (auctioneer != null) {
            System.out.println("Fetched auctioneer: " + auctioneer);
        }

        auctioneerUtility.deleteAuctioneer(2);

        auctioneerUtility.displayAuctioneers();
    }
}

public class Commission 
{
    private Auction auction;
    private double commissionRate;

    public Commission(Auction auction, double commissionRate) 
    {
        this.auction = auction;
        this.commissionRate = commissionRate;
    }

    public double calculateCommission() 
    {
        return auction.getHighestBid() * commissionRate;
    }
}

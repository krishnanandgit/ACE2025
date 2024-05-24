public class Payment {
    private Auction auction;
    private double amount;
    private String paymentMethod;
    public Payment(Auction auction, double amount, String paymentMethod) {
        this.auction = auction;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }
    public Auction getAuction() {
        return auction;
    }
    public double getAmount() {
        return amount;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }
}

package Payment;


public class Payment {
    private int paymentId;
    private int amount;
    private String paymentDate;
    private int bidderId;
    private int auctionId;
    private int auctioneerId;

    public Payment(int paymentId, int amount, String paymentDate, int bidderId, int auctionId, int auctioneerId) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.bidderId = bidderId;
        this.auctionId = auctionId;
        this.auctioneerId = auctioneerId;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public int getBidderId() {
        return bidderId;
    }

    public void setBidderId(int bidderId) {
        this.bidderId = bidderId;
    }

    public int getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(int auctionId) {
        this.auctionId = auctionId;
    }

    public int getAuctioneerId() {
        return auctioneerId;
    }

    public void setAuctioneerId(int auctioneerId) {
        this.auctioneerId = auctioneerId;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", amount=" + amount +
                ", paymentDate='" + paymentDate + '\'' +
                ", bidderId=" + bidderId +
                ", auctionId=" + auctionId +
                ", auctioneerId=" + auctioneerId +
                '}';
    }
}

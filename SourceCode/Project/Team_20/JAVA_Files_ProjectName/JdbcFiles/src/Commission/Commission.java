package Commission;


public class Commission {
    private int commissionId;
    private int auctionId;
    private int commissionAmount;

    public Commission(int commissionId, int auctionId, int commissionAmount) {
        this.commissionId = commissionId;
        this.auctionId = auctionId;
        this.commissionAmount = commissionAmount;
    }

    public int getCommissionId() {
        return commissionId;
    }

    public void setCommissionId(int commissionId) {
        this.commissionId = commissionId;
    }

    public int getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(int auctionId) {
        this.auctionId = auctionId;
    }

    public int getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(int commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    @Override
    public String toString() {
        return "Commission{" +
                "commissionId=" + commissionId +
                ", auctionId=" + auctionId +
                ", commissionAmount=" + commissionAmount +
                '}';
    }
}

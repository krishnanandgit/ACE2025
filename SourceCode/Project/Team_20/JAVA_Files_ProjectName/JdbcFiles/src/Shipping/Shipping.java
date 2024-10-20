package Shipping;


public class Shipping {
    private int shippingId;
    private int auctionId;
    private int bidderId;
    private int shippingStatus;
    private String shippingAddress;

    public Shipping(int shippingId, int auctionId, int bidderId, int shippingStatus, String shippingAddress) {
        this.shippingId = shippingId;
        this.auctionId = auctionId;
        this.bidderId = bidderId;
        this.shippingStatus = shippingStatus;
        this.shippingAddress = shippingAddress;
    }

    public int getShippingId() {
        return shippingId;
    }

    public void setShippingId(int shippingId) {
        this.shippingId = shippingId;
    }

    public int getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(int auctionId) {
        this.auctionId = auctionId;
    }

    public int getBidderId() {
        return bidderId;
    }

    public void setBidderId(int bidderId) {
        this.bidderId = bidderId;
    }

    public int getShippingStatus() {
        return shippingStatus;
    }

    public void setShippingStatus(int shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @Override
    public String toString() {
        return "Shipping{" +
                "shippingId=" + shippingId +
                ", auctionId=" + auctionId +
                ", bidderId=" + bidderId +
                ", shippingStatus=" + shippingStatus +
                ", shippingAddress='" + shippingAddress + '\'' +
                '}';
    }
}

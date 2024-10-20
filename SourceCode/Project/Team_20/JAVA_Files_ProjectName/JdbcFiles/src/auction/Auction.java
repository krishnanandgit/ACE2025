package auction;
public class Auction {
    private int auctionId;
    private String startTime;
    private String endTime;
    private int status; 
    private int reservePrice;

    
    public Auction(int auctionId, String startTime, String endTime, int status, int reservePrice) {
        this.auctionId = auctionId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
        this.reservePrice = reservePrice;
    }

    public int getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(int auctionId) {
        this.auctionId = auctionId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getReservePrice() {
        return reservePrice;
    }

    public void setReservePrice(int reservePrice) {
        this.reservePrice = reservePrice;
    }

    public String toString() {
        return "Auction{" +
                "auctionId=" + auctionId +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", status=" + status +
                ", reservePrice=" + reservePrice +
                '}';
    }
}

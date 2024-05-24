public class Shipping {
    private Item item;
    private String address;
    private String trackingNumber;
    public Shipping(Item item, String address) {
        this.item = item;
        this.address = address;
    }
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }
    public String getTrackingNumber() {
        return trackingNumber;
    }
}

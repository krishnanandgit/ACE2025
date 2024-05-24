public class Tracking {
    private int tracking_id;
    private int shipment_id;
    private String location;
    private String date_time;
    private String tracking_status;

    public Tracking(int tracking_id, int shipment_id, String location, String date_time, String tracking_status) {
        this.tracking_id = tracking_id;
        this.shipment_id = shipment_id;
        this.location = location;
        this.date_time = date_time;
        this.tracking_status = tracking_status;
    }

    public int getTracking_id() {
        return tracking_id;
    }

    public void setTracking_id(int tracking_id) {
        this.tracking_id = tracking_id;
    }

    public int getShipment_id() {
        return shipment_id;
    }

    public void setShipment_id(int shipment_id) {
        this.shipment_id = shipment_id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public String getTracking_status() {
        return tracking_status;
    }

    public void setTracking_status(String tracking_status) {
        this.tracking_status = tracking_status;
    }

    public void displayTracking(){
        System.out.println("Tracking details:");
        System.out.println("Tracking_id : " + this.getTracking_id());
        System.out.println("Shipment_id : " + this.getShipment_id());
        System.out.println("Location : " + this.getLocation());
        System.out.println("Date_time : " + this.getDate_time());
        System.out.println("Tracking_status : " + this.getTracking_status());
    }
}

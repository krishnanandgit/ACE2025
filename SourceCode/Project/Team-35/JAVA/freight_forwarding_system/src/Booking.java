public class Booking {
    private int booking_ID;
    private int shipment_ID;
    private int container_ID;
    private int carrier_ID;
    private String booking_Date;
    private String departure_Date;
    private String arrival_Date;
    private String booking_Status;

    public Booking(int booking_ID, int shipment_ID, int container_ID, int carrier_ID, String booking_Date, String departure_Date, String arrival_Date, String booking_Status) {
        this.booking_ID = booking_ID;
        this.shipment_ID = shipment_ID;
        this.container_ID = container_ID;
        this.carrier_ID = carrier_ID;
        this.booking_Date = booking_Date;
        this.departure_Date = departure_Date;
        this.arrival_Date = arrival_Date;
        this.booking_Status = booking_Status;
    }

    public int getBooking_ID() {
        return booking_ID;
    }

    public void setBooking_ID(int booking_ID) {
        this.booking_ID = booking_ID;
    }

    public int getShipment_ID() {
        return shipment_ID;
    }

    public void setShipment_ID(int shipment_ID) {
        this.shipment_ID = shipment_ID;
    }

    public int getContainer_ID() {
        return container_ID;
    }

    public void setContainer_ID(int container_ID) {
        this.container_ID = container_ID;
    }

    public int getCarrier_ID() {
        return carrier_ID;
    }

    public void setCarrier_ID(int carrier_ID) {
        this.carrier_ID = carrier_ID;
    }

    public String getBooking_Date() {
        return booking_Date;
    }

    public void setBooking_Date(String booking_Date) {
        this.booking_Date = booking_Date;
    }

    public String getDeparture_Date() {
        return departure_Date;
    }

    public void setDeparture_Date(String departure_Date) {
        this.departure_Date = departure_Date;
    }

    public String getArrival_Date() {
        return arrival_Date;
    }

    public void setArrival_Date(String arrival_Date) {
        this.arrival_Date = arrival_Date;
    }

    public String getBooking_Status() {
        return booking_Status;
    }

    public void setBooking_Status(String booking_Status) {
        this.booking_Status = booking_Status;
    }

    public void displayBooking() {
        System.out.println("Booking details:");
        System.out.println("Booking_ID : " + this.getBooking_ID());
        System.out.println("Shipment_ID : " + this.getShipment_ID());
        System.out.println("Container_ID : " + this.getContainer_ID());
        System.out.println("Carrier_ID : " + this.getCarrier_ID());
        System.out.println("Booking_Date : " + this.getBooking_Date());
        System.out.println("Departure_Date : " + this.getDeparture_Date());
        System.out.println("Arrival_Date : " + this.getArrival_Date());
        System.out.println("Booking_Status : " + this.getBooking_Status());
    }
}

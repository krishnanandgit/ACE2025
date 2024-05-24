public class Container {
    private int container_ID;
    private String container_Type;
    private String container_Size;
    private double weight_Capacity;
    private String container_Status;
    private String arrival_Date;
    private String departure_Date;
    private int shipment_ID;

    public Container(int container_ID, String container_Type, String container_Size, double weight_Capacity, String container_Status, String arrival_Date, String departure_Date, int shipment_ID) {
        this.container_ID = container_ID;
        this.container_Type = container_Type;
        this.container_Size = container_Size;
        this.weight_Capacity = weight_Capacity;
        this.container_Status = container_Status;
        this.arrival_Date = arrival_Date;
        this.departure_Date = departure_Date;
        this.shipment_ID = shipment_ID;
    }

    public int getContainer_ID() {
        return container_ID;
    }

    public void setContainer_ID(int container_ID) {
        this.container_ID = container_ID;
    }

    public String getContainer_Type() {
        return container_Type;
    }

    public void setContainer_Type(String container_Type) {
        this.container_Type = container_Type;
    }

    public String getContainer_Size() {
        return container_Size;
    }

    public void setContainer_Size(String container_Size) {
        this.container_Size = container_Size;
    }

    public double getWeight_Capacity() {
        return weight_Capacity;
    }

    public void setWeight_Capacity(double weight_Capacity) {
        this.weight_Capacity = weight_Capacity;
    }

    public String getContainer_Status() {
        return container_Status;
    }

    public void setContainer_Status(String container_Status) {
        this.container_Status = container_Status;
    }

    public String getArrival_Date() {
        return arrival_Date;
    }

    public void setArrival_Date(String arrival_Date) {
        this.arrival_Date = arrival_Date;
    }

    public String getDeparture_Date() {
        return departure_Date;
    }

    public void setDeparture_Date(String departure_Date) {
        this.departure_Date = departure_Date;
    }

    public int getShipment_ID() {
        return shipment_ID;
    }

    public void setShipment_ID(int shipment_ID) {
        this.shipment_ID = shipment_ID;
    }

    public void displayContainer() {
        System.out.println("Container Details");
        System.out.println("Container_ID : " + this.getContainer_ID());
        System.out.println("Container_Type : " + this.getContainer_Type());
        System.out.println("Container_Size: " + this.getContainer_Size());
        System.out.println("Weight_Capacity : " + this.getWeight_Capacity());
        System.out.println("Container_Status : " + this.getContainer_Status());
        System.out.println("Arrival_Date : " + this.getArrival_Date());
        System.out.println("Departure_Date : " + this.getDeparture_Date());
        System.out.println("Shipment_ID : " + this.getShipment_ID());
    }
}

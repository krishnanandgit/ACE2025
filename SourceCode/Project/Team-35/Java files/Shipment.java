

public class Shipment {
    private int shipment_ID;
    private String origin;
    private String destination;
    private String shipping_Date;
    private String arrival_Date;
    private String shipment_Status;
    private double weight;
    private double volume;
    private int client_ID;
    public Shipment(int shipment_ID,String origin,String destination,String shipping_Date,String arrival_Date,String shipment_Status,double weight,double volume,int client_ID)
    {
        this.shipment_ID=shipment_ID;
        this.origin=origin;
        this.destination=destination;
        this.shipping_Date=shipping_Date;
        this.arrival_Date=arrival_Date;
        this.shipment_Status=shipment_Status;
        this.weight=weight;
        this.volume=volume;
        this.client_ID=client_ID;
    }
    public int getShipment_ID(){
        return shipment_ID;
    }
    public void setShipment_ID(int shipment_ID){
        this.shipment_ID=shipment_ID;
    }
    public  String getOrigin(){
        return origin;
    }
    public void setOrigin(String origin){
        this.origin=origin;
    }
    public String getDestination(){
        return destination;
    }
    public void setDestination(String destination){
        this.destination=destination;
    }
    public String getShipping_Date(){
        return shipping_Date;
    }
    public void setShipping_Date(String shipping_Date){
        this.shipping_Date=shipping_Date;
    }
    public String getArrival_Date(){
        return arrival_Date;
    }
    public void setArrival_Date(String arrival_Date){
        this.arrival_Date=arrival_Date;
    }
    public String getShipment_Status(){
        return shipment_Status;
    }
    public void setShipment_Status(String shipment_Status){
        this.shipment_Status=shipment_Status;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public double getVolume(){
        return volume;
    }
    public void setVolume(double volume){
        this.volume=volume;
    }
    public int getClient_ID(){
        return client_ID;
    }
    public void setClient_ID(int client_ID){
        this.client_ID=client_ID;
    }

    public void displayShipment(){
        System.out.println("Tracking Details");
        System.out.println("Shipment_ID : "+this.getShipment_ID());
        System.out.println("Origin : " + this.getOrigin());
        System.out.println("Destination : "+ this.getDestination());
        System.out.println("Shipping_Date : "+this.getShipping_Date());
        System.out.println("Arrival_Date : "+this.getArrival_Date());
        System.out.println("Shipment_Status : "+this.getShipment_Status());
        System.out.println("Weight : "+this.getWeight());
        System.out.println("Volume : "+this.getVolume());
        System.out.println("Client_ID : "+this.getClient_ID());
    }

}
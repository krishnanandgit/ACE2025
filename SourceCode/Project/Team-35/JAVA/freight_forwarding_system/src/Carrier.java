public class Carrier {
    private int carrier_ID;
    private String carrier_Name;
    private String contact_Info;
    private String address;
    private String carrier_Type;

    public Carrier(int carrier_ID, String carrier_Name, String contact_Info, String address, String carrier_Type) {
        this.carrier_ID = carrier_ID;
        this.carrier_Name = carrier_Name;
        this.contact_Info = contact_Info;
        this.address = address;
        this.carrier_Type = carrier_Type;
    }

    public int getCarrier_ID() {
        return carrier_ID;
    }

    public void setCarrier_ID(int carrier_ID) {
        this.carrier_ID = carrier_ID;
    }

    public String getCarrier_Name() {
        return carrier_Name;
    }

    public void setCarrier_Name(String carrier_Name) {
        this.carrier_Name = carrier_Name;
    }

    public String getContact_Info() {
        return contact_Info;
    }

    public void setContact_Info(String contact_Info) {
        this.contact_Info = contact_Info;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCarrier_Type() {
        return carrier_Type;
    }

    public void setCarrier_Type(String carrier_Type) {
        this.carrier_Type = carrier_Type;
    }

    public void displayCarrier() {
        System.out.println("Carrier details:");
        System.out.println("Carrier_ID : " + this.getCarrier_ID());
        System.out.println("Carrier_Name : " + this.getCarrier_Name());
        System.out.println("Contact_Info : " + this.getContact_Info());
        System.out.println("Address : " + this.getAddress());
        System.out.println("Carrier_Type : " + this.getCarrier_Type());
    }
}

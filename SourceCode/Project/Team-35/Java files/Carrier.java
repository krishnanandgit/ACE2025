
public class Carrier{
    private int Carrier_ID;
    private String Carrier_Name;
    private String Contact_Info;
    private String Address;
    private String Carrier_Type;

    public Carrier(int Carrier_ID, String Carrier_Name, String Contact_Info, String Address, String Carrier_Type) {
        this.Carrier_ID = Carrier_ID;
        this.Carrier_Name = Carrier_Name;
        this.Contact_Info = Contact_Info;
        this.Address = Address;
        this.Carrier_Type = Carrier_Type;
    }

    public int getCarrier_ID() {
        return Carrier_ID;
    }

    public void setCarrier_Id(int Carrier_ID) {
        this.Carrier_ID = Carrier_ID;
    }

    public String getCarrier_Name() {
        return Carrier_Name;
    }

    public void setCarrier_Name(String Carrier_Name) {
        this.Carrier_Name = Carrier_Name;
    }

    public String getContact_Info() {
        return Contact_Info;
    }

    public void setContact_Info(String Contact_Info) {
        this.Contact_Info = Contact_Info;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCarrier_Type() {
        return Carrier_Type;
    }

    public void displayCarrier(){
        System.out.println("Carrier details:");
        System.out.println("Carrier_ID : "+ this.getCarrier_ID());
        System.out.println("Carrier_Name : "+this.getCarrier_Name());
        System.out.println("Contact_Info : "+ this.getContact_Info());
        System.out.println("Address : "+ this.getAddress());
        System.out.println("Carrier_Type "+ this.getCarrier_Type() );
    }
}


package realestate;

public class Seller {
    private int sellerID;
    private String name;
    private String contactInfo;

    public Seller(int sellerID, String name, String contactInfo) {
        this.sellerID = sellerID;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public int getSellerID() {
        return sellerID;
    }

    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
   public void displayDetails() {
        System.out.println("Seller ID: " + sellerID);
        System.out.println("Name: " + name);
        System.out.println("Contact Info: " + contactInfo);
    }
}
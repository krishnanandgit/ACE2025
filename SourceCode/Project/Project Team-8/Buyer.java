package realestate;

public class Buyer {
    private int buyerID;
    private String name;
    private String contactInfo;

    public Buyer(int buyerID, String name, String contactInfo) {
        this.buyerID = buyerID;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public int getBuyerID() {
        return buyerID;
    }

    public void setBuyerID(int buyerID) {
        this.buyerID = buyerID;
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
        System.out.println("Buyer ID: " + buyerID);
        System.out.println("Name: " + name);
        System.out.println("Contact Info: " + contactInfo);
    }
}


package realestate;

import java.util.Date;

public class Listing {
    private int listingID;
    private int agentID;
    private int propertyID;
    private Date dateListed;
    private String status;

    public Listing(int listingID, int agentID, int propertyID, Date dateListed, String status) {
        this.listingID = listingID;
        this.agentID = agentID;
        this.propertyID = propertyID;
        this.dateListed = dateListed;
        this.status = status;
    }

    public int getListingID() {
        return listingID;
    }

    public void setListingID(int listingID) {
        this.listingID = listingID;
    }

    public int getAgentID() {
        return agentID;
    }

    public void setAgentID(int agentID) {
        this.agentID = agentID;
    }

    public int getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }

    public Date getDateListed() {
        return dateListed;
    }

    public void setDateListed(Date dateListed) {
        this.dateListed = dateListed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
    public void displayDetails() {
        System.out.println("Listing ID: " + listingID);
        System.out.println("Agent ID: " + agentID);
        System.out.println("Property ID: " + propertyID);
        System.out.println("Date Listed: " + dateListed);
        System.out.println("Status: " + status);
    }
}

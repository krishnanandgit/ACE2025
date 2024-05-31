package realestate;

import java.util.Date;

public class Inspection {
    private int inspectionID;
    private int propertyID;
    private Date date;
    private String description;

    public Inspection(int inspectionID, int propertyID, Date date, String description) {
        this.inspectionID = inspectionID;
        this.propertyID = propertyID;
        this.date = date;
        this.description = description;
    }

    public int getInspectionID() {
        return inspectionID;
    }

    public void setInspectionID(int inspectionID) {
        this.inspectionID = inspectionID;
    }

    public int getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
    public void displayDetails() {
        System.out.println("Inspection ID: " + inspectionID);
        System.out.println("Property ID: " + propertyID);
        System.out.println("Date: " + date);
        System.out.println("Description: " + description);
    }
}

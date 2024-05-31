package realestate;

import java.util.Date;

public class Report {
    private int reportID;
    private int inspectorID;
    private Date date;
    private String description;

    public Report(int reportID, int inspectorID, Date date, String description) {
        this.reportID = reportID;
        this.inspectorID = inspectorID;
        this.date = date;
        this.description = description;
    }

    public int getReportID() {
        return reportID;
    }

    public void setReportID(int reportID) {
        this.reportID = reportID;
    }

    public int getInspectorID() {
        return inspectorID;
    }

    public void setInspectorID(int inspectorID) {
        this.inspectorID = inspectorID;
    }

    public Date getDate(){
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
        System.out.println("Report ID: " + reportID);
        System.out.println("Inspector ID: " + inspectorID);
        System.out.println("Date: " + date);
        System.out.println("Description: " + description);
    }
}

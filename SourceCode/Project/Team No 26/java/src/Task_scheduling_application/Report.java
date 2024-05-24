package Task_scheduling_application;

public class Report {
    private String report_id;
    private String report_name;
    private String description;
    private String user_id;

    public Report(String report_id, String report_name, String description, String user_id) {
        this.report_id = report_id;
        this.report_name = report_name;
        this.description = description;
        this.user_id = user_id;
    }

    public String getReport_id() {
        return report_id;
    }

    public void setReport_id(String report_id) {
        this.report_id = report_id;
    }

    public String getReport_name() {
        return report_name;
    }

    public void setReport_name(String report_name) {
        this.report_name = report_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public void Reportdisplay() {
        System.out.println("Report details:");
        System.out.println("Report ID: " + report_id);
        System.out.println("Report Name: " + report_name);
        System.out.println("Description: " + description);
        System.out.println("User ID: " + user_id);
    }
}

package realestate;

public class Agent {
    private int agentID;
    private String name;
    private String contactInfo;
    private double commission;
    private String licenseNo;

    public Agent(int agentID, String name, String contactInfo, double commission, String licenseNo) {
        this.agentID = agentID;
        this.name = name;
        this.contactInfo = contactInfo;
        this.commission = commission;
        this.licenseNo = licenseNo;
    }

    public int getAgentID() {
        return agentID;
    }

    public void setAgentID(int agentID) {
        this.agentID = agentID;
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

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }
}
public void displayDetails() {
        System.out.println("Agent ID: " + agentID);
        System.out.println("Name: " + name);
        System.out.println("Contact Info: " + contactInfo);
        System.out.println("Commission: " + commission);
        System.out.println("License No: " + licenseNo);
    }
}

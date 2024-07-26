import java.util.Date;

public class Billing {
    private int billingID;
    private int caseID;
    private double amount;
    private Date dateBilled;
    private Date paidDate;
    private String billingStatus;

    public Billing(int billingID, int caseID, double amount, Date dateBilled, Date paidDate, String billingStatus) {
        this.billingID = billingID;
        this.caseID = caseID;
        this.amount = amount;
        this.dateBilled = dateBilled;
        this.paidDate = paidDate;
        this.billingStatus = billingStatus;
    }

    public int getBillingID() {
        return billingID;
    }

    public void setBillingID(int billingID) {
        this.billingID = billingID;
    }

    public int getCaseID() {
        return caseID;
    }

    public void setCaseID(int caseID) {
        this.caseID = caseID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDateBilled() {
        return dateBilled;
    }

    public void setDateBilled(Date dateBilled) {
        this.dateBilled = dateBilled;
    }

    public Date getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(Date paidDate) {
        this.paidDate = paidDate;
    }

    public String getBillingStatus() {
        return billingStatus;
    }

    public void setBillingStatus(String billingStatus) {
        this.billingStatus = billingStatus;
    }

}

public class Billing {
    
    private int billID;
    private int patientID;
    private String billDate;
    private double totalAmount;

    public Billing(int billID, int patientID, String billDate, double totalAmount) {
        this.billID = billID;
        this.patientID = patientID;
        this.billDate = billDate;
        this.totalAmount = totalAmount;
    }

    
    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    
    public static void main(String[] args) {
        
        Billing billing = new Billing(1, 101, "2024-05-24", 500.0);

        
        System.out.println("Bill ID: " + billing.getBillID());
        System.out.println("Patient ID: " + billing.getPatientID());
        System.out.println("Bill Date: " + billing.getBillDate());
        System.out.println("Total Amount: $" + billing.getTotalAmount());
    }
}


public class Invoice {
    private int invoice_ID;
    private int invoice_shipment_ID;
    private int invoice_client_ID;
    private double amount;
    private String due_Date;
    private String invoice_Status;

    public Invoice(int invoice_ID, int invoice_shipment_ID, int invoice_client_ID, double amount, String due_Date, String invoice_Status) {
        this.invoice_ID = invoice_ID;
        this.invoice_shipment_ID = invoice_shipment_ID;
        this.invoice_client_ID = invoice_client_ID;
        this.amount = amount;
        this.due_Date = due_Date;
        this.invoice_Status = invoice_Status;
    }

    public int getInvoice_ID() {
        return invoice_ID;
    }

    public void setInvoice_ID(int invoice_ID) {
        this.invoice_ID = invoice_ID;
    }

    public int getInvoice_Shipment_ID() {
        return invoice_shipment_ID;
    }

    public void setInvoice_Shipment_ID(int invoice_shipment_ID) {
        this.invoice_shipment_ID = invoice_shipment_ID;
    }

    public int getInvoice_Client_ID() {
        return invoice_client_ID;
    }

    public void setInvoice_Client_ID(int invoice_client_ID) {
        this.invoice_client_ID = invoice_client_ID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDue_Date() {
        return due_Date;
    }

    public void setDue_Date(String due_Date) {
        this.due_Date = due_Date;
    }

    public String getInvoice_Status() {
        return invoice_Status;
    }

    public void setInvoice_Status(String invoice_Status) {
        this.invoice_Status = invoice_Status;
    }

    public void displayInvoice() {
        System.out.println("Invoice Details");
        System.out.println("Invoice_ID : " + this.getInvoice_ID());
        System.out.println("Shipment_ID : " + this.getInvoice_Shipment_ID());
        System.out.println("Client_ID : " + this.getInvoice_Client_ID());
        System.out.println("Amount : " + this.getAmount());
        System.out.println("Due_Date : " + this.getDue_Date());
        System.out.println("Invoice_Status : " + this.getInvoice_Status());
    }
}
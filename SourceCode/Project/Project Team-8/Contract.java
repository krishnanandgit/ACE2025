package realestate;

import java.util.Date;

public class Contract {
    private int contractID;
    private int buyerID;
    private int sellerID;
    private Date dateSigned;
    private String status;

    public Contract(int contractID, int buyerID, int sellerID, Date dateSigned, String status) {
        this.contractID = contractID;
        this.buyerID = buyerID;
        this.sellerID = sellerID;
        this.dateSigned = dateSigned;
        this.status = status;
    }

    public int getContractID() {
        return contractID;
    }

    public void setContractID(int contractID) {
        this.contractID = contractID;
    }

    public int getBuyerID() {
        return buyerID;
    }

    public void setBuyerID(int buyerID) {
        this.buyerID = buyerID;
    }

    public int getSellerID() {
        return sellerID;
    }

    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }

    public Date getDateSigned() {
        return dateSigned;
    }

    public void setDateSigned(Date dateSigned) {
        this.dateSigned = dateSigned;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
    public void displayDetails() {
        System.out.println("Contract ID: " + contractID);
        System.out.println("Buyer ID: " + buyerID);
        System.out.println("Seller ID: " + sellerID);
        System.out.println("Date Signed: " + dateSigned);
        System.out.println("Status: " + status);
    }
}

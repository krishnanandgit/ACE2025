package realestate;

public class Mortgage {
    private int mortgageID;
    private int buyerID;
    private String lender;
    private double amount;
    private double interestRate;
    private int term;

    public Mortgage(int mortgageID, int buyerID, String lender, double amount, double interestRate, int term) {
        this.mortgageID = mortgageID;
        this.buyerID = buyerID;
        this.lender = lender;
        this.amount = amount;
        this.interestRate = interestRate;
        this.term = term;
    }

    public int getMortgageID() {
        return mortgageID;
    }

    public void setMortgageID(int mortgageID) {
        this.mortgageID = mortgageID;
    }

    public int getBuyerID() {
        return buyerID;
    }

    public void setBuyerID(int buyerID) {
        this.buyerID = buyerID;
    }

    public String getLender() {
        return lender;
    }

    public void setLender(String lender) {
        this.lender = lender;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }
}
public void displayDetails() {
        System.out.println("Mortgage ID: " + mortgageID);
        System.out.println("Buyer ID: " + buyerID);
        System.out.println("Lender: " + lender);
        System.out.println("Amount: " + amount);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Term: " + term);
    }
}

package carrental;

public class Payment {
  private String paymentID;
  private int amount;
  private String paymentDate;

  public Payment(String paymentID, int amount, String paymentDate){
    this.paymentID=paymentID;
    this.amount=amount;
    this.paymentDate=paymentDate;
  }

  public void displaypayment(){
    System.out.println("PaymentID is "+paymentID+" with customerid is "+Customer.CustomerId+" the amount to pay is "+amount+"before "+paymentDate);
  }

}

package carrental;

public class Customer {
  private String Name;
  private String PhoneNo;
  public static String Address;
  public static String CustomerId;

  public Customer(String CustomerId, String Name, String PhoneNo, String Address){
    Customer.CustomerId=CustomerId;
    this.Name=Name;
    this.PhoneNo=PhoneNo;
    Customer.Address=Address;

  }
  public void displayCustomer(){
    System.out.println("The Customer Id is "+CustomerId+" with customer name "+Name+" and his phone no "+PhoneNo+" and living at "+Address);
  }
  
}

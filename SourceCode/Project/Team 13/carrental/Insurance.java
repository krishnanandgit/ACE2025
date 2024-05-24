package carrental;

public class Insurance {
  private String insuranceId;
  private String description;
  private int cost;

  public Insurance(String insuranceId, String description, int cost){
    this.insuranceId=insuranceId;
    this.description=description;
    this.cost=cost;
  }

  public void displayinsurance(){
    System.out.println("the insuranceIdis "+insuranceId+" with description "+description+" of cost "+cost);
  }
  
}

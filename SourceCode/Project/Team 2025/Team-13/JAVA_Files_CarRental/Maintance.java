package carrental;

public class Maintance {
  private String maintanceId;
  private String description;
  private String maintanceDate;

  public Maintance(String maintanceId, String description, String maintanceDate){
    this.maintanceId=maintanceId;
    this.description=description;
    this.maintanceDate=maintanceDate;
  }

  public void displayMaintance(){
    System.out.println("maintanceId is "+maintanceId+" the maintance details "+description+" And your Maintance is on "+maintanceDate);
  }

  
}

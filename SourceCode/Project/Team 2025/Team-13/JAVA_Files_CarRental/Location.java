package carrental;

public class Location {
  public static String locationId;

  public Location(String locationId){
    Location.locationId=locationId;
  }

  public void displaylocation(){
    System.out.println("LocationId is "+locationId+" at address "+Customer.Address);
  }
  
}

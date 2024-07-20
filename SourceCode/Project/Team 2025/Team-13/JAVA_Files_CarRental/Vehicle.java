package carrental;

public class Vehicle {
  public static String VehicleID;
  private String Make;
  private String Model;
  private String Color;

  public Vehicle(String VehicleID, String Make, String Model, String Color){
    Vehicle.VehicleID=VehicleID;
    this.Make=Make;
    this.Model=Model;
    this.Color=Color;
  }
  public void displayVehicle(){
    System.out.println("The VehicleID is "+Vehicle.VehicleID+" of "+Make+""+Model+" of color "+Color);
  }

  
}

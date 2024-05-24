package carrental;

public class Inventory {
  private String inventoryId;
  private int quantity;

  public Inventory(String inventoryId, int quantity){
    this.inventoryId=inventoryId;
    this.quantity=quantity;
  }

  public void displayinventory(){
    System.out.println("the inventory id "+inventoryId+" contains quantity of "+quantity+" of vehicle id "+Vehicle.VehicleID+" at location "+Location.locationId);
  }
  
}

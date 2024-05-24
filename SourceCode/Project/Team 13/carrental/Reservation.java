package carrental;

public class Reservation {
  public static String ReservationID;
  public static String StartDate;
  public static String EndDate;

  public Reservation(String ReservationID, String VehicleID, String StartDate,String EndDate){
    Reservation.ReservationID=ReservationID;
    Reservation.StartDate=StartDate;
    Reservation.EndDate=EndDate;
  }
   
  public void displayReservation(){
    System.out.println("ReservationID: "+ReservationID+" CustomerId: "+Customer.CustomerId+" VehicleID: "+Vehicle.VehicleID+" StartDate: "+StartDate+" and EndDate: "+EndDate);
  }
  
}

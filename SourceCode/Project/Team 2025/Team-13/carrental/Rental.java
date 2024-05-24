package carrental;

public class Rental {
  String RentalId;

  public Rental(String RentalId){
    this.RentalId=RentalId;
  }

  public void displayRental(){
    System.out.println("RentalId: "+RentalId+"ReservationID: "+Reservation.ReservationID+" with starting date "+Reservation.StartDate+" and end at "+Reservation.EndDate);
  }
  
}

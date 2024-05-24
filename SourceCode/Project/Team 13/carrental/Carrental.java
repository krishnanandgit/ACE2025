package carrental;
import java.util.*;
public class Carrental {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //class of vehicle 
    System.out.println("Enter car details");
    System.out.println("Enter the Vheicle Id");
    String VehicleID = sc.nextLine(); 
    System.out.println("Enter the make");
    String Make = sc.nextLine();
    System.out.println("Enter the model");
    String Model = sc.nextLine();
    System.out.println("Enter the color");
    String Color = sc.nextLine();
    Vehicle vehicle = new Vehicle(VehicleID, Make, Model, Color);
    //vehicle.displayVehicle();

    // class customer
    System.out.println("enter the Customer Details");
    System.out.println("Enter the customerId");
    String CustomerId = sc.nextLine();
    System.out.println("Enter the name");
    String Name = sc.nextLine();
    System.out.println("enter the Phone no");
    String PhoneNo = sc.nextLine();
    System.out.println("Enter the address");
    String Address = sc.nextLine();
    Customer customer = new Customer(CustomerId, Name, PhoneNo, Address);
    //customer.displayCustomer();

    //class reservation

    System.out.println("Enter Reservation details");
    System.out.println("Enter the Reservation Id");
    String ReservationID = sc.nextLine();
    System.out.println("Enter the Vehicle ID");
    //String VehicleID = sc.nextLine(); 
    System.out.println("Enter the StartDate");
    String StartDate = sc.nextLine();
    System.out.println("Enter the Enddate");
    String EndDate = sc.nextLine();
    Reservation reservation = new Reservation( ReservationID, VehicleID, StartDate, EndDate);
    //reservation.displayReservation();
    
    // class rental
    System.out.println("Enter the RentalId");
    String RentalId = sc.nextLine();
    Rental rental = new Rental(RentalId);
    //rental.displayRental();


    //class payment

    System.out.println("enter paymentId ");
    String paymentID = sc.nextLine();
    System.out.println("enter the amount ");
    int amount = sc.nextInt();
    Payment payment = new Payment(paymentID, amount, paymentID);
    //payment.displaypayment();

    // class about location
    System.out.println("enter the location id");
    String locationId = sc.nextLine();
    Location location = new Location(locationId);
    //location.displaylocation();

    //about insurance

    System.out.println("enter insuranceid");
    String insuranceId = sc.nextLine();
    Insurance insurance = new Insurance(insuranceId, "this is the best plan", 2000);
    //insurance.displayinsurance();

    //about maintance

    System.out.println("enter the maintaince id ");
    String maintanceId = sc.nextLine();
    System.out.println("enter the maintaince date ");
    String maintanceDate = sc.nextLine();
    Maintance maintance = new Maintance(maintanceId, "This plan contains all repirs,checkup,and wash", maintanceDate);
    //maintance.displayMaintance();

   // inventory 

    System.out.println("enter inventory id");
    String inventoryId=sc.nextLine();
    Inventory inventory= new Inventory(inventoryId, 3);
    //inventory.displayinventory();

    // reviews

    System.out.println("enter reviewid");
    String reviewId = sc.nextLine();
    System.out.println("give the rating ");
    int rating=sc.nextInt();
    System.out.println("write your your comments");
    String comments = sc.nextLine();
    Review review = new Review(reviewId, rating, comments);
    //review.displayreview();

    vehicle.displayVehicle();
    customer.displayCustomer();
    reservation.displayReservation();
    rental.displayRental();
    location.displaylocation();
    payment.displaypayment();
    insurance.displayinsurance();
    maintance.displayMaintance();
    inventory.displayinventory();
    review.displayreview();

sc.close();
  }
  
}

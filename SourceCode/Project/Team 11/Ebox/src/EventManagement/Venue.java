package EventManagement;
import java.util.Scanner;
public class Venue {
    private int venueId;
    private String name;
    private String address;
    private boolean booked;
    Scanner scanner = new Scanner(System.in);
    // Constructor
    public Venue(int venueId, String name, String address) {
        this.venueId = venueId;
        this.name = name;
        this.address = address;
        this.booked = false;
    }
    public void details()
    {
        System.out.println("Enter event details:");
        System.out.print("venue ID: ");
        this.venueId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        this.name = scanner.nextLine();
        System.out.print("address: ");
        this.address = scanner.nextLine();
    }
    // Method to reserve the venue
    public void reserveVenue() {
        if (!booked) {
            System.out.println("Venue '"+ name +"' at '" + address +"' has been reserved.");
            booked = true;
        } else {
            System.out.println("Venue '"+ name+"' at '"+ address +"' is already booked.");
        }
    }

    // Method to update venue details
    public void updateVenueDetails() {
        System.out.println("Update venue details:");
        System.out.print("Name: ");
        this.name = scanner.nextLine();
        System.out.print("address: ");
        this.address = scanner.nextLine();
        System.out.println("Venue details updated successfully.");
    }

    // Method to cancel venue booking
    public void cancelVenueBooking() {
        if (booked) {
            System.out.println("Venue '" + name + ", at '" + address + "' booking has been cancelled.");
            booked = false;
        } else {
            System.out.println("No booking exists for venue '" + name + "' at '" + address + "'.");
        }
    }

    // Getters and Setters
    public int getVenueId() {
        return venueId;
    }

    public void setVenueId(int venueId) {
        this.venueId = venueId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

}

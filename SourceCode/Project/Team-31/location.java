package java_programs.Fitness_Class_Booking_Platform;

public class Location {
    private int locationId;
    private String address;

    public Location(int locationId, String address) {
        this.locationId = locationId;
        this.address = address;
    }

    public void displayLocation() {
        System.out.println("Location ID: " + locationId);
        System.out.println("Address: " + address);
    }
}

import java.util.ArrayList;
import java.util.List;

public class VehicleOwner extends User {
    private int vehicleOwnerID;
    private String vehicleType;
    private List<ParkingRecord> parkingHistory;

    public VehicleOwner(int userID, String name, String contact, int vehicleOwnerID, String vehicleType) {
        super(userID, name, contact);
        this.vehicleOwnerID = vehicleOwnerID;
        this.vehicleType = vehicleType;
        this.parkingHistory = new ArrayList<>();
    }

    public int getVehicleOwnerID() {
        return vehicleOwnerID;
    }

    public void setVehicleOwnerID(int vehicleOwnerID) {
        this.vehicleOwnerID = vehicleOwnerID;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public List<ParkingRecord> getParkingHistory() {
        return parkingHistory;
    }

    public void setParkingHistory(List<ParkingRecord> parkingHistory) {
        this.parkingHistory = parkingHistory;
    }

    // Methods
    public void registerVehicle(String vehicleType) {
        this.vehicleType = vehicleType;
        System.out.println("Vehicle registered: " + vehicleType);
    }

    public void viewParkingHistory() {
        System.out.println("Parking History: " + parkingHistory);
    }

    public void updateProfile(String name, String contact) {
        setName(name);
        setContact(contact);
        System.out.println("Profile updated: " + getName() + ", " + getContact());
    }

    @Override
    public void login() {
        System.out.println("Vehicle Owner logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Vehicle Owner logged out.");
    }
}

import java.time.LocalDateTime;

public class ParkingLotManager extends User {
    private int managerID;
    private int parkingLotID;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;

    public ParkingLotManager(int userID, String name, String contact, int managerID, int parkingLotID) {
        super(userID, name, contact);
        this.managerID = managerID;
        this.parkingLotID = parkingLotID;
    }

    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    public int getParkingLotID() {
        return parkingLotID;
    }

    public void setParkingLotID(int parkingLotID) {
        this.parkingLotID = parkingLotID;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    // Methods
    public void monitorParkingSlots() {
        System.out.println("Monitoring parking slots...");
    }

    public double calculateParkingFee(Vehicle vehicle, LocalDateTime entryTime, LocalDateTime exitTime) {
        long hoursParked = java.time.Duration.between(entryTime, exitTime).toHours();
        double fee = hoursParked * 5.0; // Assuming $5 per hour
        return fee;
    }

    public void generateParkingReport(LocalDateTime startTime, LocalDateTime endTime) {
        System.out.println("Generating parking report from " + startTime + " to " + endTime);
    }

    @Override
    public void login() {
        System.out.println("Parking Lot Manager logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Parking Lot Manager logged out.");
    }
}

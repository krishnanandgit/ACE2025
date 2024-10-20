import java.time.LocalDateTime;

public class ParkingRecord {
    private String vehicleType;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private double parkingFee;

    
    public ParkingRecord(String vehicleType, LocalDateTime entryTime, LocalDateTime exitTime, double parkingFee) {
        this.vehicleType = vehicleType;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
        this.parkingFee = parkingFee;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
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

    public double getParkingFee() {
        return parkingFee;
    }

    public void setParkingFee(double parkingFee) {
        this.parkingFee = parkingFee;
    }

    @Override
    public String toString() {
        return "ParkingRecord{" +
                "vehicleType='" + vehicleType + '\'' +
                ", entryTime=" + entryTime +
                ", exitTime=" + exitTime +
                ", parkingFee=" + parkingFee +
                '}';
    }
}


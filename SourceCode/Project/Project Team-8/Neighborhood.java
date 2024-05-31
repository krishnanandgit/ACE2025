package realestate;

public class Neighborhood {
    private int neighborhoodID;
    private String name;
    private String location;
    private double crimeRate;

    public Neighborhood(int neighborhoodID, String name, String location, double crimeRate) {
        this.neighborhoodID = neighborhoodID;
        this.name = name;
        this.location = location;
        this.crimeRate = crimeRate;
    }

    public int getNeighborhoodID() {
        return neighborhoodID;
    }

    public void setNeighborhoodID(int neighborhoodID) {
        this.neighborhoodID = neighborhoodID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getCrimeRate() {
        return crimeRate;
    }

    public void setCrimeRate(double crimeRate) {
        this.crimeRate = crimeRate;
    }
}
    public void displayDetails() {
        System.out.println("Neighborhood ID: " + neighborhoodID);
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Crime Rate: " + crimeRate);
    }
}


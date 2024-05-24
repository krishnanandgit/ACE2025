public class Ward {
    
    private int wardID;
    private String wardType;
    private String wardName;
    private boolean availability;

    
    public Ward(int wardID, String wardType, String wardName, boolean availability) {
        this.wardID = wardID;
        this.wardType = wardType;
        this.wardName = wardName;
        this.availability = availability;
    }

    
    public int getWardID() {
        return wardID;
    }

    public void setWardID(int wardID) {
        this.wardID = wardID;
    }

    public String getWardType() {
        return wardType;
    }

    public void setWardType(String wardType) {
        this.wardType = wardType;
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    
    public static void main(String[] args) {
        
        Ward ward = new Ward(1, "General", "Ward A", true);

        
        System.out.println("Ward ID: " + ward.getWardID());
        System.out.println("Ward Type: " + ward.getWardType());
        System.out.println("Ward Name: " + ward.getWardName());
        System.out.println("Availability: " + (ward.isAvailability() ? "Available" : "Not Available"));
    }
}


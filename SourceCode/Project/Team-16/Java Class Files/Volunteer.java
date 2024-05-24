public class Volunteer {

    private int volunteerId;
    private String name;
    private String availability;

    public int getVolunteerId() {
        return volunteerId;
    }
    public void setVolunteerId(int volunteerId) {
        this.volunteerId = volunteerId;
    }
  
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAvailability() {
        return availability;
    }
    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public void displayVolunteerDetails() {
        System.out.println("Volunteer ID : " + volunteerId);
        System.out.println("Volunteer Name : " + name);
        System.out.println("Availability : " + availability);
    }
}

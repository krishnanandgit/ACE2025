public class Event {

    int eventId;
    String date;
    String location;
    String description;

    public int getEventId() {
        return eventId;
    }
    public void setEventId(int eventId) {
        this.eventId = eventId;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public void displayEventDetails() {
        System.out.println("Event ID : " + eventId);
        System.out.println("Event Date : " + date);
        System.out.println("Event Location : " + location);
        System.out.println("Event Description : " + description);
    }


    
}

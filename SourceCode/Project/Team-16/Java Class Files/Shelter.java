public class Shelter {
    int shelterId;
    String name;
    String location;
    String contactInfo;

    public int getShelterId() {
        return shelterId;
    }
    public void setShelterId(int shelterId) {
        this.shelterId = shelterId;
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

    public String getContactInfo() {
        return contactInfo;
    }
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
    
    public void displayShelterDetails() {
        System.out.println("Shelter ID : " + shelterId);
        System.out.println("Name : " + name);
        System.out.println("Location : " + location);
        System.out.println("Contact Information : " + contactInfo);
    }
}

public class Adopter {
    int adopterId;
    String name;
    String address;
    String contactDetails;

    public int getAdopterId() {
        return adopterId;
    }
    public void setAdopterId(int adopterId) {
        this.adopterId = adopterId;
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
    
    public String getContactDetails() {
        return contactDetails;
    }
    public void setContactInfo(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    public void displayAdopterDetails() {
        System.out.println("Adopter's ID : " + adopterId);
        System.out.println("Adopter's Name : " + name);
        System.out.println("Adopter's Address : " + address);
        System.out.println("Adopter's Contact Details : " + contactDetails);

    }
}

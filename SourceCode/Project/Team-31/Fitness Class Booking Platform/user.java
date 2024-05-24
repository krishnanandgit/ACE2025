package java_programs.Fitness_Class_Booking_Platform;

public class User {
    private int userId;
    private String name, email, address, phoneNo;
    private Membership membership;

    public User(int userId, String name, String email, String address, String phoneNo) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public void displayUser() {
        System.out.println("User ID: " + userId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Phone No: " + phoneNo);
        if (membership != null) {
            System.out.println("Membership Type: " + membership.getType());
        }
    }
}

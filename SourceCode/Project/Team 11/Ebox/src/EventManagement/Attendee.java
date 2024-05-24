package EventManagement;

import java.util.Scanner;

public class Attendee {
    private int attendeeId;
    private String name;
    private String email;
    
    // Constructor
    public Attendee(int attendeeId, String name, String email) {
        this.attendeeId = attendeeId;
        this.name = name;
        this.email = email;
    }
    
    public void registerAttendee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter attendee details:");
        System.out.print("Attendee ID: ");
        this.attendeeId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        this.name = scanner.nextLine();
        System.out.print("Email: ");
        this.email = scanner.nextLine();
        System.out.println("Attendee with Name '"+name+"' registered successfully.");
        scanner.close();
    }
    
    public void checkInAttendee()
    {
        
        System.out.println("Attendee with ID '"+attendeeId+"' checked in successfully.");
    }
    
    public void sendConfirmationEmail() 
    {
        System.out.println("Confirmation email sent to " + email+"@gmail.com");
    }
    
    // Getter methods
    public int getAttendeeId() {
        return attendeeId;
    }
    
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
}

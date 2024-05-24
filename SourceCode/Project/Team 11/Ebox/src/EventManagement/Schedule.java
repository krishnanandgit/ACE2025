package EventManagement;
import java.util.Scanner;
public class Schedule {
    private int scheduleId;
    private int eventId;
    private String timeSlot;
    private String activity;
    Scanner scanner = new Scanner(System.in);
    // Constructor
    public Schedule(int scheduleId, int eventId, String timeSlot, String activity) {
        this.scheduleId = scheduleId;
        this.eventId = eventId;
        this.timeSlot = timeSlot;
        this.activity = activity;
    }

    // Method to create a schedule
    public void createSchedule() {
        System.out.println("Enter Schedule details:");
        System.out.print("Schedule Id: ");
        this.scheduleId = scanner.nextInt();
        System.out.print("EventId: ");
        this.eventId = scanner.nextInt();
         scanner.nextLine(); // Consume newline
        System.out.print("TimeSlot: ");
        this.timeSlot = scanner.nextLine();
        System.out.print("Activity: ");
        this.activity = scanner.nextLine();
        System.out.println("Schedule with Id '"+scheduleId+"' created successfully.");
    }

    // Method to update a schedule
    public void updateSchedule() {
        
        System.out.println("Update event details:");
        System.out.print("TimeSlot: ");
        this.timeSlot = scanner.nextLine();
        System.out.print("Activity: ");
        this.activity = scanner.nextLine();

        System.out.println("Schedule with Id '"+scheduleId+"'  updated successfully.");
    }

    // Method to delete a schedule
    public void deleteSchedule() 
    {
        System.out.println("Schedule with ID: '" + scheduleId + "' deleted.");
    }

    // Getters and Setters
    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }
    public void displayDetails()
    {
    	System.out.println("Schedule details:");
        System.out.println("Event ID: "+eventId);
        System.out.println("Schedule ID: "+scheduleId);
        System.out.println("TimeSlot: "+timeSlot);
        System.out.println("Activity: "+activity);
    }
}

package EventManagement;
import java.util.Scanner;

public class Event 
{
    // Attributes
    private int eventId;
    private String name;
    private String date;
    private String description;
    Scanner scanner = new Scanner(System.in);
    // Constructor
    public Event(int eventId, String name, String date, String description) 
    {
        this.eventId = eventId;
        this.name = name;
        this.date = date;
        this.description = description;
    }

    // Methods
    public void createEvent() 
    {
        
        System.out.println("Enter event details:");
        System.out.print("Event ID: ");
        this.eventId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        this.name = scanner.nextLine();
        System.out.print("Date: ");
        this.date = scanner.nextLine();
        System.out.print("Description: ");
        this.description = scanner.nextLine();
        System.out.println("Event '"+name+"' created successfully.");
    }

    public void updateEvent() 
    {
        System.out.println("Update event details:");
        System.out.print("Name: ");
        this.name = scanner.nextLine();
        System.out.print("Date: ");
        this.date = scanner.nextLine();
        System.out.print("Description: ");
        this.description = scanner.nextLine();
        System.out.println("Event '"+name+"' updated successfully.");
    }

    public void deleteEvent()
    {
    	
         System.out.print("Enter Event ID to delete Event : ");
         int neweventId = scanner.nextInt();
     	if(neweventId==eventId)
     	{
         System.out.println("Event '"+name+"'  deleted successfully.");
     	}
     	else
     	{
     	    System.out.println("Event not found!!.");
     	}
     }

    // Getter methods
    public int getEventId() 
    {
        return eventId;
    }

    public String getName()
    {
        return name;
    }

    public String getDate() 
    {
        return date;
    }

    public String getDescription() 
    {
        return description;
    }
    public void displayDetails()
    {
    	System.out.println("Event details:");
        System.out.println("Event ID: "+eventId);
        System.out.println("Name: "+name);
        System.out.println("Date: "+date);
        System.out.println("Description: "+description);
    }
}

package EventManagement;
import java.util.Scanner;
public class Organiser 
{
    private int organizerId;
    private String name;
    private String contactInfo;
    Scanner scanner = new Scanner(System.in);
    public Organiser(int organizerId, String name, String contactInfo) 
    {
        this.organizerId = organizerId;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public void addOrganizer() 
    {
        System.out.println("Enter Organizer details:");
        System.out.print("OrganizerId: ");
        this.organizerId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        this.name = scanner.nextLine();
        System.out.print("ContactInfo: ");
        this.contactInfo = scanner.nextLine();

        System.out.println("Organizer '"+name+"' added successfully.");
    }

    public void updateOrganizer() 
    {
        
        System.out.println("Updating Organizer details:");
        System.out.print("Name: ");
        this.name = scanner.nextLine();
        System.out.print("ContactInfo: ");
        this.contactInfo = scanner.nextLine();
        System.out.println("Organizer '"+name+"' updated successfully.");
    }

    public void removeOrganizer() 
    {
         System.out.print("Enter OrganizerId to delete Organizer : ");
         int neweventId = scanner.nextInt();
     	if(neweventId==organizerId)
     	{
         System.out.println("Organizer '"+name+"'  removed successfully.");
     	}
     	else
     	{
     	    System.out.println("Organizer not found!!.");
     	}
    }
    
    // Getter methods
    public int getOrganizerId() 
    {
        return organizerId;
    }

    public String getName()
    {
        return name;
    }

    public String getContactInfo() 
    {
        return contactInfo;
    }
    public void displayDetails()
    {
    	System.out.println("Organizer details:");
        System.out.println("Organizer ID: "+organizerId);
        System.out.println("Name: "+name);
        System.out.println("ContactInfo: "+contactInfo);
    }
}
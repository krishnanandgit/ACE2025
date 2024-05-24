package EventManagement;
import java.util.*;


public class Ticket {
    private int ticketID;
    private int eventID;
    private double price;
    private String type;
    private boolean sold;
    private boolean validated;

    // Constructor
    public Ticket(int eventID, double price, String type) {
        this.eventID = eventID;
        this.price = price;
        this.type = type;
        this.sold = false;
        this.validated = false;
    }

    // Method to generate a ticket ID
    public void generateTicket() {
        Random rand = new Random();
        this.ticketID = rand.nextInt(1000000) + 1;
    }
    public void ticketDetails()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Ticket details:");
        System.out.print("Event ID: ");
        this.eventID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Type basic or (specify 'vip' if needed VIP Entry): ");
        this.type = scanner.nextLine();
        if(type.equalsIgnoreCase("vip"))
        {
           this.price = 100.0;
        }
        else
        {
            this.price = 50.0;
        }
        scanner.close();
    }

    // Method to sell the ticket
    public void sellTicket() {
        if (!sold) {
            System.out.println("Ticket Type "+type+" with ID " + ticketID + " has been sold for $" + price);
            sold = true;
        } else {
            System.out.println("Ticket Type "+type+" with ID " + ticketID + " has already been sold.");
        }
    }

    // Method to validate the ticket
    public void validateTicket() {
        if (sold && !validated) {
            System.out.println("Ticket with ID " + ticketID + " has been validated.");
            validated = true;
        } else if (!sold) {
            System.out.println("Ticket with ID " + ticketID + " has not been sold yet.");
        } else {
            System.out.println("Ticket with ID " + ticketID + " has already been validated.");
        }
    }

    // Getters and Setters
    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public boolean isValidated() {
        return validated;
    }

    public void setValidated(boolean validated) {
        this.validated = validated;
    }

}

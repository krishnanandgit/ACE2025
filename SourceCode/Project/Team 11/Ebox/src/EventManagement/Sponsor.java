package EventManagement;
import java.util.Scanner;
public class Sponsor {
    private int sponsorId;
    private String name;
    private double contribution;
    Scanner scanner = new Scanner(System.in);
    // Constructor
    public Sponsor(int sponsorId, String name, double contribution) {
        this.sponsorId = sponsorId;
        this.name = name;
        this.contribution = contribution;
    }

    // Method to add a sponsor
    public void addSponsor() {
        System.out.println("Enter Sponsor details:");
        System.out.print("Sponsor ID: ");
        this.sponsorId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        this.name = scanner.nextLine();
        System.out.print("Contribution: ");
        this.contribution = scanner.nextDouble();
    }

    // Method to update sponsor contribution
    public void updateSponsorContribution() 
    {
        System.out.println("Update Sponsor Contribution details:");
        System.out.print("Contribution: ");
        this.contribution = scanner.nextDouble();
        System.out.println("Sponsor '" + name + "' (ID: " + sponsorId + ") updated Contribution details successfully");
    }


    // Method to remove a sponsor
    public void removeSponsor() {
    System.out.println("Sponsor '" + name + "' (ID: " + sponsorId + ") removed successfully");
    }

    // Getters and Setters
    public int getSponsorId() {
        return sponsorId;
    }

    public void setSponsorId(int sponsorId) {
        this.sponsorId = sponsorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getContribution() {
        return contribution;
    }

    public void setContribution(double contribution) {
        this.contribution = contribution;
    }
     public void displayDetails()
    {
    	System.out.println("Sponsor details:");
        System.out.println("SponsorId: "+sponsorId);
        System.out.println("Name: "+name);
        System.out.println("Contribution: "+contribution);
    }
}

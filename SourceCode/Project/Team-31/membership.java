package java_programs.Fitness_Class_Booking_Platform;

import java.util.Date;

public class Membership {
    private int membershipId;
    private String type;
    private Date startDate, endDate;

    public Membership(int membershipId, String type, Date startDate, Date endDate) {
        this.membershipId = membershipId;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getType() {
        return type;
    }

    public void displayMembership() {
        System.out.println("Membership ID: " + membershipId);
        System.out.println("Type: " + type);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
    }
}

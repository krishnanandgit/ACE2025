package java_programs.Fitness_Class_Booking_Platform;

import java.util.Date;

public class Payment {
    private int paymentId;
    private double amount;
    private Date date;

    public Payment(int paymentId, double amount, Date date) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.date = date;
    }

    public void displayPayment() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Amount: " + amount);
        System.out.println("Date: " + date);
    }
}

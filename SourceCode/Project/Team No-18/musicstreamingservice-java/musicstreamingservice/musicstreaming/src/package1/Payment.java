package package1;

import java.util.Date;

public class Payment {
    private int paymentId;
    private double amount;
    private Date date;
    private int userId;

    public Payment(int paymentId, double amount, Date date, int userId) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.date = date;
        this.userId = userId;
    }

    // Getters and setters

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
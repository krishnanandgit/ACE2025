package java_programs.Fitness_Class_Booking_Platform;

public class Booking {
    private int bookingId;
    private User user;
    private FitnessClass fitnessClass;
    private Payment payment;

    public Booking(int bookingId, User user, FitnessClass fitnessClass, Payment payment) {
        this.bookingId = bookingId;
        this.user = user;
        this.fitnessClass = fitnessClass;
        this.payment = payment;
    }

    public void displayBooking() {
        System.out.println("Booking ID: " + bookingId);
        user.displayUser();
        fitnessClass.displayFitnessClass();
        payment.displayPayment();
    }
}

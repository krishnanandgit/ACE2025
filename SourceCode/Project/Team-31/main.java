package java_programs.Fitness_Class_Booking_Platform;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create an instructor
        Instructor instructor = new Instructor(1, "Bob", "Yoga");

        // Create a location
        Location location = new Location(1, "123 Fitness St.");

        // Create a schedule
        Schedule schedule = new Schedule(1, new Date(), new Date());

        // Create a fitness class
        FitnessClass yogaClass = new FitnessClass(1, "Yoga", instructor, schedule, location);

        // Create a user
        User user = new User(1, "Alice", "alice@example.com", "456 Health Ave.", "123-456-7890");

        // Create a membership and assign to the user
        Membership membership = new Membership(1, "Premium", new Date(), new Date());
        user.setMembership(membership);

        // Create a payment
        Payment payment = new Payment(1, 20.0, new Date());

        // Create a booking
        Booking booking = new Booking(1, user, yogaClass, payment);

        // Add the user to the fitness class
        yogaClass.addAttendee(user);

        // Record attendance
        Attendance attendance = new Attendance(1, user, yogaClass, new Date());

        // Create a review
        Review review = new Review(1, user, yogaClass, "Great class!", 5);

        // Output for demonstration
        System.out.println("User " + user.getName() + " booked " + yogaClass.getName() + " class with " + instructor.getName() + ".");
        System.out.println("Review: " + review.getComment() + " Rating: " + review.getRating());
    }
}

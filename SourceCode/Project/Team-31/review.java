package java_programs.Fitness_Class_Booking_Platform;

public class Review {
    private int reviewId;
    private User user;
    private FitnessClass fitnessClass;
    private String comment;
    private int rating;

    public Review(int reviewId, User user, FitnessClass fitnessClass, String comment, int rating) {
        this.reviewId = reviewId;
        this.user = user;
        this.fitnessClass = fitnessClass;
        this.comment = comment;
        this.rating = rating;
    }

    public void displayReview() {
        System.out.println("Review ID: " + reviewId);
        user.displayUser();
        fitnessClass.displayFitnessClass();
        System.out.println("Comment: " + comment);
        System.out.println("Rating: " + rating);
    }
}

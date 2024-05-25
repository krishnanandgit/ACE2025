package freelancer;

public class Review {
    private int id;
    private User reviewer; // Can be either Client or Freelancer
    private User reviewedUser; // Can be either Client or Freelancer
    private int rating;
    private String comment;
    // Constructors, getters, setters
}

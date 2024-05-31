public class Review {
    private User reviewer;
    private User reviewee;
    private String comments;
    private int rating; // Rating out of 5
    public Review(User reviewer, User reviewee, String comments, int rating) {
        this.reviewer = reviewer;
        this.reviewee = reviewee;
        this.comments = comments;
        this.rating = rating;
    }
    public String getComments() {
        return comments;
    }
    public int getRating() {
        return rating;
    }
}

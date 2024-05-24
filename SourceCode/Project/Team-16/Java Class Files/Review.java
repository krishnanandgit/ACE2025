public class Review {

    int reviewId;
    int rating;
    String comments;

    public int getReviewId() {
        return reviewId;
    }
    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }

    public void displayReviewDetails() {
        System.out.println("Review ID : " + reviewId);
        System.out.println("Rating : " + rating);
        System.out.println("Comments : " + comments);
    }
    
}

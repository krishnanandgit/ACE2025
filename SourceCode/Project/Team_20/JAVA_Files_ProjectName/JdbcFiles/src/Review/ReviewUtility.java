package Review;


public class ReviewUtility {
    private ReviewDAO reviewDAO;

    public ReviewUtility() {
        reviewDAO = new ReviewDAO();
    }

    public void addReview(int reviewId, int auctionId, int bidderId, String comment, int rating) {
        Review newReview = new Review(reviewId, auctionId, bidderId, comment, rating);
        reviewDAO.addReview(newReview);
    }

    public Review getReview(int reviewId) {
        return reviewDAO.getReviewById(reviewId);
    }

    public void updateReview(int reviewId, String newComment, int newRating) {
        reviewDAO.updateReview(reviewId, newComment, newRating);
    }

    public void deleteReview(int reviewId) {
        reviewDAO.deleteReview(reviewId);
    }

    public void displayReviews() {
        reviewDAO.displayAllReviews();
    }
}

package Review;
public class Main {
    public static void main(String[] args) {
        ReviewDAO reviewDAO = new ReviewDAO();
        
        reviewDAO.createTable();
        
        reviewDAO.addReview(new Review(1, 101, 1001, "Great auction", 5));
        reviewDAO.addReview(new Review(2, 102, 1002, "Not satisfied", 2));
        
        reviewDAO.displayAllReviews();
        
        reviewDAO.updateReview(1, "Amazing auction!", 5);
        
        reviewDAO.displayAllReviews();
        
        Review review = reviewDAO.getReviewById(1);
        if (review != null) {
            System.out.println("Fetched review: " + review);
        }

        reviewDAO.deleteReview(2);
        
        reviewDAO.displayAllReviews();
    }
}

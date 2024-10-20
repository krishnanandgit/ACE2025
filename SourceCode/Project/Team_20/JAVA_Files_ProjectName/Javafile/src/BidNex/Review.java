package Demo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Review {
 private String reviewID;
 private User reviewer;
 private User reviewee;
 private String comments;
 private int rating;
 private Item item;

 public Review(String reviewID, User reviewer, User reviewee, String comments, int rating, Item item) 
         throws InvalidRatingException, EmptyReviewContentException, ItemNotFoundForReviewException {
     if (rating < 1 || rating > 5) {
         throw new InvalidRatingException("Rating must be between 1 and 5.");
     }
     if (comments == null || comments.trim().isEmpty()) {
         throw new EmptyReviewContentException("Review comments cannot be empty.");
     }
     if (item == null) {
         throw new ItemNotFoundForReviewException("Item for review not found.");
     }
     this.reviewID = reviewID;
     this.reviewer = reviewer;
     this.reviewee = reviewee;
     this.comments = comments;
     this.rating = rating;
     this.item = item;
 }

 public String getComments() {
     return comments;
 }

 public int getRating() {
     return rating;
 }

 public User getReviewer() {
     return reviewer;
 }

 public User getReviewee() {
     return reviewee;
 }

 public String getReviewID() {
     return reviewID;
 }

 public Item getItem() {
     return item;
 }

 public void setComments(String comments) throws EmptyReviewContentException {
     if (comments == null || comments.trim().isEmpty()) {
         throw new EmptyReviewContentException("Review comments cannot be empty.");
     }
     this.comments = comments;
 }

 public void setRating(int rating) throws InvalidRatingException {
     if (rating < 1 || rating > 5) {
         throw new InvalidRatingException("Rating must be between 1 and 5.");
     }
     this.rating = rating;
 }
}

class ReviewNotFoundException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public ReviewNotFoundException(String message) {
     super(message);
 }
}

class InvalidRatingException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InvalidRatingException(String message) {
     super(message);
 }
}

class EmptyReviewContentException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public EmptyReviewContentException(String message) {
     super(message);
 }
}

class ItemNotFoundForReviewException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public ItemNotFoundForReviewException(String message) {
     super(message);
 }


 private Map<String, Review> reviewMap = new HashMap<>();
 private Map<String, List<Review>> itemReviews = new HashMap<>();

 public void validateReview(Review review) throws InvalidRatingException, EmptyReviewContentException {
     if (review.getRating() < 1 || review.getRating() > 5) {
         throw new InvalidRatingException("Rating must be between 1 and 5.");
     }
     if (review.getComments() == null || review.getComments().trim().isEmpty()) {
         throw new EmptyReviewContentException("Review comments cannot be empty.");
     }
 }

 public double calculateAverageRatingForItem(Item item) throws ReviewNotFoundException {
     List<Review> reviews = itemReviews.get(item.getItemID());
     if (reviews == null || reviews.isEmpty()) {
         throw new ReviewNotFoundException("No reviews found for the item.");
     }
     double totalRating = 0;
     for (Review review : reviews) {
         totalRating += review.getRating();
     }
     return totalRating / reviews.size();
 }

 public List<Review> retrieveReviewsForItem(String itemID) throws ReviewNotFoundException {
     List<Review> reviews = itemReviews.get(itemID);
     if (reviews == null || reviews.isEmpty()) {
         throw new ReviewNotFoundException("No reviews found for the item ID: " + itemID);
     }
     return reviews;
 }

 public void deleteReview(String reviewID) throws ReviewNotFoundException {
     Review review = reviewMap.remove(reviewID);
     if (review == null) {
         throw new ReviewNotFoundException("Review not found for ID: " + reviewID);
     }
     itemReviews.get(review.getItem().getItemID()).remove(review);
 }

 public void flagInappropriateReview(String reviewID) throws ReviewNotFoundException {
     Review review = reviewMap.get(reviewID);
     if (review == null) {
         throw new ReviewNotFoundException("Review not found for ID: " + reviewID);
     }
     System.out.println("Review flagged for inappropriate content: " + review.getComments());
 }

 public void addReview(String reviewID, User reviewer, User reviewee, String comments, int rating, Item item)
         throws InvalidRatingException, EmptyReviewContentException, ItemNotFoundForReviewException {
     Review review = new Review(reviewID, reviewer, reviewee, comments, rating, item);
     validateReview(review);
     reviewMap.put(reviewID, review);
     itemReviews.computeIfAbsent(item.getItemID(), k -> new ArrayList<>()).add(review);
 }
}

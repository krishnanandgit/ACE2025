package Review;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReviewDAO {
    private String url = "jdbc:mysql://localhost:3306/ebox"; 
    private String user = "root";
    private String password = "root1903"; 

    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS review (" +
                     "review_id INT PRIMARY KEY, " +
                     "auction_id INT, " +
                     "bidder_id INT, " +
                     "comment VARCHAR(255), " +
                     "rating INT NOT NULL);";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.executeUpdate();
            System.out.println("Review table created successfully or already exists.");
        } catch (Exception e) {
            System.out.println("Error creating review table: " + e.getMessage());
        }
    }
    public void addReview(Review review) {
        String sql = "INSERT INTO review (review_id, auction_id, bidder_id, comment, rating) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, review.getReviewId());
            statement.setInt(2, review.getAuctionId());
            statement.setInt(3, review.getBidderId());
            statement.setString(4, review.getComment());
            statement.setInt(5, review.getRating());
            statement.executeUpdate();
            connection.commit();
            System.out.println("Review added: " + review);
        } catch (Exception e) {
            System.out.println("Error adding review: " + e.getMessage());
        }
    }

    public Review getReviewById(int reviewId) {
        String sql = "SELECT * FROM review WHERE review_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, reviewId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Review(resultSet.getInt("review_id"),
                                  resultSet.getInt("auction_id"),
                                  resultSet.getInt("bidder_id"),
                                  resultSet.getString("comment"),
                                  resultSet.getInt("rating"));
            }
        } catch (Exception e) {
            System.out.println("Error retrieving review: " + e.getMessage());
        }
        return null; 
    }

    public void updateReview(int reviewId, String newComment, int newRating) {
        String sql = "UPDATE review SET comment = ?, rating = ? WHERE review_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setString(1, newComment);
            statement.setInt(2, newRating);
            statement.setInt(3, reviewId);
            statement.executeUpdate();
            connection.commit();
            System.out.println("Review updated successfully.");
        } catch (Exception e) {
            System.out.println("Error updating review: " + e.getMessage());
        }
    }

    public void deleteReview(int reviewId) {
        String sql = "DELETE FROM review WHERE review_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, reviewId);
            statement.executeUpdate();
            connection.commit();
            System.out.println("Review deleted successfully.");
        } catch (Exception e) {
            System.out.println("Error deleting review: " + e.getMessage());
        }
    }

    public void displayAllReviews() {
        String sql = "SELECT * FROM review";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
             
            while (resultSet.next()) {
                System.out.println("Review ID: " + resultSet.getInt("review_id") +
                                   ", Auction ID: " + resultSet.getInt("auction_id") +
                                   ", Bidder ID: " + resultSet.getInt("bidder_id") +
                                   ", Comment: " + resultSet.getString("comment") +
                                   ", Rating: " + resultSet.getInt("rating"));
            }
        } catch (Exception e) {
            System.out.println("Error displaying reviews: " + e.getMessage());
        }
    }
}

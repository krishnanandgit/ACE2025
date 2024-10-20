package auction;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AuctionDAO {
    private String url = "jdbc:mysql://localhost:3306/ebox";
    private String user = "root"; 
    private String password = "root1903"; 

  
    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS auction (" +
                     "auction_id INT PRIMARY KEY, " +
                     "start_time VARCHAR(255) NOT NULL, " + 
                     "end_time VARCHAR(255) NOT NULL, " +
                     "status INT NOT NULL, " +
                     "reserve_price INT NOT NULL);";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.executeUpdate();
            System.out.println("Auction table created successfully or already exists.");
        } catch (Exception e) { 
            System.out.println("Error creating auction table: " + e.getMessage());
        }
    }
    public void addAuction(Auction auction) {
        String sql = "INSERT INTO auction (auction_id, start_time, end_time, status, reserve_price) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, auction.getAuctionId());
            statement.setString(2, auction.getStartTime());
            statement.setString(3, auction.getEndTime());
            statement.setInt(4, auction.getStatus());
            statement.setInt(5, auction.getReservePrice());
            statement.executeUpdate();

            connection.commit();
            System.out.println("Auction added: " + auction);
        } catch (Exception e) { 
            System.out.println("Error adding auction: " + e.getMessage());
        }
    }
    public Auction getAuctionById(int auctionId) {
        String sql = "SELECT * FROM auction WHERE auction_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, auctionId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Auction(resultSet.getInt("auction_id"),
                                   resultSet.getString("start_time"),
                                   resultSet.getString("end_time"),
                                   resultSet.getInt("status"),
                                   resultSet.getInt("reserve_price"));
            }
        } catch (Exception e) { 
            System.out.println("Error retrieving auction: " + e.getMessage());
        }
        return null; 
    }
    public void updateAuction(int auctionId, String newStartTime, String newEndTime, int newStatus, int newReservePrice) {
        String sql = "UPDATE auction SET start_time = ?, end_time = ?, status = ?, reserve_price = ? WHERE auction_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setString(1, newStartTime);
            statement.setString(2, newEndTime);
            statement.setInt(3, newStatus);
            statement.setInt(4, newReservePrice);
            statement.setInt(5, auctionId);
            statement.executeUpdate();

            connection.commit();
            System.out.println("Auction updated successfully.");
        } catch (Exception e) { 
            System.out.println("Error updating auction: " + e.getMessage());
        }
    }    public void deleteAuction(int auctionId) {
        String sql = "DELETE FROM auction WHERE auction_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, auctionId);
            statement.executeUpdate();

            connection.commit();
            System.out.println("Auction deleted successfully.");
        } catch (Exception e) { 
            System.out.println("Error deleting auction: " + e.getMessage());
        }
    }
    public void displayAllAuctions() {
        String sql = "SELECT * FROM auction";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
             
            while (resultSet.next()) {
                System.out.println("Auction ID: " + resultSet.getInt("auction_id") +
                                   ", Start Time: " + resultSet.getString("start_time") +
                                   ", End Time: " + resultSet.getString("end_time") +
                                   ", Status: " + resultSet.getInt("status") +
                                   ", Reserve Price: " + resultSet.getInt("reserve_price"));
            }
        } catch (Exception e) { 
            System.out.println("Error displaying auctions: " + e.getMessage());
        }
    }
}

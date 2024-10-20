package Bidder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BidderDAO {
    private String url = "jdbc:mysql://localhost:3306/ebox"; 
    private String user = "root"; 
    private String password = "root1903"; 

    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS bidder (" +
                     "bidder_id INT PRIMARY KEY, " +
                     "username VARCHAR(255), " +
                     "email VARCHAR(255) NOT NULL, " +
                     "password VARCHAR(255) NOT NULL);";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.executeUpdate();
            System.out.println("Bidder table created successfully or already exists.");
        } catch (Exception e) { 
            System.out.println("Error creating bidder table: " + e.getMessage());
        }
    }
    public void addBidder(bidder bidder) {
        String sql = "INSERT INTO bidder (bidder_id, username, email, password) VALUES (?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, bidder.getBidderId());
            statement.setString(2, bidder.getUsername());
            statement.setString(3, bidder.getEmail());
            statement.setString(4, bidder.getPassword());
            statement.executeUpdate();

            connection.commit();
            System.out.println("Bidder added: " + bidder);
        } catch (Exception e) { 
            System.out.println("Error adding bidder: " + e.getMessage());
        }
    }

    public bidder getBidderById(int bidderId) {
        String sql = "SELECT * FROM bidder WHERE bidder_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, bidderId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new bidder(resultSet.getInt("bidder_id"),
                                  resultSet.getString("username"),
                                  resultSet.getString("email"),
                                  resultSet.getString("password"));
            }
        } catch (Exception e) { 
            System.out.println("Error retrieving bidder: " + e.getMessage());
        }
        return null;
    }

    public void updateBidder(int bidderId, String newUsername, String newEmail, String newPassword) {
        String sql = "UPDATE bidder SET username = ?, email = ?, password = ? WHERE bidder_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setString(1, newUsername);
            statement.setString(2, newEmail);
            statement.setString(3, newPassword);
            statement.setInt(4, bidderId);
            statement.executeUpdate();

            connection.commit();
            System.out.println("Bidder updated successfully.");
        } catch (Exception e) { 
            System.out.println("Error updating bidder: " + e.getMessage());
        }
    }

    public void deleteBidder(int bidderId) {
        String sql = "DELETE FROM bidder WHERE bidder_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, bidderId);
            statement.executeUpdate();

            connection.commit();
            System.out.println("Bidder deleted successfully.");
        } catch (Exception e) { 
            System.out.println("Error deleting bidder: " + e.getMessage());
        }
    }

    public void displayAllBidders() {
        String sql = "SELECT * FROM bidder";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
             
            while (resultSet.next()) {
                System.out.println("Bidder ID: " + resultSet.getInt("bidder_id") +
                                   ", Username: " + resultSet.getString("username") +
                                   ", Email: " + resultSet.getString("email") +
                                   ", Password: " + resultSet.getString("password"));
            }
        } catch (Exception e) { 
            System.out.println("Error displaying bidders: " + e.getMessage());
        }
    }
}

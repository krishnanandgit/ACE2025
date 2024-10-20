package Shipping;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ShippingDAO {
    private String url = "jdbc:mysql://localhost:3306/ebox"; 
    private String user = "root"; 
    private String password = "root1903"; 

    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS shipping (" +
                     "shipping_id INT PRIMARY KEY, " +
                     "auction_id INT REFERENCES auction(auction_id), " +
                     "bidder_id INT REFERENCES bidder(bidder_id), " +
                     "shipping_status TINYINT, " +
                     "shipping_address VARCHAR(255) NOT NULL);";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.executeUpdate();
            System.out.println("Shipping table created successfully or already exists.");
        } catch (Exception e) {
            System.out.println("Error creating shipping table: " + e.getMessage());
        }
    }
    public void addShipping(Shipping shipping) {
        String sql = "INSERT INTO shipping (shipping_id, auction_id, bidder_id, shipping_status, shipping_address) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, shipping.getShippingId());
            statement.setInt(2, shipping.getAuctionId());
            statement.setInt(3, shipping.getBidderId());
            statement.setInt(4, shipping.getShippingStatus());
            statement.setString(5, shipping.getShippingAddress());
            statement.executeUpdate();
            connection.commit();
            System.out.println("Shipping added: " + shipping);
        } catch (Exception e) {
            System.out.println("Error adding shipping: " + e.getMessage());
        }
    }

    public Shipping getShippingById(int shippingId) {
        String sql = "SELECT * FROM shipping WHERE shipping_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, shippingId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Shipping(resultSet.getInt("shipping_id"),
                                    resultSet.getInt("auction_id"),
                                    resultSet.getInt("bidder_id"),
                                    resultSet.getInt("shipping_status"),
                                    resultSet.getString("shipping_address"));
            }
        } catch (Exception e) {
            System.out.println("Error retrieving shipping: " + e.getMessage());
        }
        return null;
    }

    public void updateShipping(int shippingId, int newAuctionId, int newBidderId, int newShippingStatus, String newShippingAddress) {
        String sql = "UPDATE shipping SET auction_id = ?, bidder_id = ?, shipping_status = ?, shipping_address = ? WHERE shipping_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, newAuctionId);
            statement.setInt(2, newBidderId);
            statement.setInt(3, newShippingStatus);
            statement.setString(4, newShippingAddress);
            statement.setInt(5, shippingId);
            statement.executeUpdate();
            connection.commit();
            System.out.println("Shipping updated successfully.");
        } catch (Exception e) {
            System.out.println("Error updating shipping: " + e.getMessage());
        }
    }

    public void deleteShipping(int shippingId) {
        String sql = "DELETE FROM shipping WHERE shipping_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, shippingId);
            statement.executeUpdate();
            connection.commit();
            System.out.println("Shipping deleted successfully.");
        } catch (Exception e) {
            System.out.println("Error deleting shipping: " + e.getMessage());
        }
    }

    public void displayAllShippings() {
        String sql = "SELECT * FROM shipping";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
             
            while (resultSet.next()) {
                System.out.println("Shipping ID: " + resultSet.getInt("shipping_id") +
                                   ", Auction ID: " + resultSet.getInt("auction_id") +
                                   ", Bidder ID: " + resultSet.getInt("bidder_id") +
                                   ", Shipping Status: " + resultSet.getInt("shipping_status") +
                                   ", Shipping Address: " + resultSet.getString("shipping_address"));
            }
        } catch (Exception e) {
            System.out.println("Error displaying shippings: " + e.getMessage());
        }
    }
}

package Auctioneer;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AuctioneerDAO {
    private String url = "jdbc:mysql://localhost:3306/ebox"; 
    private String user = "root"; 
    private String password = "root1903"; 

    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS auctioneer (" +
                     "auctioneer_id INT PRIMARY KEY, " +
                     "name VARCHAR(255), " +
                     "contact_info VARCHAR(255) UNIQUE);";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.executeUpdate();
            System.out.println("Auctioneer table created successfully or already exists.");
        } catch (Exception e) { 
            System.out.println("Error creating auctioneer table: " + e.getMessage());
        }
    }
    public void addAuctioneer(Auctioneer auctioneer) {
        String sql = "INSERT INTO auctioneer (auctioneer_id, name, contact_info) VALUES (?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, auctioneer.getAuctioneerId());
            statement.setString(2, auctioneer.getName());
            statement.setString(3, auctioneer.getContactInfo());
            statement.executeUpdate();

            System.out.println("Auctioneer added: " + auctioneer);
        } catch (Exception e) { // Catching general Exception instead of SQLException
            System.out.println("Error adding auctioneer: " + e.getMessage());
        }
    }
    public Auctioneer getAuctioneerById(int auctioneerId) {
        String sql = "SELECT * FROM auctioneer WHERE auctioneer_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, auctioneerId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Auctioneer(resultSet.getInt("auctioneer_id"),
                                      resultSet.getString("name"),
                                      resultSet.getString("contact_info"));
            }
        } catch (Exception e) { 
            System.out.println("Error retrieving auctioneer: " + e.getMessage());
        }
        return null; 
    }
    public void updateAuctioneer(int auctioneerId, String newName, String newContactInfo) {
        String sql = "UPDATE auctioneer SET name = ?, contact_info = ? WHERE auctioneer_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setString(1, newName);
            statement.setString(2, newContactInfo);
            statement.setInt(3, auctioneerId);
            statement.executeUpdate();

            System.out.println("Auctioneer updated successfully.");
        } catch (Exception e) { 
            System.out.println("Error updating auctioneer: " + e.getMessage());
        }
    }

    public void deleteAuctioneer(int auctioneerId) {
        String sql = "DELETE FROM auctioneer WHERE auctioneer_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, auctioneerId);
            statement.executeUpdate();

            System.out.println("Auctioneer deleted successfully.");
        } catch (Exception e) { 
            System.out.println("Error deleting auctioneer: " + e.getMessage());
        }
    }

    public void displayAllAuctioneers() {
        String sql = "SELECT * FROM auctioneer";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
             
            while (resultSet.next()) {
                System.out.println("Auctioneer ID: " + resultSet.getInt("auctioneer_id") +
                                   ", Name: " + resultSet.getString("name") +
                                   ", Contact Info: " + resultSet.getString("contact_info"));
            }
        } catch (Exception e) { 
            System.out.println("Error displaying auctioneers: " + e.getMessage());
        }
    }
}

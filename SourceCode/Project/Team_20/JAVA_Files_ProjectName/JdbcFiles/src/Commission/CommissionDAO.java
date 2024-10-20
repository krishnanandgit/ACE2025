package Commission;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CommissionDAO {
    private String url = "jdbc:mysql://localhost:3306/ebox"; 
    private String user = "root"; 
    private String password = "root1903"; 
    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS commission (" +
                     "commission_id INT PRIMARY KEY, " +
                     "auction_id INT REFERENCES auction(auction_id), " +
                     "commission_amount INT NOT NULL);";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.executeUpdate();
            System.out.println("Commission table created successfully or already exists.");
        } catch (Exception e) {
            System.out.println("Error creating commission table: " + e.getMessage());
        }
    }

    public void addCommission(Commission commission) {
        String sql = "INSERT INTO commission (commission_id, auction_id, commission_amount) VALUES (?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, commission.getCommissionId());
            statement.setInt(2, commission.getAuctionId());
            statement.setInt(3, commission.getCommissionAmount());
            statement.executeUpdate();
            connection.commit();
            System.out.println("Commission added: " + commission);
        } catch (Exception e) {
            System.out.println("Error adding commission: " + e.getMessage());
        }
    }

    public Commission getCommissionById(int commissionId) {
        String sql = "SELECT * FROM commission WHERE commission_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, commissionId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Commission(resultSet.getInt("commission_id"),
                                      resultSet.getInt("auction_id"),
                                      resultSet.getInt("commission_amount"));
            }
        } catch (Exception e) {
            System.out.println("Error retrieving commission: " + e.getMessage());
        }
        return null;
    }

    public void updateCommission(int commissionId, int newAuctionId, int newCommissionAmount) {
        String sql = "UPDATE commission SET auction_id = ?, commission_amount = ? WHERE commission_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, newAuctionId);
            statement.setInt(2, newCommissionAmount);
            statement.setInt(3, commissionId);
            statement.executeUpdate();
            connection.commit();
            System.out.println("Commission updated successfully.");
        } catch (Exception e) {
            System.out.println("Error updating commission: " + e.getMessage());
        }
    }

    public void deleteCommission(int commissionId) {
        String sql = "DELETE FROM commission WHERE commission_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, commissionId);
            statement.executeUpdate();
            connection.commit();
            System.out.println("Commission deleted successfully.");
        } catch (Exception e) {
            System.out.println("Error deleting commission: " + e.getMessage());
        }
    }

    public void displayAllCommissions() {
        String sql = "SELECT * FROM commission";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
             
            while (resultSet.next()) {
                System.out.println("Commission ID: " + resultSet.getInt("commission_id") +
                                   ", Auction ID: " + resultSet.getInt("auction_id") +
                                   ", Commission Amount: " + resultSet.getInt("commission_amount"));
            }
        } catch (Exception e) {
            System.out.println("Error displaying commissions: " + e.getMessage());
        }
    }
}

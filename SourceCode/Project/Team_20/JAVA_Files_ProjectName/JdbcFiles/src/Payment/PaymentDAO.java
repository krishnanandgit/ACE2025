package Payment;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PaymentDAO {
    private String url = "jdbc:mysql://localhost:3306/ebox"; 
    private String user = "root"; 
    private String password = "root1903"; 
    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS payment (" +
                     "payment_id INT PRIMARY KEY, " +
                     "amount INT NOT NULL, " +
                     "payment_date VARCHAR(255) NOT NULL, " +
                     "bidder_id INT REFERENCES bidder(bidder_id), " +
                     "auction_id INT REFERENCES auction(auction_id), " +
                     "auctioneer_id INT REFERENCES auctioneer(auctioneer_id));";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.executeUpdate();
            System.out.println("Payment table created successfully or already exists.");
        } catch (Exception e) {
            System.out.println("Error creating payment table: " + e.getMessage());
        }
    }
    public void addPayment(Payment payment) {
        String sql = "INSERT INTO payment (payment_id, amount, payment_date, bidder_id, auction_id, auctioneer_id) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, payment.getPaymentId());
            statement.setInt(2, payment.getAmount());
            statement.setString(3, payment.getPaymentDate());
            statement.setInt(4, payment.getBidderId());
            statement.setInt(5, payment.getAuctionId());
            statement.setInt(6, payment.getAuctioneerId());
            statement.executeUpdate();
            connection.commit();
            System.out.println("Payment added: " + payment);
        } catch (Exception e) {
            System.out.println("Error adding payment: " + e.getMessage());
        }
    }

    public Payment getPaymentById(int paymentId) {
        String sql = "SELECT * FROM payment WHERE payment_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, paymentId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Payment(resultSet.getInt("payment_id"),
                                   resultSet.getInt("amount"),
                                   resultSet.getString("payment_date"),
                                   resultSet.getInt("bidder_id"),
                                   resultSet.getInt("auction_id"),
                                   resultSet.getInt("auctioneer_id"));
            }
        } catch (Exception e) {
            System.out.println("Error retrieving payment: " + e.getMessage());
        }
        return null;
    }

    public void updatePayment(int paymentId, int newAmount, String newPaymentDate, int newBidderId, int newAuctionId, int newAuctioneerId) {
        String sql = "UPDATE payment SET amount = ?, payment_date = ?, bidder_id = ?, auction_id = ?, auctioneer_id = ? WHERE payment_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, newAmount);
            statement.setString(2, newPaymentDate);
            statement.setInt(3, newBidderId);
            statement.setInt(4, newAuctionId);
            statement.setInt(5, newAuctioneerId);
            statement.setInt(6, paymentId);
            statement.executeUpdate();
            connection.commit();
            System.out.println("Payment updated successfully.");
        } catch (Exception e) {
            System.out.println("Error updating payment: " + e.getMessage());
        }
    }

    public void deletePayment(int paymentId) {
        String sql = "DELETE FROM payment WHERE payment_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, paymentId);
            statement.executeUpdate();
            connection.commit();
            System.out.println("Payment deleted successfully.");
        } catch (Exception e) {
            System.out.println("Error deleting payment: " + e.getMessage());
        }
    }

    public void displayAllPayments() {
        String sql = "SELECT * FROM payment";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
             
            while (resultSet.next()) {
                System.out.println("Payment ID: " + resultSet.getInt("payment_id") +
                                   ", Amount: " + resultSet.getInt("amount") +
                                   ", Payment Date: " + resultSet.getString("payment_date") +
                                   ", Bidder ID: " + resultSet.getInt("bidder_id") +
                                   ", Auction ID: " + resultSet.getInt("auction_id") +
                                   ", Auctioneer ID: " + resultSet.getInt("auctioneer_id"));
            }
        } catch (Exception e) {
            System.out.println("Error displaying payments: " + e.getMessage());
        }
    }
}

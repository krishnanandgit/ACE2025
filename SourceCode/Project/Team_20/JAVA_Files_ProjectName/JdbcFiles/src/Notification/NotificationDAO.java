package Notification;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class NotificationDAO {
    private String url = "jdbc:mysql://localhost:3306/ebox"; // Replace with your database name
    private String user = "root"; // Replace with your username
    private String password = "root1903"; // Replace with your password

    // Method to create the notification table
    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS notification (" +
                     "notification_id INT PRIMARY KEY, " +
                     "message VARCHAR(255) NOT NULL, " +
                     "notification_type VARCHAR(255) NOT NULL, " +
                     "payment_id INT REFERENCES payment(payment_id));";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.executeUpdate();
            System.out.println("Notification table created successfully or already exists.");
        } catch (Exception e) {
            System.out.println("Error creating notification table: " + e.getMessage());
        }
    }

    // Create (Add Notification)
    public void addNotification(Notification notification) {
        String sql = "INSERT INTO notification (notification_id, message, notification_type, payment_id) VALUES (?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, notification.getNotificationId());
            statement.setString(2, notification.getMessage());
            statement.setString(3, notification.getNotificationType());
            statement.setInt(4, notification.getPaymentId());
            statement.executeUpdate();
            connection.commit();
            System.out.println("Notification added: " + notification);
        } catch (Exception e) {
            System.out.println("Error adding notification: " + e.getMessage());
        }
    }

    // Read (Get Notification by ID)
    public Notification getNotificationById(int notificationId) {
        String sql = "SELECT * FROM notification WHERE notification_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, notificationId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Notification(resultSet.getInt("notification_id"),
                                        resultSet.getString("message"),
                                        resultSet.getString("notification_type"),
                                        resultSet.getInt("payment_id"));
            }
        } catch (Exception e) {
            System.out.println("Error retrieving notification: " + e.getMessage());
        }
        return null;
    }

    // Update Notification
    public void updateNotification(int notificationId, String newMessage, String newNotificationType, int newPaymentId) {
        String sql = "UPDATE notification SET message = ?, notification_type = ?, payment_id = ? WHERE notification_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setString(1, newMessage);
            statement.setString(2, newNotificationType);
            statement.setInt(3, newPaymentId);
            statement.setInt(4, notificationId);
            statement.executeUpdate();
            connection.commit();
            System.out.println("Notification updated successfully.");
        } catch (Exception e) {
            System.out.println("Error updating notification: " + e.getMessage());
        }
    }

    // Delete Notification
    public void deleteNotification(int notificationId) {
        String sql = "DELETE FROM notification WHERE notification_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, notificationId);
            statement.executeUpdate();
            connection.commit();
            System.out.println("Notification deleted successfully.");
        } catch (Exception e) {
            System.out.println("Error deleting notification: " + e.getMessage());
        }
    }

    // Display All Notifications
    public void displayAllNotifications() {
        String sql = "SELECT * FROM notification";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
             
            while (resultSet.next()) {
                System.out.println("Notification ID: " + resultSet.getInt("notification_id") +
                                   ", Message: " + resultSet.getString("message") +
                                   ", Notification Type: " + resultSet.getString("notification_type") +
                                   ", Payment ID: " + resultSet.getInt("payment_id"));
            }
        } catch (Exception e) {
            System.out.println("Error displaying notifications: " + e.getMessage());
        }
    }
}

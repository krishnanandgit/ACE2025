package items;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ItemDAO {
    private String url = "jdbc:mysql://localhost:3306/ebox"; 
    private String user = "root"; 
    private String password = "root1903"; 

    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS item (" +
                     "item_id INT PRIMARY KEY, " +
                     "starting_price INT NOT NULL, " +
                     "description VARCHAR(255), " +
                     "title VARCHAR(255) NOT NULL);";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.executeUpdate();
            System.out.println("Item table created successfully or already exists.");
        } catch (Exception e) { 
            System.out.println("Error creating item table: " + e.getMessage());
        }
    }

   
    public void addItem(Item item) {
        String sql = "INSERT INTO item (item_id, starting_price, description, title) VALUES (?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, item.getItemId());
            statement.setInt(2, item.getStartingPrice());
            statement.setString(3, item.getDescription());
            statement.setString(4, item.getTitle());
            statement.executeUpdate();

            connection.commit();
            System.out.println("Item added: " + item);
        } catch (Exception e) { // Catching general Exception instead of SQLException
            System.out.println("Error adding item: " + e.getMessage());
        }
    }

    public Item getItemById(int itemId) {
        String sql = "SELECT * FROM item WHERE item_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, itemId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Item(resultSet.getInt("item_id"),
                                 resultSet.getInt("starting_price"),
                                 resultSet.getString("description"),
                                 resultSet.getString("title"));
            }
        } catch (Exception e) { 
            System.out.println("Error retrieving item: " + e.getMessage());
        }
        return null; 
    }

    public void updateItem(int itemId, int newStartingPrice, String newDescription, String newTitle) {
        String sql = "UPDATE item SET starting_price = ?, description = ?, title = ? WHERE item_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, newStartingPrice);
            statement.setString(2, newDescription);
            statement.setString(3, newTitle);
            statement.setInt(4, itemId);
            statement.executeUpdate();

            connection.commit();
            System.out.println("Item updated successfully.");
        } catch (Exception e) { 
            System.out.println("Error updating item: " + e.getMessage());
        }
    }

    public void deleteItem(int itemId) {
        String sql = "DELETE FROM item WHERE item_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, itemId);
            statement.executeUpdate();

            connection.commit();
            System.out.println("Item deleted successfully.");
        } catch (Exception e) { 
            System.out.println("Error deleting item: " + e.getMessage());
        }
    }
    public void displayAllItems() {
        String sql = "SELECT * FROM item";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
             
            while (resultSet.next()) {
                System.out.println("Item ID: " + resultSet.getInt("item_id") +
                                   ", Starting Price: " + resultSet.getInt("starting_price") +
                                   ", Description: " + resultSet.getString("description") +
                                   ", Title: " + resultSet.getString("title"));
            }
        } catch (Exception e) { 
            System.out.println("Error displaying items: " + e.getMessage());
        }
    }
}

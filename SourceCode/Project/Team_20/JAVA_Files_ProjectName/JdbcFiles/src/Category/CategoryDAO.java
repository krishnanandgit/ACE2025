package Category;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CategoryDAO {
    private String url = "jdbc:mysql://localhost:3306/ebox"; 
    private String user = "root"; 
    private String password = "root1903";

    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS category (" +
                     "category_id INT PRIMARY KEY, " +
                     "category_name VARCHAR(255));";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.executeUpdate();
            System.out.println("Category table created successfully or already exists.");
        } catch (Exception e) {
            System.out.println("Error creating category table: " + e.getMessage());
        }
    }
    public void addCategory(Category category) {
        String sql = "INSERT INTO category (category_id, category_name) VALUES (?, ?)";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, category.getCategoryId());
            statement.setString(2, category.getCategoryName());
            statement.executeUpdate();
            connection.commit();
            System.out.println("Category added: " + category);
        } catch (Exception e) {
            System.out.println("Error adding category: " + e.getMessage());
        }
    }

    public Category getCategoryById(int categoryId) {
        String sql = "SELECT * FROM category WHERE category_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, categoryId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Category(resultSet.getInt("category_id"),
                                    resultSet.getString("category_name"));
            }
        } catch (Exception e) {
            System.out.println("Error retrieving category: " + e.getMessage());
        }
        return null;
    }

    public void updateCategory(int categoryId, String newCategoryName) {
        String sql = "UPDATE category SET category_name = ? WHERE category_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setString(1, newCategoryName);
            statement.setInt(2, categoryId);
            statement.executeUpdate();
            connection.commit();
            System.out.println("Category updated successfully.");
        } catch (Exception e) {
            System.out.println("Error updating category: " + e.getMessage());
        }
    }

    public void deleteCategory(int categoryId) {
        String sql = "DELETE FROM category WHERE category_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            statement.setInt(1, categoryId);
            statement.executeUpdate();
            connection.commit();
            System.out.println("Category deleted successfully.");
        } catch (Exception e) {
            System.out.println("Error deleting category: " + e.getMessage());
        }
    }

    public void displayAllCategories() {
        String sql = "SELECT * FROM category";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
             
            while (resultSet.next()) {
                System.out.println("Category ID: " + resultSet.getInt("category_id") +
                                   ", Category Name: " + resultSet.getString("category_name"));
            }
        } catch (Exception e) {
            System.out.println("Error displaying categories: " + e.getMessage());
        }
    }
}

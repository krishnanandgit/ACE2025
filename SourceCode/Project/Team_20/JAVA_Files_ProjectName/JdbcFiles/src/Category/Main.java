package Category;


public class Main {
    public static void main(String[] args) {
        CategoryDAO categoryDAO = new CategoryDAO();
        
        categoryDAO.createTable();
        
        categoryDAO.addCategory(new Category(1, "Electronics"));
        categoryDAO.addCategory(new Category(2, "Home Appliances"));
        
        categoryDAO.displayAllCategories();
        
        categoryDAO.updateCategory(1, "Consumer Electronics");
        
        categoryDAO.displayAllCategories();
        
        Category category = categoryDAO.getCategoryById(1);
        if (category != null) {
            System.out.println("Fetched category: " + category);
        }

        categoryDAO.deleteCategory(2);
        
        categoryDAO.displayAllCategories();
    }
}

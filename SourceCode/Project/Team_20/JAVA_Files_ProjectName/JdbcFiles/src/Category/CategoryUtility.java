package Category;


public class CategoryUtility {
    private CategoryDAO categoryDAO;

    public CategoryUtility() {
        categoryDAO = new CategoryDAO();
    }

    public void addCategory(int categoryId, String categoryName) {
        Category newCategory = new Category(categoryId, categoryName);
        categoryDAO.addCategory(newCategory);
    }

    public Category getCategory(int categoryId) {
        return categoryDAO.getCategoryById(categoryId);
    }

    public void updateCategory(int categoryId, String newCategoryName) {
        categoryDAO.updateCategory(categoryId, newCategoryName);
    }

    public void deleteCategory(int categoryId) {
        categoryDAO.deleteCategory(categoryId);
    }

    public void displayCategories() {
        categoryDAO.displayAllCategories();
    }
}

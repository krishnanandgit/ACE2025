package Demo;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
public class Category {
 private String categoryID;
 private String name;
 private String parentCategoryID;

 public Category(String categoryID, String name, String parentCategoryID) throws InvalidCategoryNameException {
     if (name == null || name.trim().isEmpty() || name.length() > 50) {
         throw new InvalidCategoryNameException("Category name must be non-empty and less than 50 characters.");
     }
     this.categoryID = categoryID;
     this.name = name;
     this.parentCategoryID = parentCategoryID;
 }

 public String getCategoryID() {
     return categoryID;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) throws InvalidCategoryNameException {
     if (name == null || name.trim().isEmpty() || name.length() > 50) {
         throw new InvalidCategoryNameException("Category name must be non-empty and less than 50 characters.");
     }
     this.name = name;
 }

 public String getParentCategoryID() {
     return parentCategoryID;
 }

 public void setParentCategoryID(String parentCategoryID) {
     this.parentCategoryID = parentCategoryID;
 }
}

class CategoryNotFoundException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public CategoryNotFoundException(String message) {
     super(message);
 }
}

class InvalidCategoryNameException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InvalidCategoryNameException(String message) {
     super(message);
 }
}

class InvalidParentCategoryIDException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InvalidParentCategoryIDException(String message) {
     super(message);
 }



 private Map<String, Category> categoryMap = new HashMap<>();

 public void createCategory(String categoryID, String name, String parentCategoryID) throws InvalidCategoryNameException, InvalidParentCategoryIDException {
     if (categoryMap.containsKey(categoryID)) {
         throw new InvalidCategoryNameException("Category ID already exists.");
     }
     if (parentCategoryID != null && !categoryMap.containsKey(parentCategoryID)) {
         throw new InvalidParentCategoryIDException("Parent category ID is invalid.");
     }
     Category category = new Category(categoryID, name, parentCategoryID);
     categoryMap.put(categoryID, category);
 }

 public Category getCategoryByID(String categoryID) throws CategoryNotFoundException {
     if (!categoryMap.containsKey(categoryID)) {
         throw new CategoryNotFoundException("Category not found for ID: " + categoryID);
     }
     return categoryMap.get(categoryID);
 }

 public void updateCategoryName(String categoryID, String newName) throws CategoryNotFoundException, InvalidCategoryNameException {
     Category category = getCategoryByID(categoryID);
     category.setName(newName);
 }

 public void deleteCategory(String categoryID) throws CategoryNotFoundException {
     if (!categoryMap.containsKey(categoryID)) {
         throw new CategoryNotFoundException("Category not found for ID: " + categoryID);
     }
     categoryMap.remove(categoryID);
 }

 public List<Category> listSubcategories(String parentCategoryID) throws CategoryNotFoundException {
     if (parentCategoryID != null && !categoryMap.containsKey(parentCategoryID)) {
         throw new CategoryNotFoundException("Parent category not found for ID: " + parentCategoryID);
     }
     List<Category> subcategories = new ArrayList<>();
     for (Category category : categoryMap.values()) {
         if (parentCategoryID.equals(category.getParentCategoryID())) {
             subcategories.add(category);
         }
     }
     return subcategories;
 }

 public void validateCategoryName(String name) throws InvalidCategoryNameException {
     if (name == null || name.trim().isEmpty() || name.length() > 50) {
         throw new InvalidCategoryNameException("Category name must be non-empty and less than 50 characters.");
     }
 }
}

    
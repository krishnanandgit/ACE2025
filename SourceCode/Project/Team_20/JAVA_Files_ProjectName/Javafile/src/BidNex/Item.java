package Demo;
import java.util.HashMap;
import java.util.Map;


public class Item {
 private String itemID;
 private String itemName;
 private String description;
 private double startingBid;
 private String condition; 
 private Category category;
 private String auctionStatus;

 public Item(String itemID, String itemName, String description, double startingBid, String condition, Category category) 
         throws InvalidItemNameException, InvalidStartingPriceException, InvalidItemConditionException, InvalidCategoryException {
     if (itemName == null || itemName.trim().isEmpty() || itemName.length() > 50) {
         throw new InvalidItemNameException("Item name must be non-empty and less than 50 characters.");
     }
     if (startingBid <= 0) {
         throw new InvalidStartingPriceException("Starting bid must be greater than zero.");
     }
     if (!condition.equals("New") && !condition.equals("Used") && !condition.equals("Refurbished")) {
         throw new InvalidItemConditionException("Invalid item condition. Must be 'New', 'Used', or 'Refurbished'.");
     }
     if (category == null) {
         throw new InvalidCategoryException("Invalid category assigned to the item.");
     }
     this.itemID = itemID;
     this.itemName = itemName;
     this.setDescription(description);
     this.startingBid = startingBid;
     this.condition = condition;
     this.category = category;
     this.auctionStatus = "Not Started"; 
 }

 public String getItemID() {
     return itemID;
 }

 public String getItemName() {
     return itemName;
 }

 public void setItemName(String itemName) throws InvalidItemNameException {
     if (itemName == null || itemName.trim().isEmpty() || itemName.length() > 50) {
         throw new InvalidItemNameException("Item name must be non-empty and less than 50 characters.");
     }
     this.itemName = itemName;
 }

 public double getStartingBid() {
     return startingBid;
 }

 public void setStartingBid(double startingBid) throws InvalidStartingPriceException {
     if (startingBid <= 0) {
         throw new InvalidStartingPriceException("Starting bid must be greater than zero.");
     }
     this.startingBid = startingBid;
 }

 public String getCondition() {
     return condition;
 }

 public void setCondition(String condition) throws InvalidItemConditionException {
     if (!condition.equals("New") && !condition.equals("Used") && !condition.equals("Refurbished")) {
         throw new InvalidItemConditionException("Invalid item condition. Must be 'New', 'Used', or 'Refurbished'.");
     }
     this.condition = condition;
 }

 public Category getCategory() {
     return category;
 }

 public void setCategory(Category category) throws InvalidCategoryException {
     if (category == null) {
         throw new InvalidCategoryException("Invalid category assigned to the item.");
     }
     this.category = category;
 }

 public String getAuctionStatus() {
     return auctionStatus;
 }

 public void setAuctionStatus(String auctionStatus) throws ItemAuctionStatusException {
     if (!auctionStatus.equals("Not Started") && !auctionStatus.equals("Active") && !auctionStatus.equals("Closed")) {
         throw new ItemAuctionStatusException("Invalid auction status.");
     }
     this.auctionStatus = auctionStatus;
 }

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}
}

class ItemNotFoundException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public ItemNotFoundException(String message) {
     super(message);
 }
}

class InvalidItemNameException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InvalidItemNameException(String message) {
     super(message);
 }
}

class InvalidItemConditionException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InvalidItemConditionException(String message) {
     super(message);
 }
}

class InvalidStartingPriceException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InvalidStartingPriceException(String message) {
     super(message);
 }
}

class InvalidCategoryException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InvalidCategoryException(String message) {
     super(message);
 }
}

class ItemAuctionStatusException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public ItemAuctionStatusException(String message) {
     super(message);
 }
 private Map<String, Item> itemMap = new HashMap<>();

 public void validateItemName(String itemName) throws InvalidItemNameException {
     if (itemName == null || itemName.trim().isEmpty() || itemName.length() > 50) {
         throw new InvalidItemNameException("Item name must be non-empty and less than 50 characters.");
     }
 }

 public void validateStartingPrice(double startingBid) throws InvalidStartingPriceException {
     if (startingBid <= 0) {
         throw new InvalidStartingPriceException("Starting bid must be greater than zero.");
     }
 }

 public void validateItemCondition(String condition) throws InvalidItemConditionException {
     if (!condition.equals("New") && !condition.equals("Used") && !condition.equals("Refurbished")) {
         throw new InvalidItemConditionException("Invalid item condition. Must be 'New', 'Used', or 'Refurbished'.");
     }
 }

 public Item findItemByID(String itemID) throws ItemNotFoundException {
     if (!itemMap.containsKey(itemID)) {
         throw new ItemNotFoundException("Item not found for ID: " + itemID);
     }
     return itemMap.get(itemID);
 }

 public void categorizeItem(String itemID, Category category) throws ItemNotFoundException, InvalidCategoryException {
     Item item = findItemByID(itemID);
     item.setCategory(category);
 }

 public void updateAuctionStatus(String itemID, String newStatus) throws ItemNotFoundException, ItemAuctionStatusException {
     Item item = findItemByID(itemID);
     item.setAuctionStatus(newStatus);
 }

 public void addItem(String itemID, String itemName, String description, double startingBid, String condition, Category category)
         throws InvalidItemNameException, InvalidStartingPriceException, InvalidItemConditionException, InvalidCategoryException {
     Item item = new Item(itemID, itemName, description, startingBid, condition, category);
     itemMap.put(itemID, item);
 }
}



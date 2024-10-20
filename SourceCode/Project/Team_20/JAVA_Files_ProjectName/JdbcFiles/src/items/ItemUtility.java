package items;

public class ItemUtility {
    private ItemDAO itemDAO;

    public ItemUtility() {
        itemDAO = new ItemDAO();
    }

    public void addItem(int itemId, int startingPrice, String description, String title) {
        Item newItem = new Item(itemId, startingPrice, description, title);
        itemDAO.addItem(newItem);
    }

    public Item getItem(int itemId) {
        return itemDAO.getItemById(itemId);
    }

    public void updateItem(int itemId, int newStartingPrice, String newDescription, String newTitle) {
        itemDAO.updateItem(itemId, newStartingPrice, newDescription, newTitle);
    }

    public void deleteItem(int itemId) {
        itemDAO.deleteItem(itemId);
    }

    public void displayItems() {
        itemDAO.displayAllItems();
    }
}

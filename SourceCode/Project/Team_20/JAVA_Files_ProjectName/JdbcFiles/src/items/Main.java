package items;

public class Main {
    public static void main(String[] args) {
        ItemDAO itemDAO = new ItemDAO();
        
        itemDAO.addItem(new Item(1, 100, "A cool gadget", "Gadget"));
        itemDAO.addItem(new Item(2, 200, "A useful tool", "Tool"));
        
        itemDAO.displayAllItems();
        
        itemDAO.updateItem(1, 150, "An upgraded gadget", "Gadget 2.0");
        
        itemDAO.displayAllItems();
        
        Item item = itemDAO.getItemById(1);
        if (item != null) {
            System.out.println("Fetched item: " + item);
        }

        itemDAO.deleteItem(2);
        
        itemDAO.displayAllItems();
    }
}

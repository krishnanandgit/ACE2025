public class Inventory {
    
    private int itemID;
    private String itemName;
    private String category;
    private double unitPrice;
    private String supplier;

    
    public Inventory(int itemID, String itemName, String category, double unitPrice, String supplier) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.category = category;
        this.unitPrice = unitPrice;
        this.supplier = supplier;
    }

    
    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    
    public static void main(String[] args) {

        Inventory item = new Inventory(1, "Syringe", "Medical Supplies", 2.5, "ABC Medical Supplies");

        
        System.out.println("Item ID: " + item.getItemID());
        System.out.println("Item Name: " + item.getItemName());
        System.out.println("Category: " + item.getCategory());
        System.out.println("Unit Price: $" + item.getUnitPrice());
        System.out.println("Supplier: " + item.getSupplier());
    }
}

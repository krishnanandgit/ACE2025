public class Item {
    private String itemName;
    private String description;
    private double startingBid;
    private Category category;
    public Item(String itemName, String description, double startingBid, Category category) {
        this.itemName = itemName;
        this.description = description;
        this.startingBid = startingBid;
        this.category = category;
    }
    public String getItemName() {
        return itemName;
    }

    public double getStartingBid() {
        return startingBid;
    }

    public Category getCategory() {
        return category;
    }
}

package items;

public class Item {
    private int itemId;
    private int startingPrice;
    private String description;
    private String title;

    public Item(int itemId, int startingPrice, String description, String title) {
        this.itemId = itemId;
        this.startingPrice = startingPrice;
        this.description = description;
        this.title = title;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getStartingPrice() {
        return startingPrice;
    }

    public void setStartingPrice(int startingPrice) {
        this.startingPrice = startingPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", startingPrice=" + startingPrice +
                ", description='" + description + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}

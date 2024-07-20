public class Items {
    private int id;
    private String name;
    private String price;

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

   

    public static void main(String[] args) {
        
        Items item = new Items();
        item.setId(1);
        item.setName("Product A");
        item.setPrice("49.99");

        System.out.println("Item ID: " + item.getId());
        System.out.println("Item Name: " + item.getName());
        System.out.println("Item Price: " + item.getPrice());
    }
}
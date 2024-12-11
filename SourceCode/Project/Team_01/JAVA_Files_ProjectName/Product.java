public class Product {
    private int id;
    private String details;
    private String list;
    private int seller_id;

    public Product(int id, String details, String list, int seller_id) {
        this.id = id;
        this.details = details;
        this.list = list;
        this.seller_id = seller_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public int getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(int seller_id) {
        this.seller_id = seller_id;
    }


    public static void main(String[] args) {
        Product product = new Product(1, "Product details", "Product list", 42);
        System.out.println("Product ID: " + product.getId());
        System.out.println("Product Details: " + product.getDetails());
        System.out.println("Product List: " + product.getList());
        System.out.println("Seller ID: " + product.getSeller_id());
    }
}
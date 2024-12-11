public class OrderEntry {
    private int id;
    private int details;
    private String ordertype;
    private int customer_id;

    public OrderEntry(int id, int details, String ordertype, int customer_id) {
        this.id = id;
        this.details = details;
        this.ordertype = ordertype;
        this.customer_id = customer_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDetails() {
        return details;
    }

    public void setDetails(int details) {
        this.details = details;
    }

    public String getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public static void main(String[] args) {
        OrderEntry order = new OrderEntry(1, 123, "Online", 42);
        System.out.println("Order ID: " + order.getId());
        System.out.println("Order Details: " + order.getDetails());
        System.out.println("Order Type: " + order.getOrdertype());
        System.out.println("Customer ID: " + order.getCustomer_id());
    }
}
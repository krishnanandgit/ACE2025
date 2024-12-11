public class Customer {
    private int id;
    private String address;
    private int paymentId; 
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setAddress("123 Main St");
        customer.setPaymentId(123);

        System.out.println("Customer ID: " + customer.getId());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("Payment ID: " + customer.getPaymentId());
    }
}
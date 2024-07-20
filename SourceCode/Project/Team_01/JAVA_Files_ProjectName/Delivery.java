public class Delivery {
    private int id;
    private String name;
    private String date;
    private String address;
    private int paymentId; 

    
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

   
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
        
        Delivery delivery = new Delivery();
        delivery.setId(1);
        delivery.setName("John Doe");
        delivery.setDate("2024-05-24");
        delivery.setAddress("123 Main St");
        delivery.setPaymentId(123);

        System.out.println("Delivery ID: " + delivery.getId());
        System.out.println("Name: " + delivery.getName());
        System.out.println("Date: " + delivery.getDate());
        System.out.println("Address: " + delivery.getAddress());
        System.out.println("Payment ID: " + delivery.getPaymentId());
    }
}
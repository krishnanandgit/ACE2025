package package1;

public class Subscription {
    private int subscriptionId;
    private String name;
    private double price;

    public Subscription(int subscriptionId, String name, double price) {
        this.subscriptionId = subscriptionId;
        this.name = name;
        this.price = price;
    }

    // Getters and setters

    public int getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
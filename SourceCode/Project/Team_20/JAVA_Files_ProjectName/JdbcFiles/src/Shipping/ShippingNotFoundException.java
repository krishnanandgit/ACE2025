package Shipping;


public class ShippingNotFoundException {
    private String message;

    public ShippingNotFoundException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ReviewNotFoundException: " + message;
    }
}

   

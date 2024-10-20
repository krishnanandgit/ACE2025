package Shipping;


public class Main {
    public static void main(String[] args) {
        ShippingDAO shippingDAO = new ShippingDAO();
        
        shippingDAO.createTable();
        
        shippingDAO.addShipping(new Shipping(1, 101, 201, 1, "123 Main St"));
        shippingDAO.addShipping(new Shipping(2, 102, 202, 0, "456 Market St"));
        
        shippingDAO.displayAllShippings();
        
        shippingDAO.updateShipping(1, 103, 203, 1, "789 Elm St");
        
        shippingDAO.displayAllShippings();
        
        Shipping shipping = shippingDAO.getShippingById(1);
        if (shipping != null) {
            System.out.println("Fetched shipping: " + shipping);
        }

        shippingDAO.deleteShipping(2);
        
        shippingDAO.displayAllShippings();
    }
}

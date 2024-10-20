package Demo;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
public class Shipping {
 private Item item;
 private String address;
 private String trackingNumber;
 private String shippingStatus;
 private double shippingCost;
 private String shippingMethod;
 private LocalDate shippingDate;
 private LocalDate estimatedDeliveryDate;

 public Shipping(Item item, String address, String shippingMethod, double shippingCost, LocalDate shippingDate)
         throws InvalidShippingAddressException, ShippingCostException, InvalidShippingMethodException, InvalidShippingDateException {
     if (address == null || address.trim().isEmpty() || address.length() > 200) {
         throw new InvalidShippingAddressException("Shipping address cannot be empty or exceed 200 characters.");
     }
     if (shippingCost < 0) {
         throw new ShippingCostException("Shipping cost must be a positive value.");
     }
     if (!isValidShippingMethod(shippingMethod)) {
         throw new InvalidShippingMethodException("Unsupported shipping method: " + shippingMethod);
     }
     if (shippingDate.isAfter(LocalDate.now())) {
         throw new InvalidShippingDateException("Shipping date cannot be set in the future.");
     }
     this.item = item;
     this.address = address;
     this.shippingMethod = shippingMethod;
     this.shippingCost = shippingCost;
     this.shippingDate = shippingDate;
     this.shippingStatus = "Pending"; 
     this.estimatedDeliveryDate = calculateEstimatedDeliveryDate();
 }

 private boolean isValidShippingMethod(String shippingMethod) {
     return shippingMethod.equals("Standard") || shippingMethod.equals("Express") || shippingMethod.equals("Overnight");
 }

 private LocalDate calculateEstimatedDeliveryDate() {
     switch (this.shippingMethod) {
         case "Standard":
             return this.shippingDate.plusDays(5);
         case "Express":
             return this.shippingDate.plusDays(2);
         case "Overnight":
             return this.shippingDate.plusDays(1);
         default:
             return this.shippingDate.plusDays(5); // Default to standard if unknown method
     }
 }

 public String getAddress() {
     return address;
 }

 public String getTrackingNumber() {
     return trackingNumber;
 }

 public void setTrackingNumber(String trackingNumber) {
     this.trackingNumber = trackingNumber;
 }

 public String getShippingStatus() {
     return shippingStatus;
 }

 public void setShippingStatus(String shippingStatus) throws InvalidShippingStatusException {
     if (!isValidShippingStatus(shippingStatus)) {
         throw new InvalidShippingStatusException("Invalid shipping status: " + shippingStatus);
     }
     this.shippingStatus = shippingStatus;
 }

 private boolean isValidShippingStatus(String status) {
     return status.equals("Pending") || status.equals("Shipped") || status.equals("In Transit") || status.equals("Delivered");
 }

 public LocalDate getEstimatedDeliveryDate() {
     return estimatedDeliveryDate;
 }

 public Item getItem() {
     return item;
 }

 public double getShippingCost() {
     return shippingCost;
 }

 public LocalDate getShippingDate() {
     return shippingDate;
 }
}

//Custom Exception Classes
class ShippingNotFoundException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public ShippingNotFoundException(String message) {
     super(message);
 }
}

class InvalidShippingAddressException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InvalidShippingAddressException(String message) {
     super(message);
 }
}

class InvalidShippingDateException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InvalidShippingDateException(String message) {
     super(message);
 }
}

class InvalidDeliveryDateException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InvalidDeliveryDateException(String message) {
     super(message);
 }
}

class InvalidShippingMethodException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InvalidShippingMethodException(String message) {
     super(message);
 }
}

class ShippingCostException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public ShippingCostException(String message) {
     super(message);
 }
}

class InvalidShippingStatusException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InvalidShippingStatusException(String message) {
     super(message);
 }


 private Map<String, Shipping> shippingMap = new HashMap<>();
 public void validateShippingAddress(String address) throws InvalidShippingAddressException {
     if (address == null || address.trim().isEmpty() || address.length() > 200) {
         throw new InvalidShippingAddressException("Shipping address cannot be empty or exceed 200 characters.");
     }
 }

 public LocalDate calculateEstimatedDeliveryDate(String shippingMethod, LocalDate shippingDate) 
         throws InvalidShippingMethodException, InvalidShippingDateException {
     if (shippingDate.isAfter(LocalDate.now())) {
         throw new InvalidShippingDateException("Shipping date cannot be set in the future.");
     }
     switch (shippingMethod) {
         case "Standard":
             return shippingDate.plusDays(5);
         case "Express":
             return shippingDate.plusDays(2);
         case "Overnight":
             return shippingDate.plusDays(1);
         default:
             throw new InvalidShippingMethodException("Unsupported shipping method: " + shippingMethod);
     }
 }

 public void updateShippingStatus(String shippingID, String status) throws ShippingNotFoundException, InvalidShippingStatusException {
     Shipping shipping = shippingMap.get(shippingID);
     if (shipping == null) {
         throw new ShippingNotFoundException("Shipping not found for ID: " + shippingID);
     }
     shipping.setShippingStatus(status);
 }

 public Shipping findShippingDetailsByShippingID(String shippingID) throws ShippingNotFoundException {
     Shipping shipping = shippingMap.get(shippingID);
     if (shipping == null) {
         throw new ShippingNotFoundException("Shipping not found for ID: " + shippingID);
     }
     return shipping;
 }

 public String trackShipment(String shippingID) throws ShippingNotFoundException {
     Shipping shipping = shippingMap.get(shippingID);
     if (shipping == null) {
         throw new ShippingNotFoundException("Shipping not found for ID: " + shippingID);
     }
     String trackingNumber = shipping.getTrackingNumber();
     if (trackingNumber == null || trackingNumber.trim().isEmpty()) {
         return "Tracking number not available for this shipment.";
     }
     return "Tracking Shipment ID: " + trackingNumber + ". Current status: " + shipping.getShippingStatus();
 }

 public double calculateShippingCost(String shippingMethod, double weight, double distance) 
         throws InvalidShippingMethodException, ShippingCostException {
     if (weight <= 0 || distance <= 0) {
         throw new ShippingCostException("Invalid weight or distance for shipping cost calculation.");
     }
     double costPerKgPerKm;
     switch (shippingMethod) {
         case "Standard":
             costPerKgPerKm = 0.1;
             break;
         case "Express":
             costPerKgPerKm = 0.25;
             break;
         case "Overnight":
             costPerKgPerKm = 0.5;
             break;
         default:
             throw new InvalidShippingMethodException("Unsupported shipping method: " + shippingMethod);
     }
     double cost = weight * distance * costPerKgPerKm;
     if (cost < 0) {
         throw new ShippingCostException("Calculated shipping cost cannot be negative.");
     }
     return cost;
 }
 public void addShipping(String shippingID, Shipping shipping) {
     shippingMap.put(shippingID, shipping);
 }
}


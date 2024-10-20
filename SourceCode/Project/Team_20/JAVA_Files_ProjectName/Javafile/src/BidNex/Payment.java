package Demo;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Payment {
    private Auction auction;
    private double amount;
    private String paymentMethod;
    private String status;
    private String transactionId;
    public Payment(Auction auction, double amount, String paymentMethod, String transactionId) {
        this.auction = auction;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.status = "Pending";  
        this.transactionId = transactionId;
    }
    public Auction getAuction() {
        return auction;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}

class PaymentUtility {

    private static Set<String> transactionIds = new HashSet<>();
    private static final Set<String> SUPPORTED_PAYMENT_METHODS = Set.of("CreditCard", "PayPal", "BankTransfer");

    public static void validatePaymentAmount(double amount) throws InvalidPaymentAmountException {
        if (amount <= 0) {
            throw new InvalidPaymentAmountException("Payment amount must be greater than zero.");
        }
    }

    public static Payment processPayment(Auction auction, double amount, String paymentMethod, String transactionId)
            throws InvalidPaymentAmountException, PaymentMethodNotSupportedException, DuplicateTransactionException {

        validatePaymentAmount(amount);

        if (!SUPPORTED_PAYMENT_METHODS.contains(paymentMethod)) {
            throw new PaymentMethodNotSupportedException("Unsupported payment method: " + paymentMethod);
        }

        if (transactionIds.contains(transactionId)) {
            throw new DuplicateTransactionException("Transaction with ID " + transactionId + " has already been processed.");
        }
        Payment payment = new Payment(auction, amount, paymentMethod, transactionId);
        transactionIds.add(transactionId);  // Track transaction ID to avoid duplicates

        return payment;
    }

    public static void updatePaymentStatus(Payment payment, String newStatus) throws PaymentStatusException {
        String currentStatus = payment.getStatus();
        if (newStatus.equals("Completed") && !currentStatus.equals("Pending")) {
            throw new PaymentStatusException("Payment must be in Pending status to be marked as Completed.");
        }
        if (newStatus.equals("Refunded") && !currentStatus.equals("Completed")) {
            throw new PaymentStatusException("Payment must be Completed before a refund can be issued.");
        }
        payment.setStatus(newStatus);
    }

    public static Payment findPaymentById(String paymentId, List<Payment> payments) throws PaymentNotFoundException {
        for (Payment payment : payments) {
            if (payment.getTransactionId().equals(paymentId)) {
                return payment;
            }
        }
        throw new PaymentNotFoundException("Payment with ID " + paymentId + " not found.");
    }
    public static void refundPayment(Payment payment) throws PaymentStatusException {
        updatePaymentStatus(payment, "Refunded");
    }

    public static double calculateTotalPaymentsForAuction(Auction auction, List<Payment> payments) {
        return payments.stream()
                .filter(payment -> payment.getAuction().equals(auction) && payment.getStatus().equals("Completed"))
                .mapToDouble(Payment::getAmount)
                .sum();
    }

	public static Payment processPayment(Auctions auction, double amount, String paymentMethod, String transactionId) {
		return null;
	}
}
class PaymentNotFoundException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public PaymentNotFoundException(String message) {
     super(message);
 }
}

class InvalidPaymentAmountException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InvalidPaymentAmountException(String message) {
     super(message);
 }
}

class PaymentStatusException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public PaymentStatusException(String message) {
     super(message);
 }
}

class PaymentMethodNotSupportedException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public PaymentMethodNotSupportedException(String message) {
     super(message);
 }
}

class DuplicateTransactionException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public DuplicateTransactionException(String message) {
     super(message);
 }

}

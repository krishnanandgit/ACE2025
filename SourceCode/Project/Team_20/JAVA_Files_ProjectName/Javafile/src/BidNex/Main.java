package Demo;
import java.util.Date;
public class Main {

    public static void main(String[] args) throws Exception {
        Auctioneer auctioneer = new Auctioneer("auctioneer_username", "password", "auctioneer@example.com", "1234567890");
        Bidder bidder = new Bidder("bidder_username", "password", "bidder@example.com", "9876543210");
        Category category = new Category("category_id", "Category Name", null);
        Item item = new Item("item_id", "Item Name", "Item Description", 10.0, "New", category);
        Auctions auction = new Auctions(item, new Date(), new Date(System.currentTimeMillis() + 86400000), auctioneer);
        Bidder.add(new Bidder("bidder_username", "password", "bidder@example.com", "9876543210"));
        auction.placeBid(new Bidder("bidder_username", "password", "bidder@example.com", "9876543210"));
        Commission commission = new Commission(auction, 10.0);
        double commissionAmount = commission.calculateCommission();
        Payment payment = PaymentUtility.processPayment(auction, 100.0, "CreditCard", "transaction_id");
        PaymentUtility.updatePaymentStatus(payment, "Completed");
        Review review = new Review("review_id", bidder, auctioneer, "Review comments", 5, item);
        Notification notification = new Notification(bidder, "Notification message", "INFO");
        Notification.sendNotification(bidder, "Notification message", "INFO");
        System.out.println("Auctioneer: " + auctioneer.getUsername());
        System.out.println("Bidder: " + bidder.getUsername());
        System.out.println("Category: " + category.getName());
        System.out.println("Item: " + item.getItemName());
        System.out.println("Auction: " + auction.getItem().getItemName());
        System.out.println("Commission: " + commissionAmount);
        System.out.println("Payment: " + payment.getAmount());
        System.out.println("Review: " + review.getComments());
        System.out.println("Notification: " + notification.getMessage());
    }
}
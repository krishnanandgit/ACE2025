import java.util.Date;
import java.util.Scanner;

public class OnlineAuctionSystem {
    public static void main(String[] args) {
        Auctioneer auctioneer = new Auctioneer("auctioneer1", "pass", "auctioneer@example.com");
        Bidder bidder1 = new Bidder("bidder1", "pass", "bidder1@example.com");
        Bidder bidder2 = new Bidder("bidder2", "pass", "bidder2@example.com");

        Category electronics = new Category("Electronics");
        Item laptop = new Item("Laptop", "High-performance laptop", 500, electronics);
        
        Auction auction = new Auction(laptop, new Date(), new Date(System.currentTimeMillis() + 3600 * 1000), auctioneer);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your username:");
            String username = scanner.nextLine();
            System.out.println("Enter your password:");
            String password = scanner.nextLine();

            User user;
            if (username.equals(auctioneer.getUsername()) && auctioneer.authenticate(password)) {
                user = auctioneer;
            } else if (username.equals(bidder1.getUsername()) && bidder1.authenticate(password)) {
                user = bidder1;
            } else if (username.equals(bidder2.getUsername()) && bidder2.authenticate(password)) {
                user = bidder2;
            } else {
                System.out.println("Invalid credentials. Try again.");
                continue;
            }

            if (user instanceof Bidder) {
                System.out.println("Enter your bid amount:");
                double bidAmount = scanner.nextDouble();
                scanner.nextLine(); // Consume newline

                Bid bid = new Bid((Bidder) user, bidAmount);
                if (auction.placeBid(bid)) {
                    System.out.println("Bid placed successfully!");
                } else {
                    System.out.println("Bid too low or auction ended. Current highest bid is: " + auction.getHighestBid());
                }
            }

            System.out.println("Do you want to continue? (yes/no)");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                break;
            }
        }

        scanner.close();
        System.out.println("Thank you for using the Online Auction System!");
    }
}

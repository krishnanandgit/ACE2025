package Demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bidder extends User {
 private String contactNumber;
 private String status; 
 private double rating; 

 public Bidder(String username, String password, String email, String contactNumber) throws DuplicateEmailException, InvalidContactNumberException {
     super(username, password, email);
     validateContactNumber(contactNumber);
     checkDuplicateEmail(email);
     this.contactNumber = contactNumber;
     this.status = "Active"; 
     this.rating = 0.0; 
 }

 public String getStatus() {
     return status;
 }

 public void setStatus(String status) throws InvalidBidderStatusException {
     updateBidderStatus(status);
 }

 public double getRating() {
     return rating;
 }

 public void updateRating(double newRating) throws InvalidBidderRatingException {
     calculateBidderRating(newRating);
 }

 public String getContactNumber() {
     return contactNumber;
 }

 public void updateContactNumber(String contactNumber) throws InvalidContactNumberException {
     validateContactNumber(contactNumber);
     this.contactNumber = contactNumber;
 }

 private static void validateContactNumber(String contactNumber) throws InvalidContactNumberException {
     if (contactNumber == null || !contactNumber.matches("\\d{10}")) {
         throw new InvalidContactNumberException("Contact number must be a valid 10-digit number.");
     }
 }

 private static void checkDuplicateEmail(String email) throws DuplicateEmailException {
     if (BidderUtility.isEmailDuplicate(email)) {
         throw new DuplicateEmailException("Email is already registered.");
     }
 }

 public static Bidder findBidderById(int bidderId) throws BidderNotFoundException {
     return BidderUtility.findBidderById(bidderId);
 }

 private static void updateBidderStatus(String status) throws InvalidBidderStatusException {
     List<String> validStatuses = List.of("Active", "Suspended", "Banned");
     if (!validStatuses.contains(status)) {
         throw new InvalidBidderStatusException("Invalid bidder status: " + status);
     }
 }

 private static void calculateBidderRating(double newRating) throws InvalidBidderRatingException {
     if (newRating < 1 || newRating > 5) {
         throw new InvalidBidderRatingException("Bidder rating must be between 1 and 5.");
     }
 }

public double getAmount() {
	return 0;
}

public Bidder getBidder() {
	return null;
}

public static void add(Bidder bid) {
	
}
}

class BidderUtility {
 private static Map<Integer, Bidder> bidderMap = new HashMap<>(); // Store bidders by ID
 private static Map<String, Bidder> emailMap = new HashMap<>(); // Store bidders by email

 public static boolean isEmailDuplicate(String email) {
     return emailMap.containsKey(email);
 }

 public static Bidder findBidderById(int bidderId) throws BidderNotFoundException {
     if (!bidderMap.containsKey(bidderId)) {
         throw new BidderNotFoundException("Bidder with ID " + bidderId + " not found.");
     }
     return bidderMap.get(bidderId);
 }

 public static void addBidder(Bidder bidder) {
     bidderMap.put(bidder.getUserId(), bidder);
     emailMap.put(bidder.getEmail(), bidder);
 }
}

//Custom Exception Classes

class BidderNotFoundException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public BidderNotFoundException(String message) {
     super(message);
 }
}

class DuplicateEmailException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public DuplicateEmailException(String message) {
     super(message);
 }
}

class InvalidBidderStatusException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InvalidBidderStatusException(String message) {
     super(message);
 }
}

class InvalidBidderRatingException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InvalidBidderRatingException(String message) {
     super(message);
 }
}

class InvalidContactNumberException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InvalidContactNumberException(String message) {
     super(message);
 }


//Supporting classes (placeholders for User)

 private int userId;
 private String username;
 private String password;
 private String email;
 private static int idCounter = 1; // To auto-generate user IDs

 public void User(String username, String password, String email) {
     this.userId = idCounter++;
     this.username = username;
     this.password = password;
     this.email = email;
 }

 public int getUserId() {
     return userId;
 }

 public String getUsername() {
     return username;
 }

 public String getEmail() {
     return email;
 }

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
}

package Demo;
import java.util.HashMap;
import java.util.Map;
public class Auctioneer extends User {
    private String contactNumber;
    private String status; 
    private double rating; 

    public Auctioneer(String username, String password, String email, String contactNumber) throws DuplicateAuctioneerEmailException, InvalidPhoneNumberException {
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

    public void setStatus(String status) throws InvalidAuctioneerStatusException {
        updateAuctioneerStatus(status);
    }

    public double getRating() {
        return rating;
    }

    public void updateRating(double newRating) throws InvalidAuctioneerRatingException {
        calculateAuctioneerRating(newRating);
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void updateContactNumber(String contactNumber) throws InvalidPhoneNumberException {
        validateContactNumber(contactNumber);
        this.contactNumber = contactNumber;
    }

    public void createAuction(Auction auction) {
    }

    private static void validateContactNumber(String contactNumber) throws InvalidPhoneNumberException {
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) {
            throw new InvalidPhoneNumberException("Phone number must be a valid 10-digit number.");
        }
    }
    private static void checkDuplicateEmail(String email) throws DuplicateAuctioneerEmailException {
        if (AuctioneerUtility.isEmailDuplicate(email)) {
            throw new DuplicateAuctioneerEmailException("Email is already registered.");
        }
    }

    public static Auctioneer findAuctioneerById(int auctioneerId) throws AuctioneerNotFoundException {
        return AuctioneerUtility.findAuctioneerById(auctioneerId);
    }

    private static void updateAuctioneerStatus(String status) throws InvalidAuctioneerStatusException {
        if (!AuctioneerUtility.isValidStatus(status)) {
            throw new InvalidAuctioneerStatusException("Invalid auctioneer status: " + status);
        }
    }

    private static void calculateAuctioneerRating(double newRating) throws InvalidAuctioneerRatingException {
        if (newRating < 1 || newRating > 5) {
            throw new InvalidAuctioneerRatingException("Auctioneer rating must be between 1 and 5.");
        }
    }

	public String getEmail() {
	
		return null;
	}
}

class AuctioneerUtility {
    private static Map<Integer, Auctioneer> auctioneerMap = new HashMap<>(); // Store auctioneers by ID
    private static Map<String, Auctioneer> emailMap = new HashMap<>(); // Store auctioneers by email

    public static boolean isEmailDuplicate(String email) {
        return emailMap.containsKey(email);
    }

    public static Auctioneer findAuctioneerById(int auctioneerId) throws AuctioneerNotFoundException {
        if (!auctioneerMap.containsKey(auctioneerId)) {
            throw new AuctioneerNotFoundException("Auctioneer with ID " + auctioneerId + " not found.");
        }
        return auctioneerMap.get(auctioneerId);
    }

    public static void addAuctioneer(Auctioneer auctioneer) {
        auctioneerMap.put(auctioneer.getUserId(), auctioneer);
        emailMap.put(auctioneer.getEmail(), auctioneer);
    }

    public static boolean isValidStatus(String status) {
        return status.equals("Active") || status.equals("Inactive") || status.equals("Suspended");
    }
}


class AuctioneerNotFoundException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AuctioneerNotFoundException(String message) {
        super(message);
    }
}

class DuplicateAuctioneerEmailException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DuplicateAuctioneerEmailException(String message) {
        super(message);
    }
}

class InvalidAuctioneerStatusException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAuctioneerStatusException(String message) {
        super(message);
    }
}

class InvalidAuctioneerRatingException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAuctioneerRatingException(String message) {
        super(message);
    }
}

class InvalidPhoneNumberException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidPhoneNumberException(String message) {
        super(message);
    }
}


class User {
    private int userId;
    private String username;
    private String password;
    private String email;
    private static int idCounter = 1; // To auto-generate user IDs

    public User(String username, String password, String email) {
        this.userId = idCounter++;
        this.username = username;
        this.setPassword(password);
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

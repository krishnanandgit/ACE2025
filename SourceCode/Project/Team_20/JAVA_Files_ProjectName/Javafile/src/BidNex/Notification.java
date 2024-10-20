package Demo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Notification {
    private String message;
    private boolean isRead;

    public Notification(User user, String message, String notificationType) throws InvalidMessageException, InvalidNotificationTypeException, InvalidUserException {
        validateUser(user);
        validateMessage(message);
        validateNotificationType(notificationType);
        
        this.message = message;
        this.isRead = false;
    }

    public String getMessage() {
        return message;
    }

    public boolean isRead() {
        return isRead;
    }

    public void markAsRead() {
        this.isRead = true;
    }

    public static void sendNotification(User user, String message, String notificationType) throws InvalidUserException, InvalidMessageException, InvalidNotificationTypeException {
        Notification notification = new Notification(user, message, notificationType);
        NotificationUtility.addNotification(user, notification);
        
    }

    public static List<Notification> retrieveNotifications(User1 user) throws NotificationNotFoundException {
        List<Notification> notifications = NotificationUtility.getNotificationsForUser(user);
        if (notifications.isEmpty()) {
            throw new NotificationNotFoundException("No notifications found for user: " + user.getName());
        }
        return notifications;
    }

    private static void validateMessage(String message) throws InvalidMessageException {
        if (message == null || message.isEmpty()) {
            throw new InvalidMessageException("Notification message cannot be empty.");
        }
        if (message.length() > 255) {
            throw new InvalidMessageException("Notification message cannot exceed 255 characters.");
        }
    }

    private static void validateNotificationType(String notificationType) throws InvalidNotificationTypeException {
        List<String> validTypes = List.of("INFO", "WARNING", "ERROR");
        if (!validTypes.contains(notificationType)) {
            throw new InvalidNotificationTypeException("Invalid notification type: " + notificationType);
        }
    }

    private static void validateUser(User user) throws InvalidUserException {
        if (user == null || user.getUserId() <= 0) {
            throw new InvalidUserException("Invalid user. User must exist with a valid ID.");
        }
    }
}

class NotificationUtility {
    private static Map<Integer, List<Notification>> notificationsMap = new HashMap<>(); // Maps userId to list of notifications

    public static void addNotification(User user, Notification notification) {
        notificationsMap.putIfAbsent(user.getUserId(), new ArrayList<>());
        notificationsMap.get(user.getUserId()).add(notification);
    }

    public static List<Notification> getNotificationsForUser(User1 user) {
        return notificationsMap.getOrDefault(user.getUserId(), new ArrayList<>());
    }

    public static Notification getNotificationById(int notificationId, User1 user) throws NotificationNotFoundException {
        List<Notification> notifications = notificationsMap.get(user.getUserId());
        if (notifications == null || notificationId < 0 || notificationId >= notifications.size()) {
            throw new NotificationNotFoundException("Notification with ID " + notificationId + " not found for user: " + user.getName());
        }
        return notifications.get(notificationId);
    }
}


class NotificationNotFoundException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotificationNotFoundException(String message) {
        super(message);
    }
}

class InvalidNotificationTypeException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidNotificationTypeException(String message) {
        super(message);
    }
}

class InvalidUserException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidUserException(String message) {
        super(message);
    }
}

class InvalidMessageException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidMessageException(String message) {
        super(message);
    }
}


class User1 {
    private int userId;
    private String name;

    public void User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public String getName() {
		return null;
	}

	public int getUserId() {
        return userId;
    }

    public String getName1() {
        return name;
    }
}

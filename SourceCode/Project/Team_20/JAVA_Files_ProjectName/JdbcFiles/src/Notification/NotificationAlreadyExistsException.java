package Notification;


public class NotificationAlreadyExistsException {
    private String message;

    public NotificationAlreadyExistsException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

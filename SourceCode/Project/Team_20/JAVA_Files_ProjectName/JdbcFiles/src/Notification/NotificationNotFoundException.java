package Notification;


public class NotificationNotFoundException {
    private String message;

    public NotificationNotFoundException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

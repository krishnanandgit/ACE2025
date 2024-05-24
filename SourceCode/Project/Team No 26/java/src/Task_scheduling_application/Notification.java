package Task_scheduling_application;

public class Notification {
    private String notification_id;
    private String notification_type;
    private String message;
    private String user_id;

    public Notification(String notification_id, String notification_type, String message, String user_id) {
        this.notification_id = notification_id;
        this.notification_type = notification_type;
        this.message = message;
        this.user_id = user_id;
    }

    public String getNotification_id() {
        return notification_id;
    }

    public void setNotification_id(String notification_id) {
        this.notification_id = notification_id;
    }

    public String getNotification_type() {
        return notification_type;
    }

    public void setNotification_type(String notification_type) {
        this.notification_type = notification_type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public void Notificationdisplay() {
        System.out.println("Notification details:");
        System.out.println("Notification ID: " + notification_id);
        System.out.println("Type: " + notification_type);
        System.out.println("Message: " + message);
        System.out.println("User ID: " + user_id);
    }
}

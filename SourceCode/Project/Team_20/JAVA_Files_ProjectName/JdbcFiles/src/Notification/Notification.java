package Notification;

public class Notification {
    private int notificationId;
    private String message;
    private String notificationType;
    private int paymentId;

    // Constructor
    public Notification(int notificationId, String message, String notificationType, int paymentId) {
        this.notificationId = notificationId;
        this.message = message;
        this.notificationType = notificationType;
        this.paymentId = paymentId;
    }

    // Getters and Setters
    public int getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "notificationId=" + notificationId +
                ", message='" + message + '\'' +
                ", notificationType='" + notificationType + '\'' +
                ", paymentId=" + paymentId +
                '}';
    }
}

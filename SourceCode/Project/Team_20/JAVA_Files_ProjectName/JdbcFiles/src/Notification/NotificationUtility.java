package Notification;


public class NotificationUtility {
    private NotificationDAO notificationDAO;

    public NotificationUtility() {
        notificationDAO = new NotificationDAO();
    }

    public void addNotification(int notificationId, String message, String notificationType, int paymentId) {
        Notification newNotification = new Notification(notificationId, message, notificationType, paymentId);
        notificationDAO.addNotification(newNotification);
    }

    public Notification getNotification(int notificationId) {
        return notificationDAO.getNotificationById(notificationId);
    }

    public void updateNotification(int notificationId, String newMessage, String newNotificationType, int newPaymentId) {
        notificationDAO.updateNotification(notificationId, newMessage, newNotificationType, newPaymentId);
    }

    public void deleteNotification(int notificationId) {
        notificationDAO.deleteNotification(notificationId);
    }

    public void displayNotifications() {
        notificationDAO.displayAllNotifications();
    }
}

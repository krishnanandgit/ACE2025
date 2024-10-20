package Notification;


public class Main {
    public static void main(String[] args) {
        NotificationDAO notificationDAO = new NotificationDAO();
        
        notificationDAO.createTable();
        
        notificationDAO.addNotification(new Notification(1, "Payment received", "Payment", 101));
        notificationDAO.addNotification(new Notification(2, "Auction won", "Auction", 102));
        
        notificationDAO.displayAllNotifications();
        
 notificationDAO.updateNotification(1, "Payment confirmed", "Payment", 101);
        
        notificationDAO.displayAllNotifications();
        
        Notification notification = notificationDAO.getNotificationById(1);
        if (notification != null) {
            System.out.println("Fetched notification: " + notification);
        }

        notificationDAO.deleteNotification(2);
        
        notificationDAO.displayAllNotifications();
    }
}

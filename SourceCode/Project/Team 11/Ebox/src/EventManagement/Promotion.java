package EventManagement;

import java.util.Scanner;
public class Promotion {
    private int promotionId;
    private int eventId;
    private String channel;
    private String content;

    public Promotion(int promotionId, int eventId, String channel, String content) {
        this.promotionId = promotionId;
        this.eventId = eventId;
        this.channel = channel;
        this.content = content;
    }
    public void promotionDetails() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter event details:");
        System.out.print("promotion ID: ");
        this.promotionId = scanner.nextInt();
        System.out.print("eventId: ");
        this.eventId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("channel: ");
        this.channel = scanner.nextLine();
        System.out.print("content: ");
        this.content = scanner.nextLine();
        System.out.println("Promotion details receieved successfully .");
        scanner.close();
    }

    public void promoteEvent() {
        System.out.println("Event with ID " + eventId + " is being promoted through " + channel + " channel.");
        System.out.println("Content: " + content);
    }

    public void monitorPromotionMetrics() {
        System.out.println("Monitoring promotion metrics for Promotion ID " + promotionId);
        // Implementation to monitor metrics (e.g., views, clicks, conversions)
    }

    public void adjustPromotionStrategy() {
        System.out.println("Adjusting promotion strategy for Promotion ID " + promotionId);
        // Implementation to adjust promotion strategy based on metrics
    }

    // Getters and Setters
    public int getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(int promotionId) {
        this.promotionId = promotionId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }  
}

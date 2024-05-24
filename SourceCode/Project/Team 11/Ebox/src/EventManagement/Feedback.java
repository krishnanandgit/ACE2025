package EventManagement;
import java.util.*;
public class Feedback {
    private int feedbackId;
    private int eventId;
    private int attendeeId;
    private int rating;
    private String comments;

    public Feedback(int feedbackId, int eventId, int attendeeId, int rating, String comments) {
        this.feedbackId = feedbackId;
        this.eventId = eventId;
        this.attendeeId = attendeeId;
        this.rating = rating;
        this.comments = comments;
    }
    
     public void feedbackDetails() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter event details:");
        System.out.print("Feedback ID: ");
        this.feedbackId = scanner.nextInt();
        System.out.print("eventId: ");
        this.eventId = scanner.nextInt();
        System.out.print("attendeeId: ");
        this.attendeeId = scanner.nextInt();
        System.out.print("rating: ");
        this.rating = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("comments: ");
        this.comments = scanner.nextLine();
        System.out.println("Feedback Details receieved successfully.");
        scanner.close();
    }


    public void collectFeedback() {
        System.out.println("Feedback collected for Event ID " + eventId + " from Attendee ID " + attendeeId);
        System.out.println("Rating: " + rating);
        System.out.println("Comments: " + comments);
    }

    public void analyzeFeedback() {
        System.out.println("Analyzing feedback for Event ID " + eventId);
    }

    public void improveEventExperience() {
        System.out.println("Improving event experience based on feedback for Event ID " + eventId);
    }

    // Getters and Setters
    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getAttendeeId() {
        return attendeeId;
    }

    public void setAttendeeId(int attendeeId) {
        this.attendeeId = attendeeId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}

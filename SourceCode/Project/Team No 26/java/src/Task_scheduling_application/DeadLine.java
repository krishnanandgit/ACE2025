package Task_scheduling_application;

public class DeadLine {
    private String deadline_id;
    private String date;

    public DeadLine(String deadline_id, String date) {
        this.deadline_id = deadline_id;
        this.date = date;
    }

    public String getDeadline_id() {
        return deadline_id;
    }

    public void setDeadline_id(String deadline_id) {
        this.deadline_id = deadline_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void Deaddlinedisplay() {
        System.out.println("Deadline details:");
        System.out.println("Deadline ID: " + deadline_id);
        System.out.println("Date: " + date);
    }
}

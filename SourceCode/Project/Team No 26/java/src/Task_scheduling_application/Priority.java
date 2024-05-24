package Task_scheduling_application;

public class Priority {
    private String priority_id;
    private String priority_level;

    public Priority(String priority_id, String priority_level) {
        this.priority_id = priority_id;
        this.priority_level = priority_level;
    }

    public String getPriority_id() {
        return priority_id;
    }

    public void setPriority_id(String priority_id) {
        this.priority_id = priority_id;
    }

    public String getPriority_level() {
        return priority_level;
    }

    public void setPriority_level(String priority_level) {
        this.priority_level = priority_level;
    }
    public void Prioritydisplay() {
        System.out.println("Priority details:");
        System.out.println("Priority ID: " + priority_id);
        System.out.println("Priority Level: " + priority_level);
    }
}

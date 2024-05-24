package Task_scheduling_application;

public class Collaboration {
    private String collaboration_id;
    private String task_id;
    private String user_id;

    public Collaboration(String collaboration_id, String task_id, String user_id) {
        this.collaboration_id = collaboration_id;
        this.task_id = task_id;
        this.user_id = user_id;
    }

    public String getCollaboration_id() {
        return collaboration_id;
    }

    public void setCollaboration_id(String collaboration_id) {
        this.collaboration_id = collaboration_id;
    }

    public String getTask_id() {
        return task_id;
    }

    public void setTask_id(String task_id) {
        this.task_id = task_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public void Collaborationdisplay() {
        System.out.println("Collaboration details:");
        System.out.println("Collaboration ID: " + collaboration_id);
        System.out.println("Task ID: " + task_id);
        System.out.println("User ID: " + user_id);
    }
}

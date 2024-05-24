package Task_scheduling_application;

public class Task {
    private String task_id;
    private String task_name;
    private String description;
    private String deadline_id;
    private String priority_id;
    private String user_id;
    private String project_id;

    public Task(String task_id, String task_name, String description, String deadline_id, String priority_id, String user_id, String project_id) {
        this.task_id = task_id;
        this.task_name = task_name;
        this.description = description;
        this.deadline_id = deadline_id;
        this.priority_id = priority_id;
        this.user_id = user_id;
        this.project_id = project_id;
    }

    public String getTask_id() {
        return task_id;
    }

    public void setTask_id(String task_id) {
        this.task_id = task_id;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeadline_id() {
        return deadline_id;
    }

    public void setDeadline_id(String deadline_id) {
        this.deadline_id = deadline_id;
    }

    public String getPriority_id() {
        return priority_id;
    }

    public void setPriority_id(String priority_id) {
        this.priority_id = priority_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }
    public void Taskdisplay() {
        System.out.println("Task details:");
        System.out.println("Task ID: " + task_id);
        System.out.println("Task Name: " + task_name);
        System.out.println("Description: " + description);
        System.out.println("Deadline ID: " + deadline_id);
        System.out.println("Priority ID: " + priority_id);
        System.out.println("User ID: " + user_id);
        System.out.println("Project ID: " + project_id);
    }
}

package Task_scheduling_application;

public class Subtask {
    private String subtask_id;
    private String subtask_name;
    private String description;
    private String task_id;


    public Subtask(String subtask_id, String subtask_name, String description, String task_id) {
        this.subtask_id = subtask_id;
        this.subtask_name = subtask_name;
        this.description = description;
        this.task_id = task_id;
    }

    public String getSubtask_id() {
        return subtask_id;
    }

    public void setSubtask_id(String subtask_id) {
        this.subtask_id = subtask_id;
    }

    public String getSubtask_name() {
        return subtask_name;
    }

    public void setSubtask_name(String subtask_name) {
        this.subtask_name = subtask_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTask_id() {
        return task_id;
    }

    public void setTask_id(String task_id) {
        this.task_id = task_id;
    }
    public void Subtaskdisplay() {
        System.out.println("Subtask details:");
        System.out.println("Subtask ID: " + subtask_id);
        System.out.println("Subtask Name: " + subtask_name);
        System.out.println("Description: " + description);
        System.out.println("Task ID: " + task_id);
    }
}

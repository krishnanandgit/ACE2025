package Task_scheduling_application;

public class project {
    private String project_id;
    private String project_name;
    private String description;

    public project(String project_id, String project_name, String description) {
        this.project_id = project_id;
        this.project_name = project_name;
        this.description = description;
    }

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void Projectdisplay() {
        System.out.println("Project details:");
        System.out.println("Project ID: " + project_id);
        System.out.println("Project Name: " + project_name);
        System.out.println("Description: " + description);
    }
}

package smartcity;

public class maintenance {


public class Maintenance {
    private int id;
    private int date;
    private int infrastructureId;
    private String description;

    // Constructor
    public Maintenance(int id, int date, int infrastructureId, String description) {
        this.id = id;
        this.date = date;
        this.infrastructureId = infrastructureId;
        this.description = description;
    }

    // Getter and setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getInfrastructureId() {
        return infrastructureId;
    }

    public void setInfrastructureId(int infrastructureId) {
        this.infrastructureId = infrastructureId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void display(){
        System.out.println("Infrastructure Details:");
        System.out.println("ID: " + id);
        System.out.println("infrastructureId: " + infrastructureId);
        System.out.println("Description: " + description);
    }
}
}

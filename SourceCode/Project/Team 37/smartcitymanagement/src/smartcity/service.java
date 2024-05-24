package smartcity;

public class service {
    private int id;
    private String Name;
    private String description;
    
    // Constructor
    public service(){
        // Initialize attributes
        this.id = 0;
        this.Name = "";
        this.description = "";
    }
    
    // Getter and setter methods for id
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    // Getter and setter methods for Name
    public String getName() {
        return Name;
    }
    
    public void setName(String Name) {
        this.Name = Name;
    }
    
    // Getter and setter methods for description
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}

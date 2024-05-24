package smartcity;

public class infrastructure {

	// Infrastructure class
	class Entity {
	    // Attributes
	    private int id;
	    private String name;
	    private String description;

	    // Constructor
	    public Entity(int id, String name, String description) {
	        this.id = id;
	        this.name = name;
	        this.description = description;
	    }

	    // Getter for id
	    public int getId() {
	        return id;
	    }

	    // Setter for id
	    public void setId(int id) {
	        this.id = id;
	    }

	    // Getter for name
	    public String getName() {
	        return name;
	    }

	    // Setter for name
	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter for description
	    public String getDescription() {
	        return description;
	    }

	    // Setter for description
	    public void setDescription(String description) {
	        this.description = description;
	    }
	    public void display(){
	        System.out.println("Infrastructure Details:");
	        System.out.println("ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Description: " + description);
	}
}
}
	
	
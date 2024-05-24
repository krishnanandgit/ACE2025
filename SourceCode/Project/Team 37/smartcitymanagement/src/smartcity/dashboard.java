package smartcity;


	public class dashboard {
	    private int id;
	    private String description;

	    // Constructor
	    public dashboard(int id, String description) {
	        this.id = id;
	        this.description = description;
	    }

	    // Getter and setter methods for id
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    // Getter and setter methods for description
	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }
	    public void display(){
	        System.out.println("Dashboard Details:");
	        System.out.println("ID: " + id);
	        System.out.println("Description: " + description);
	    }
	}

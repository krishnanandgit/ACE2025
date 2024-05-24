package smartcity;

public class incident {

	class Incident {
	    private int id;
	    private int date;
	    private String description;
	    private String location;
	    private int citizenId;
	    
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
	    
	    public String getDescription() {
	        return description;
	    }
	    
	    public void setDescription(String description) {
	        this.description = description;
	    }
	    
	    public String getLocation() {
	        return location;
	    }
	    
	    public void setLocation(String location) {
	        this.location = location;
	    }
	    
	    public int getCitizenId() {
	        return citizenId;
	    }
	    
	    public void setCitizenId(int citizenId) {
	        this.citizenId = citizenId;
	    }
	}
}
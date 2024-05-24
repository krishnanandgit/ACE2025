package smartcity;

public class permit {

	public class Permit {
	    private int id;
	    private int dateIssues;
	    private int dateExpiry;
	    private String description;
	    private int citizenId;
	    
	    // Constructor
	    public Permit(int id, int dateIssues, int dateExpiry, String description, int citizenId) {
	        this.id = id;
	        this.dateIssues = dateIssues;
	        this.dateExpiry = dateExpiry;
	        this.description = description;
	        this.citizenId = citizenId;
	    }
	    
	    // Getters
	    public int getId() {
	        return id;
	    }
	    
	    public int getDateIssues() {
	        return dateIssues;
	    }
	    
	    public int getDateExpiry() {
	        return dateExpiry;
	    }
	    
	    public String getDescription() {
	        return description;
	    }
	    
	    public int getCitizenId() {
	        return citizenId;
	    }
	    
	    // Setters
	    public void setId(int id) {
	        this.id = id;
	    }
	    
	    public void setDateIssues(int dateIssues) {
	        this.dateIssues = dateIssues;
	    }
	    
	    public void setDateExpiry(int dateExpiry) {
	        this.dateExpiry = dateExpiry;
	    }
	    
	    public void setDescription(String description) {
	        this.description = description;
	    }
	    
	    public void setCitizenId(int citizenId) {
	        this.citizenId = citizenId;
	    }
	    
	    // toString method
	    @Override
	    public String toString() {
	        return "Permit{" +
	                "id=" + id +
	                ", dateIssues=" + dateIssues +
	                ", dateExpiry=" + dateExpiry +
	                ", description='" + description + '\'' +
	                ", citizenId=" + citizenId +
	                '}';
	    }
	   
}
}


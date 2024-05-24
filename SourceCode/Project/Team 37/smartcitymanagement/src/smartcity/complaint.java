package smartcity;

//Complaint.java

public class complaint {
 private int id;
 private int date;
 private String description;
 private String location;
 private int citizenId;

 // Constructor
 public complaint(int id, int date, String description, String location, int citizenId) {
     this.id = id;
     this.date = date;
     this.description = description;
     this.location = location;
     this.citizenId = citizenId;
 }

 // Getters and Setters
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

 public void display(){
     System.out.println("Incident Details:");
     System.out.println("ID: " + id);
     
     System.out.println("Description: " + description);
     System.out.println("Location: " + location);
     System.out.println("citizenId: " + citizenId);

 }
}

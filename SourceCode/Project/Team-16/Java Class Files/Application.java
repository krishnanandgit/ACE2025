public class Application {
    
    int applicationId;
    String adoptionDate;
    String status;

    public int getApplicationId() {
        return applicationId;
    }
    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public String getAdoptionDate() {
        return adoptionDate;
    }
    public void setAdoptionDate(String adoptionDate) {
        this.adoptionDate = adoptionDate;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
    public void displayApplicationDetails() {
        System.out.println("Application ID : " + applicationId);
        System.out.println("Adoption Date : " + adoptionDate);
        System.out.println("Status : " + status);
    }
}

public class Treatment {
    
    private int treatmentID;
    private int patientID;
    private int doctorID;
    private String startDate;
    private String endDate;

    
    public Treatment(int treatmentID, int patientID, int doctorID, String startDate, String endDate) {
        this.treatmentID = treatmentID;
        this.patientID = patientID;
        this.doctorID = doctorID;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    
    public int getTreatmentID() {
        return treatmentID;
    }

    public void setTreatmentID(int treatmentID) {
        this.treatmentID = treatmentID;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    
    public static void main(String[] args) {
        
        Treatment treatment = new Treatment(1, 101, 1, "2024-05-24", "2024-06-01");

        
        System.out.println("Treatment ID: " + treatment.getTreatmentID());
        System.out.println("Patient ID: " + treatment.getPatientID());
        System.out.println("Doctor ID: " + treatment.getDoctorID());
        System.out.println("Start Date: " + treatment.getStartDate());
        System.out.println("End Date: " + treatment.getEndDate());
    }
}


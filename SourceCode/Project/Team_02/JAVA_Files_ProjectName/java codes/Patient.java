public class Patient {

    private int patientID;
    private String name;
    private String gender;
    private String dob;
    private String medicalHistory;

    
    public Patient(int patientID, String name, String gender, String dob, String medicalHistory) {
        this.patientID = patientID;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.medicalHistory = medicalHistory;
    }

    
    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    
    public static void main(String[] args) {
        
        Patient patient = new Patient(1, "John Doe", "Male", "1990-01-01", "No significant medical history");

        
        System.out.println("Patient ID: " + patient.getPatientID());
        System.out.println("Name: " + patient.getName());
        System.out.println("Gender: " + patient.getGender());
        System.out.println("Date of Birth: " + patient.getDob());
        System.out.println("Medical History: " + patient.getMedicalHistory());
    }
}


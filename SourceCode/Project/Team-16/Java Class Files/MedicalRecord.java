public class MedicalRecord {

    int recordId;
    Boolean vaccination;
    String medicalConditions;

    public int getRecordId() {
        return recordId;
    }
    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }
    public Boolean getVaccination() {
        return vaccination;
    }
    public void setVaccination(Boolean vaccination) {
        this.vaccination = vaccination;
    }
    public String getMedicalConditions() {
        return medicalConditions;
    }
    public void setMedicalConditions(String medicalConditions) {
        this.medicalConditions = medicalConditions;
    }

    public void displayMedicalRecord() {
        System.out.println("Record ID : " + recordId);
        System.out.println("Is Vaccinated? : " + vaccination);
        System.out.println("Medical Conditions : " + medicalConditions);

    }

    
}

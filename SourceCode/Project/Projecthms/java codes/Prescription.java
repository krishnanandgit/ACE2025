public class Prescription {
    // Attributes
    private int prescriptionID;
    private int doctorID;
    private int patientID;
    private String date;
    private String medicationName;
    private String dosage;

    // Constructor
    public Prescription(int prescriptionID, int doctorID, int patientID, String date, String medicationName, String dosage) {
        this.prescriptionID = prescriptionID;
        this.doctorID = doctorID;
        this.patientID = patientID;
        this.date = date;
        this.medicationName = medicationName;
        this.dosage = dosage;
    }

    // Getter and Setter methods for each attribute
    public int getPrescriptionID() {
        return prescriptionID;
    }

    public void setPrescriptionID(int prescriptionID) {
        this.prescriptionID = prescriptionID;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    // Main method to demonstrate the usage
    public static void main(String[] args) {
        // Creating a Prescription object
        Prescription prescription = new Prescription(1, 1, 101, "2024-05-24", "Aspirin", "1 tablet daily");

        // Printing prescription details
        System.out.println("Prescription ID: " + prescription.getPrescriptionID());
        System.out.println("Doctor ID: " + prescription.getDoctorID());
        System.out.println("Patient ID: " + prescription.getPatientID());
        System.out.println("Date: " + prescription.getDate());
        System.out.println("Medication Name: " + prescription.getMedicationName());
        System.out.println("Dosage: " + prescription.getDosage());
    }
}

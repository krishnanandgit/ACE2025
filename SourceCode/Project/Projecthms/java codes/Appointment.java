public class Appointment {
    
    private int appointmentID;
    private int patientID;
    private int doctorID;
    private String appointmentDate;
    private String appointmentTime;
    private String status;

    
    public Appointment(int appointmentID, int patientID, int doctorID, String appointmentDate, String appointmentTime, String status) {
        this.appointmentID = appointmentID;
        this.patientID = patientID;
        this.doctorID = doctorID;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.status = status;
    }

    
    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
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

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    public static void main(String[] args) {
        
        Appointment appointment = new Appointment(1, 101, 1, "2024-05-24", "09:00 AM", "Scheduled");

        
        System.out.println("Appointment ID: " + appointment.getAppointmentID());
        System.out.println("Patient ID: " + appointment.getPatientID());
        System.out.println("Doctor ID: " + appointment.getDoctorID());
        System.out.println("Appointment Date: " + appointment.getAppointmentDate());
        System.out.println("Appointment Time: " + appointment.getAppointmentTime());
        System.out.println("Status: " + appointment.getStatus());
    }
}

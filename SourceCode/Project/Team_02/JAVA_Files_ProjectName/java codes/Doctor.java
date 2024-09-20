public class Doctor {
    
    private int doctorID;
    private String name;
    private String specialization;
    private int departmentID;
    private String shiftTiming;

    
    public Doctor(int doctorID, String name, String specialization, int departmentID, String shiftTiming) {
        this.doctorID = doctorID;
        this.name = name;
        this.specialization = specialization;
        this.departmentID = departmentID;
        this.shiftTiming = shiftTiming;
    }

    
    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getShiftTiming() {
        return shiftTiming;
    }

    public void setShiftTiming(String shiftTiming) {
        this.shiftTiming = shiftTiming;
    }

    
    public static void main(String[] args) {
        
        Doctor doctor = new Doctor(1, "Dr. Smith", "Cardiologist", 101, "Morning Shift");

        
        System.out.println("Doctor ID: " + doctor.getDoctorID());
        System.out.println("Name: " + doctor.getName());
        System.out.println("Specialization: " + doctor.getSpecialization());
        System.out.println("Department ID: " + doctor.getDepartmentID());
        System.out.println("Shift Timing: " + doctor.getShiftTiming());
    }
}

public class Test {
    
    private int testID;
    private int patientID;
    private int doctorID;
    private String testName;
    private String testResult;


    public Test(int testID, int patientID, int doctorID, String testName, String testResult) {
        this.testID = testID;
        this.patientID = patientID;
        this.doctorID = doctorID;
        this.testName = testName;
        this.testResult = testResult;
    }

    
    public int getTestID() {
        return testID;
    }

    public void setTestID(int testID) {
        this.testID = testID;
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

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    
    public static void main(String[] args) {
        
        Test test = new Test(1, 101, 1, "Blood Test", "Normal");

    
        System.out.println("Test ID: " + test.getTestID());
        System.out.println("Patient ID: " + test.getPatientID());
        System.out.println("Doctor ID: " + test.getDoctorID());
        System.out.println("Test Name: " + test.getTestName());
        System.out.println("Test Result: " + test.getTestResult());
    }
}

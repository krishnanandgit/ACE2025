package studentInfoSystem;

public class Student {
	String studentId;
    String studentName;
    String studentContact;
    String departmentId;

    public Student(String studentId, String studentName, String studentContact,String departmentId) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentContact = studentContact;
        this.departmentId=departmentId;
    }
    

    public String getStudentId() {
        return studentId;
    }


    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }


    public String getStudentName() {
        return studentName;
    }


    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public String getStudentContact() {
        return studentContact;
    }


    public void setStudentContact(String studentContact) {
        this.studentContact = studentContact;
    }


    public String getDepartmentId() {
        return departmentId;
    }


    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }


    public void display() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ContactNo: " + studentContact);
        System.out.println("Student departmentId: " + departmentId);
    }


}

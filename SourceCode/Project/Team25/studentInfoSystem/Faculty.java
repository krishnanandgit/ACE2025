package studentInfoSystem;

public class Faculty {
	String facultyId;
    String facultyName;
    String facultyContact;
    String departmentId;

    public Faculty(String facultyId, String facultyName, String departmentId, String facultyContact) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.departmentId = departmentId;
        this.facultyContact=facultyContact;
    }

    public void display() {
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Faculty Name: " + facultyName);
        System.out.println("Faculty Contact: " +facultyContact);
        System.out.println("DepartmentID: " + departmentId);
    }


}

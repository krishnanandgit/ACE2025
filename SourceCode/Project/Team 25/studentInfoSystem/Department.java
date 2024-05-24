package studentInfoSystem;

public class Department {
	String departmentId;
    String departmentName;
    String department_head;

    public Department(String departmentId, String departmentName, String department_head) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.department_head=department_head;
    }
    
    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartment_head() {
        return department_head;
    }

    public void setDepartment_head(String department_head) {
        this.department_head = department_head;
    }

    public void display() {
        System.out.println("Department ID: " + departmentId);
        System.out.println("Department Name: " + departmentName);
        System.out.println("Head of the department: " +department_head);
    }


}

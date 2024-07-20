public class Department {
    
    private int departmentID;
    private String departmentName;
    private String location;

    
    public Department(int departmentID, String departmentName, String location) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.location = location;
    }

    
    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    
    public static void main(String[] args) {
        
        Department department = new Department(1, "Cardiology", "West Wing");

        
        System.out.println("Department ID: " + department.getDepartmentID());
        System.out.println("Department Name: " + department.getDepartmentName());
        System.out.println("Location: " + department.getLocation());
    }
}

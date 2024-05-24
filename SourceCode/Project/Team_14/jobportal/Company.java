package jobportal;

public class Company {
    private String description;
    private int C_id; 
    private String email;
    private String address;

    
    public Company(String description, int C_id, String email, String address) {
        this.description = description;
        this.C_id = C_id;
        this.email = email;
        this.address = address;
    }

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getC_id() {
        return C_id;
    }

    public void setC_id(int C_id) {
        this.C_id = C_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   
    public static void main(String[] args) {
        
        Company company1 = new Company("Software Development", 401, "infosys@company1.com", "delhi");
Company company2 = new Company("E-commerce", 402, "amazon@company2.com", "hyd");
Company company3 = new Company("Healthcare", 403, "flipkart@company3.com", "hyd");
Company company4 = new Company("Finance", 404, "dell@company4.com", "paris");
Company company5 = new Company("Education", 405, "ace@company5.com", "ghatkesar");

System.out.println("Company 1 Description: " + company1.getDescription());
System.out.println("Company 1 Email: " + company1.getEmail());
System.out.println("Company 2 Description: " + company2.getDescription());
System.out.println("Company 2 Email: " + company2.getEmail());
System.out.println("Company 3 Description: " + company3.getDescription());
System.out.println("Company 3 Email: " + company3.getEmail());
System.out.println("Company 4 Description: " + company4.getDescription());
System.out.println("Company 4 Email: " + company4.getEmail());
System.out.println("Company 5 Description: " + company5.getDescription());


    }
}

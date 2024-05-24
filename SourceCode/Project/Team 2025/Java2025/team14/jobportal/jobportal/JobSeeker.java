package jobportal;

public class JobSeeker {
    private String id;
    private String name;
    private String username;
    private String email;
    private String address;

   
    public JobSeeker(String id, String name, String username, String email, String address) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.address = address;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
        JobSeeker jobSeeker1 = new JobSeeker("101", "adarsh", "adarsh", "adar@example.com", "hyd");
JobSeeker jobSeeker2 = new JobSeeker("102", "anish", "anish", "anish@example.com", "hyd");
JobSeeker jobSeeker3 = new JobSeeker("103", "akila", "akila1", "akhi@example.com", "hyd");
JobSeeker jobSeeker4 = new JobSeeker("104", "pavan", "pavan", "pavan@example.com", "Hyd");
JobSeeker jobSeeker5 = new JobSeeker("105", "shekar", "shekar", "shekar@example.com", "hyd");

System.out.println("Job Seeker 1 Name: " + jobSeeker1.getName());
System.out.println("Job Seeker 1 Email: " + jobSeeker1.getEmail());
System.out.println("Job Seeker 2 Name: " + jobSeeker2.getName());
System.out.println("Job Seeker 2 Email: " + jobSeeker2.getEmail());
System.out.println("Job Seeker 3 Name: " + jobSeeker3.getName());
System.out.println("Job Seeker 3 Email: " + jobSeeker3.getEmail());
System.out.println("Job Seeker 4 Name: " + jobSeeker4.getName());
System.out.println("Job Seeker 4 Email: " + jobSeeker4.getEmail());
System.out.println("Job Seeker 5 Name: " + jobSeeker5.getName());
System.out.println("Job Seeker 5 Email: " + jobSeeker5.getEmail());


    }
}

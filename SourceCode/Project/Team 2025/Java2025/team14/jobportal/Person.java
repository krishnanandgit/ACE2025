package jobportal;

public class Person {
    private String username;
    private String password;
    private String email;
    
    // Constructors
    public Person() {}

    public Person(String username, String password,  String email) {
        this.username = username;
        this.password = password;
        this.email = email; 
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }

    // Setters
    public void setusername(String username) {
        this.username = username;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public void setemail(String email) {
        this.email = email;
    }

    

    public void display() {
        System.out.println("Person Details:");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Email: " + email);
        
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}




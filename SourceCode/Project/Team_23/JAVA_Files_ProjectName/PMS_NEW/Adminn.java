public class Adminn {
    private int id;
    private String name;
    private String email;

    public Adminn(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void login() {
        System.out.println(name + " logged in as Admin.");
    }

    public void viewAuditLogs() {
        System.out.println("Viewing audit logs...");
    }

    // Method to log out
    public void logout() {
        System.out.println(name + " logged out.");
    }
}

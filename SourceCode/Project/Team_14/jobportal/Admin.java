package jobportal;

public class Admin {
    private String name;
    private String address;
    private int id;
    private String username;
    private String email;

    
    public Admin(String name, String address, int id, String username, String email) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.username = username;
        this.email = email;
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

   
    public static void main(String[] args) {
        Admin admin1 = new Admin("adarsh", "hyd", 301, "adar", "adar@example.com");
Admin admin2 = new Admin("anish", "hyd", 302, "ani", "ani@example.com");
Admin admin3 = new Admin("akhila", "hyd", 303, "aki", "aki@example.com");
Admin admin4 = new Admin("pavan", "hyd", 304, "pav", "pav@example.com");
Admin admin5 = new Admin("shekar", "hyd", 305, "shek", "shek@example.com");

System.out.println("Admin 1 Name: " + admin1.getName());
System.out.println("Admin 1 Email: " + admin1.getEmail());

System.out.println("Admin 2 Name: " + admin2.getName());
System.out.println("Admin 2 Email: " + admin2.getEmail());


System.out.println("Admin 3 Name: " + admin3.getName());
System.out.println("Admin 3 Email: " + admin3.getEmail());

System.out.println("Admin 4 Name: " + admin4.getName());
System.out.println("Admin 4 Email: " + admin4.getEmail());

System.out.println("Admin 5 Name: " + admin5.getName());
System.out.println("Admin 5 Email: " + admin5.getEmail());



    }
}
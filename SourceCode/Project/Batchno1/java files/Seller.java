public class Seller {
    private int id;
    private String name;
    private int age;
    private String contactnum;
    private String username;
    private String password;

    public Seller(int id, String name, int age, String contactnum, String username, String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.contactnum = contactnum;
        this.username = username;
        this.password = password;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContactnum() {
        return contactnum;
    }

    public void setContactnum(String contactnum) {
        this.contactnum = contactnum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public static void main(String[] args) {
        Seller seller = new Seller(1, "John Doe", 30, "123-456-7890", "john_seller", "password123");
        System.out.println("Seller ID: " + seller.getId());
        System.out.println("Seller Name: " + seller.getName());
        System.out.println("Seller Age: " + seller.getAge());
        System.out.println("Seller Contact Number: " + seller.getContactnum());
        System.out.println("Seller Username: " + seller.getUsername());
        System.out.println("Seller Password: " + seller.getPassword());
    }
}
package jobportal;

public class User {
    // Attributes
    private String username;
    private String password;
    private String email;

   
    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayUserInfo() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
    }

   
    public static void main(String[] args) {
        User user1 = new User("adarsh", "Password123", "adarsh@example.com");
        user1.displayUserInfo();
        user1.setUsername("adarsh");
        user1.setEmail("adarsh@example.com");
        System.out.println("\nUpdated User Info:");
        user1.displayUserInfo();

        User user2 = new User("anish", "Password123", "anish@example.com");
        user2.displayUserInfo();
        user2.setUsername("anish");
        user2.setEmail("anish@example.com");
        System.out.println("\nUpdated User Info:");
        user2.displayUserInfo();

        User user3 = new User("akhila", "Password123", "akhila@example.com");
        user3.displayUserInfo();
        user3.setUsername("akhila");
        user3.setEmail("akhila@example.com");
        System.out.println("\nUpdated User Info:");
        user3.displayUserInfo();

        User user4 = new User("pavan", "Password123", "pavan@example.com");
        user4.displayUserInfo();
        user4.setUsername("pavan");
        user4.setEmail("pavan@example.com");
        System.out.println("\nUpdated User Info:");
        user4.displayUserInfo();

        User user5 = new User("shekar", "Password123", "shekar@example.com");
        user5.displayUserInfo();
        user5.setUsername("shekar");
        user5.setEmail("shekar@example.com");
        System.out.println("\nUpdated User Info:");
        user5.displayUserInfo();
    }
}
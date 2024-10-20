package Bidder;
public class bidder {
    private int bidderId;
    private String username;
    private String email;
    private String password;

    public bidder(int bidderId, String username, String email, String password) {
        this.bidderId = bidderId;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public int getBidderId() {
        return bidderId;
    }

    public void setBidderId(int bidderId) {
        this.bidderId = bidderId;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "Bidder{" +
                "bidderId=" + bidderId +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

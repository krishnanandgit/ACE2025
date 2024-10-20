public abstract class User {
    private int userID;
    private String name;
    private String contact;

    
    public User(int userID, String name, String contact) {
        this.userID = userID;
        this.name = name;
        this.contact = contact;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    // Abstract methods for login and logout
    public abstract void login();
    public abstract void logout();
}

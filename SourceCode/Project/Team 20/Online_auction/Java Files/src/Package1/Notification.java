public class Notification 
{
    private User user;
    private String message;

    public Notification(User user, String message) 
    {
        this.user = user;
        this.message = message;
    }

    public String getMessage() 
    {
        return message;
    }
}


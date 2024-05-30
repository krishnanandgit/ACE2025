import java.util.List;

public class Freelancer<review, project, proposal> {
    private int id;
    private String username;
    private String password;
    private String email;
    private List<Skill> skills;
    private Portfolio portfolio;
    private List<review> reviews;
    private List<project> projects; // Many-to-many
    private List<proposal> proposals; // One-to-many
    private List<Payment> payments; // One-to-many
    private List<Message> messages; // One-to-many
    // Constructors, getters, setters
}


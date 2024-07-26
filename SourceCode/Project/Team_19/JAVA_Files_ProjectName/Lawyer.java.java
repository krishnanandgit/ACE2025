import java.util.Date;

public class Lawyer {
    private int lawyerID;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private Date dateHired;
    private String specialization;

    public Lawyer(int lawyerID, String firstName, String lastName, Date dateOfBirth, Date dateHired,
            String specialization) {
        this.lawyerID = lawyerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.dateHired = dateHired;
        this.specialization = specialization;
    }

    public int getLawyerID() {
        return lawyerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setLawyerID(int lawyerID) {
        this.lawyerID = lawyerID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}

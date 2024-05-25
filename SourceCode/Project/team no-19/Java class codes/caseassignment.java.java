import java.util.Date;

public class CaseAssignment {
    private int assignmentID;
    private int caseID;
    private int lawyerID;
    private Date assignmentDate;
    private String status;

    public CaseAssignment(int assignmentID, int caseID, int lawyerID, Date assignmentDate, String status) {
        this.assignmentID = assignmentID;
        this.caseID = caseID;
        this.lawyerID = lawyerID;
        this.assignmentDate = assignmentDate;
        this.status = status;
    }

    public int getAssignmentID() {
        return assignmentID;
    }

    public int getCaseID() {
        return caseID;
    }

    public int getLawyerID() {
        return lawyerID;
    }

    public Date getAssignmentDate() {
        return assignmentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setAssignmentID(int assignmentID) {
        this.assignmentID = assignmentID;
    }

    public void setCaseID(int caseID) {
        this.caseID = caseID;
    }

    public void setLawyerID(int lawyerID) {
        this.lawyerID = lawyerID;
    }

    public void setAssignmentDate(Date assignmentDate) {
        this.assignmentDate = assignmentDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}

import java.util.Date;

public class LegalCase {
    private int caseID;
    private int clientID;
    private String caseType;
    private Date dateOpened;
    private Date dateClosed;
    private String caseStatus;

    public LegalCase(int caseID, int clientID, String caseType, Date dateOpened, Date dateClosed, String caseStatus) {
        this.caseID = caseID;
        this.clientID = clientID;
        this.caseType = caseType;
        this.dateOpened = dateOpened;
        this.dateClosed = dateClosed;
        this.caseStatus = caseStatus;
    }

    public int getCaseID() {
        return caseID;
    }

    public int getClientID() {
        return clientID;
    }

    public String getCaseType() {
        return caseType;
    }

    public Date getDateOpened() {
        return dateOpened;
    }

    public Date getDateClosed() {
        return dateClosed;
    }

    public String getCaseStatus() {
        return caseStatus;
    }

    public void setCaseID(int caseID) {
        this.caseID = caseID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public void setDateOpened(Date dateOpened) {
        this.dateOpened = dateOpened;
    }

    public void setDateClosed(Date dateClosed) {
        this.dateClosed = dateClosed;
    }

    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }

}

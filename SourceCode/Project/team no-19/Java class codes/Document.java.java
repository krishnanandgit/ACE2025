import java.util.Date;

public class Document {
    private int documentID;
    private int caseID;
    private String documentType;
    private Date uploadDate;
    private String filePath;
    private String notes;

    public Document(int documentID, int caseID, String documentType, Date uploadDate, String filePath, String notes) {
        this.documentID = documentID;
        this.caseID = caseID;
        this.documentType = documentType;
        this.uploadDate = uploadDate;
        this.filePath = filePath;
        this.notes = notes;
    }

    public int getDocumentID() {
        return documentID;
    }

    public int getCaseID() {
        return caseID;
    }

    public String getDocumentType() {
        return documentType;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getNotes() {
        return notes;
    }

    public void setDocumentID(int documentID) {
        this.documentID = documentID;
    }

    public void setCaseID(int caseID) {
        this.caseID = caseID;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

}
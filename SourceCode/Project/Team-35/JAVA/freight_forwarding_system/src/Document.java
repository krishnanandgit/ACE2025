public class Document {
    private int document_id;
    private int shipment_id;
    private String document_type;
    private String description;
    private String document_status;

    public Document(int document_id, int shipment_id, String document_type, String description, String document_status) {
        this.document_id = document_id;
        this.shipment_id = shipment_id;
        this.document_type = document_type;
        this.description = description;
        this.document_status = document_status;
    }

    public int getDocument_id() {
        return document_id;
    }

    public void setDocument_id(int document_id) {
        this.document_id = document_id;
    }

    public int getShipment_id() {
        return shipment_id;
    }

    public void setShipment_id(int shipment_id) {
        this.shipment_id = shipment_id;
    }

    public String getDocument_type() {
        return document_type;
    }

    public void setDocument_type(String document_type) {
        this.document_type = document_type;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDocument_status() {
        return document_status;
    }

    public void setDocument_status(String document_status) {
        this.document_status = document_status;
    }

    public void displayDocument() {
        System.out.println("Document details:");
        System.out.println("Document_id : " + this.getDocument_id());
        System.out.println("Shipment_id : " + this.getShipment_id());
        System.out.println("Document_Type : " + this.getDocument_type());
        System.out.println("Description : " + this.getDescription());
        System.out.println("Document_Status : " + this.getDocument_status());
    }
}

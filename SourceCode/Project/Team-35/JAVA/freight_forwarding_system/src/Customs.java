public class Customs {
    private int customs_id;
    private int shipment_id;
    private String declaration_date;
    private String clearance_status;
    private String duty_amount;

    public Customs(int customs_id, int shipment_id, String declaration_date, String clearance_status, String duty_amount) {
        this.customs_id = customs_id;
        this.shipment_id = shipment_id;
        this.declaration_date = declaration_date;
        this.clearance_status = clearance_status;
        this.duty_amount = duty_amount;
    }

    public int getCustoms_id() {
        return customs_id;
    }

    public void setCustoms_id(int customs_id) {
        this.customs_id = customs_id;
    }

    public int getShipment_id() {
        return shipment_id;
    }

    public void setShipment_id(int shipment_id) {
        this.shipment_id = shipment_id;
    }

    public String getDeclaration_date() {
        return declaration_date;
    }

    public void setDeclaration_date(String declaration_date) {
        this.declaration_date = declaration_date;
    }

    public String getClearance_status() {
        return clearance_status;
    }

    public void setClearance_status(String clearance_status) {
        this.clearance_status = clearance_status;
    }

    public String getDuty_amount() {
        return duty_amount;
    }

    public void setDuty_amount(String duty_amount) {
        this.duty_amount = duty_amount;
    }

    public void displayCustoms(){
        System.out.println("Customs details:");
        System.out.println("Customs_id : "+this.getCustoms_id());
        System.out.println("Shipment_id :"+this.getShipment_id());
        System.out.println("Declaration_date : "+this.getDeclaration_date());
        System.out.println("Clearance_status : "+this.getClearance_status());
        System.out.println("Duty_amount "+this.getDuty_amount() );
    }
}
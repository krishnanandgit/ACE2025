

public class Client {
    private int client_id;
    private String client_name;
    private String contact_info;
    private String address;

    public Client(int client_id, String client_name, String contact_info, String address) {
        this.client_id = client_id;
        this.client_name = client_name;
        this.contact_info = contact_info;
        this.address = address;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getContact_info() {
        return contact_info;
    }

    public void setContact_info(String contact_info) {
        this.contact_info = contact_info;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayClient(){
        System.out.println("Client details:");
        System.out.println("Client_id : "+this.getClient_id());
        System.out.println("Client_name : "+this.getClient_name());
        System.out.println("Contact_info : "+this.getContact_info());
        System.out.println("Address : "+this.getAddress());
    }
}

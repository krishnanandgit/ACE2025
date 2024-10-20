package Auctioneer;

public class Auctioneer {
    private int auctioneerId;
    private String name;
    private String contactInfo;

    public Auctioneer(int auctioneerId, String name, String contactInfo) {
        this.auctioneerId = auctioneerId;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public int getAuctioneerId() {
        return auctioneerId;
    }

    public void setAuctioneerId(int auctioneerId) {
        this.auctioneerId = auctioneerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Override
    public String toString() {
        return "Auctioneer{" +
                "auctioneerId=" + auctioneerId +
                ", name='" + name + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                '}';
    }
}

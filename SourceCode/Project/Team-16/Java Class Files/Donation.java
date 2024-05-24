public class Donation {

    int donationId;
    int amount;
    String date;

    public int getDonationId() {
        return donationId;
    }
    public void setDonationId(int donationId) {
        this.donationId = donationId;
    }

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public void displayDonationDetails() {
        System.out.println("Donation ID : " + donationId);
        System.out.println("Amount : " + amount);
        System.out.println("Date : " + date);
    }

    
}

public class PaymentEntity {
    private int id;
    private int cardnumber;
    private String amount;

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public int getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(int cardnumber) {
        this.cardnumber = cardnumber;
    }

    
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    

    public static void main(String[] args) {
       
        PaymentEntity payment = new PaymentEntity();
        payment.setId(123);
        payment.setCardnumber(456789);
        payment.setAmount("100.50");

        System.out.println("Payment ID: " + payment.getId());
        System.out.println("Card Number: " + payment.getCardnumber());
        System.out.println("Amount: " + payment.getAmount());
    }
}
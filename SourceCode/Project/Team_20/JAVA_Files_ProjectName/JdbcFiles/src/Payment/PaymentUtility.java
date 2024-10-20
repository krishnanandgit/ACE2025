package Payment;
public class PaymentUtility {
    private PaymentDAO paymentDAO;

    public PaymentUtility() {
        paymentDAO = new PaymentDAO();
    }

    public void addPayment(int paymentId, int amount, String paymentDate, int bidderId, int auctionId, int auctioneerId) {
        Payment newPayment = new Payment(paymentId, amount, paymentDate, bidderId, auctionId, auctioneerId);
        paymentDAO.addPayment(newPayment);
    }

    public Payment getPayment(int paymentId) {
        return paymentDAO.getPaymentById(paymentId);
    }

    public void updatePayment(int paymentId, int newAmount, String newPaymentDate, int newBidderId, int newAuctionId, int newAuctioneerId) {
        paymentDAO.updatePayment(paymentId, newAmount, newPaymentDate, newBidderId, newAuctionId, newAuctioneerId);
    }

    public void deletePayment(int paymentId) {
        paymentDAO.deletePayment(paymentId);
    }

    public void displayPayments() {
        paymentDAO.displayAllPayments();
    }
}

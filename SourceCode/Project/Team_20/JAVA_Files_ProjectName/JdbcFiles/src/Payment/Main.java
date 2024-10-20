package Payment;
public class Main {
    public static void main(String[] args) {
        PaymentDAO paymentDAO = new PaymentDAO();
        
        paymentDAO.createTable();
        
        paymentDAO.addPayment(new Payment(1, 1000, "2024-10-18", 1, 1, 1));
        paymentDAO.addPayment(new Payment(2, 2000, "2024-10-19", 2, 2, 2));
        
        paymentDAO.displayAllPayments();
        
                paymentDAO.updatePayment(1, 1500, "2024-10-20", 1, 1, 1);
                
                paymentDAO.displayAllPayments();
                
                Payment payment = paymentDAO.getPaymentById(1);
                if (payment != null) {
                    System.out.println("Fetched payment: " + payment);
                }

                paymentDAO.deletePayment(2);
                
                paymentDAO.displayAllPayments();
            }
        }

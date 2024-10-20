package Commission;


public class Main {
    public static void main(String[] args) {
        CommissionDAO commissionDAO = new CommissionDAO();
        
        // Create table
        commissionDAO.createTable();
        
        // Adding commissions
        commissionDAO.addCommission(new Commission(1, 101, 500));
        commissionDAO.addCommission(new Commission(2, 102, 700));
        
        // Display all commissions
        commissionDAO.displayAllCommissions();
        
        // Update commission
        commissionDAO.updateCommission(1, 103, 600);
        
        // Display all commissions after update
        commissionDAO.displayAllCommissions();
        
        // Get commission by ID
        Commission commission = commissionDAO.getCommissionById(1);
        if (commission != null) {
            System.out.println("Fetched commission: " + commission);
        }

        // Delete commission
        commissionDAO.deleteCommission(2);
        
        // Display all commissions after deletion
        commissionDAO.displayAllCommissions();
    }
}

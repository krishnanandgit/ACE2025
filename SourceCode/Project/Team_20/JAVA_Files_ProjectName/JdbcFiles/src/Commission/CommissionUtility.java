package Commission;


public class CommissionUtility {
    private CommissionDAO commissionDAO;

    public CommissionUtility() {
        commissionDAO = new CommissionDAO();
    }

    public void addCommission(int commissionId, int auctionId, int commissionAmount) {
        Commission newCommission = new Commission(commissionId, auctionId, commissionAmount);
        commissionDAO.addCommission(newCommission);
    }

    public Commission getCommission(int commissionId) {
        return commissionDAO.getCommissionById(commissionId);
    }

    public void updateCommission(int commissionId, int newAuctionId, int newCommissionAmount) {
        commissionDAO.updateCommission(commissionId, newAuctionId, newCommissionAmount);
    }

    public void deleteCommission(int commissionId) {
        commissionDAO.deleteCommission(commissionId);
    }

    public void displayCommissions() {
        commissionDAO.displayAllCommissions();
    }
}

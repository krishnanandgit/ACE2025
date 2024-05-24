package studentInfoSystem;

public class Fee {
	String student_id;
    double amount;
    String fee_id;

    public Fee(String student_id, double amount, String fee_id) {
        this.student_id = student_id;
        this.amount = amount;
        this.fee_id = fee_id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getFee_id() {
        return fee_id;
    }

    public void setFee_id(String fee_id) {
        this.fee_id = fee_id;
    }

    public void display() {
        System.out.println("Fee_id:"+fee_id);
        System.out.println("Amount: " + amount);
        System.out.println("Student_id: " + student_id);
    }


    


}

package EventManagement;
import java.util.*;
public class Budget {
    private int budgetId;
    private int eventId;
    private String expenseCategory;
    private double amount;
    Scanner scanner = new Scanner(System.in);
    public Budget(int budgetId, int eventId, String expenseCategory, double amount)
   {
        this.budgetId = budgetId;
        this.eventId = eventId;
        this.expenseCategory = expenseCategory;
        this.amount = amount;
    }
    public void createEvent() 
    {
        System.out.println("Enter event details:");
        System.out.print("Budget Id: ");
        this.budgetId = scanner.nextInt();
        System.out.print("eventId: ");
        this.eventId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("ExpenseCategory: ");
        this.expenseCategory = scanner.nextLine();
        System.out.print("Amount: ");
        this.amount = scanner.nextDouble();
        System.out.println("Details received successfully.");
    }
    
    public void trackExpenses()
    {
        System.out.print("Expense: ");
        double expense = scanner.nextDouble();
        this.amount -= expense;
        System.out.println("Expense tracked for category '" + expenseCategory + "': $" + expense);
    }

    public void allocateBudget() {
        System.out.print("newAmount: ");
        double newAmount=scanner.nextDouble();
        this.amount = newAmount;
        System.out.println("Budget allocated for category '" + expenseCategory + "': $" + newAmount);
    }

    public void generateExpenseReport() {
        System.out.println("Expense Report for Budget ID " + budgetId + " - Event ID " + eventId);
        System.out.println("Expense Category: " + expenseCategory);
        System.out.println("Allocated Amount: $" + amount);
    }

    // Getters and Setters
    public int getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(int budgetId) {
        this.budgetId = budgetId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getExpenseCategory() {
        return expenseCategory;
    }

    public void setExpenseCategory(String expenseCategory) {
        this.expenseCategory = expenseCategory;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

package package1;

import java.util.List;
import java.util.ArrayList;
public class User {
    private int userId;
    private String email;
    private String username;
    private String password;
    private int subscriptionId;
    private List<Recommendation> recommendations;
    private List<History> history;
    private List<Payment> payments;

    public User(int userId, String email, String username, String password, int subscriptionId) {
        this.userId = userId;
        this.email = email;
        this.username = username;
        this.password = password;
        this.subscriptionId = subscriptionId;
        this.recommendations = new ArrayList<>();
        this.history = new ArrayList<>();
        this.payments = new ArrayList<>();
    }

    // Getters and setters

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public List<Recommendation> getRecommendations() {
        return recommendations;
    }

    public void addRecommendation(Recommendation recommendation) {
        this.recommendations.add(recommendation);
    }

    public List<History> getHistory() {
        return history;
    }

    public void addHistory(History history) {
        this.history.add(history);
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void addPayment(Payment payment) {
        this.payments.add(payment);
    }
}
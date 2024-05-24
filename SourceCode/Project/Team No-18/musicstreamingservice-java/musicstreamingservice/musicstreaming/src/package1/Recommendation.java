package package1;

public class Recommendation {
    private int userId;
    private int recommendationId;
    private String song;

    public Recommendation(int userId, int recommendationId, String song) {
        this.userId = userId;
        this.recommendationId = recommendationId;
        this.song = song;
    }

    // Getters and setters

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRecommendationId() {
        return recommendationId;
    }

    public void setRecommendationId(int recommendationId) {
        this.recommendationId = recommendationId;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }
}
package Review;


public class Review {
    private int reviewId;
    private int auctionId;
    private int bidderId;
    private String comment;
    private int rating;

    public Review(int reviewId, int auctionId, int bidderId, String comment, int rating) {
        this.reviewId = reviewId;
        this.auctionId = auctionId;
        this.bidderId = bidderId;
        this.comment = comment;
        this.rating = rating;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public int getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(int auctionId) {
        this.auctionId = auctionId;
    }

    public int getBidderId() {
        return bidderId;
    }

    public void setBidderId(int bidderId) {
        this.bidderId = bidderId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String   toString() {
        return "Review{" +
                "reviewId=" + reviewId +
                ", auctionId=" + auctionId +
                ", bidderId=" + bidderId +
                ", comment='" + comment + '\'' +
                ", rating=" + rating +
                '}';
    }
}
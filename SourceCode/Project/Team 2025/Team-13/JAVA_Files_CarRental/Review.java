package carrental;

public class Review {
  private String reviewId;
  private int rating;
  private String comments;

  public Review(String reviewId, int rating, String comments){
    this.reviewId=reviewId;
    this.rating=rating;
    this.comments=comments;

  }
  public void displayreview(){
    System.out.println("The customer id of "+Customer.CustomerId+" of Review id is "+reviewId+" given rating of "+rating+" with comments "+comments);
  }

}

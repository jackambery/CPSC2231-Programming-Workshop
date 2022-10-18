package lab2;

public class MovieReview {
	
	private String movieName;
	private String review;
	private String stars;
	
	public MovieReview(String movieName, String review) {
		this.movieName = movieName;
		this.review = review;
	}
	
	public void setStars(String stars) {
		this.stars = stars;
	}
	
	public void display() {
		System.out.println("Movie: " + movieName);
		System.out.println(" Review: " + review);
		System.out.println(" Rating: " + stars + " stars\n");
	}
	
}

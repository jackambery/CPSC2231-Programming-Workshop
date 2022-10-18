package lab2;

public class TestHarness {

	public static void main(String[] args) {

		MovieCritic james = new MovieCritic("james");
		MovieCritic joey = new MovieCritic("joey");
		MovieCritic jessica = new MovieCritic("jessica");
		
		james.addReview("The Amazing Spiderman", "This was the best movie I have ever seen.", "5");
		james.addReview("Inception", "Too confusing", "1");
		james.addReview("Madagascar", "Phenomenal plot", "4");

		joey.addReview("The Amazing Spiderman", "The new one is better", "3");
		joey.addReview("Inception", "Mind-blowing", "5");
		joey.addReview("Spongebob: The Movie", "David Hasselhoff was excellent in this.", "5");

		jessica.addReview("The Amazing Spiderman", "Too boring", "2");
		jessica.addReview("Spongebob: The Movie", "The ending was incredible", "4");
		jessica.addReview("The Shawshank Redemption", "My favorite of all time", "5");

		System.out.println("What Joey thought of Spongebob: The Movie...");
		joey.getReview("Spongebob: The Movie");
		
		System.out.println("\nAll of Jessica's Reviews...");
		jessica.getAllReviews();
		
	}

}

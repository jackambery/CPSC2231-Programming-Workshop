package lab2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MovieCritic {
	
	private String criticName;
	private Map<String, MovieReview> reviews;
	
	public MovieCritic(String name) {
		criticName = name;
		reviews = new HashMap<String, MovieReview>();
	}
	
	public void addReview(String movieName, String review, String stars) {
		MovieReview mr = new MovieReview(movieName, review);
		mr.setStars(stars);
		reviews.put(movieName, mr);
	}
	
	public void getReview(String movieName) {
		MovieReview mr = reviews.get(movieName);
		mr.display();
	}
	
	public void getAllReviews() {
		Set<String> ks = reviews.keySet();
		for (String s : ks) {
			MovieReview mr = reviews.get(s);
			mr.display();
		}
	}
}

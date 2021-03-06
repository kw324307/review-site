package review;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ReviewRepository {

	private Map<Long, Review> reviewsById;
	
	public ReviewRepository() {
		
		reviewsById = new HashMap<Long, Review>();
		
		Review review1 = new Review(1, "Review of Hitchhiker's Guide", "Kierra Westmoreland", "Lorem Ipsum and so on", new Date(2016, 11, 11));
		reviewsById.put(review1.getId(), review1);
		
		Review review2 = new Review(2, "Chess Moves", "Seth Dolan", "Lorem Ipsum and so on", new Date(2016, 10, 24));
		reviewsById.put(review2.getId(), review2);
		
		Review review3 = new Review(3, "Coding Basics", "Kierra Westmoreland", "Lorem Ipsum and so on", new Date(2016, 11, 25));
		reviewsById.put(review3.getId(), review3);
	}

	public Review findById(long id) {
		return reviewsById.get(id);
	}
	
	public Collection<Review> findAll(){
	
		return reviewsById.values();
	}
	
	

}

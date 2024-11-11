import java.util.ArrayList;

public class MovieDriver {

	public static void main(String[] args) {

		ArrayList<Movie> movieList = new ArrayList<Movie>();
		movieList.add(new Movie("X Movie", "Y Director", MovieType.BELGESEL, 2001));
		movieList.add(new Movie("Y Movie", "Z Director", MovieType.DRAM, 2010));
		movieList.add(new Movie("Z Movie", "Q Director", MovieType.KOMEDI, 2017));
		
		for(Movie m : movieList) {
			System.out.println(m.toString());
		}
		
		System.out.println(movieList.get(2));

	}

}

import java.io.Serializable;
import java.util.Objects;

public class Movie implements Serializable {
	
	private String name;
	private String Director;
	private MovieType genre;
	private int publishYear;
	public Movie(String name, String director, MovieType genre, int publishYear) {
		super();
		this.name = name;
		Director = director;
		this.genre = genre;
		this.publishYear = publishYear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirector() {
		return Director;
	}
	public void setDirector(String director) {
		Director = director;
	}
	public MovieType getGenre() {
		return genre;
	}
	public void setGenre(MovieType genre) {
		this.genre = genre;
	}
	public int getPublishYear() {
		return publishYear;
	}
	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Director, genre, name, publishYear);
	}
	@Override
	public boolean equals(Object obj) {
		Movie other = (Movie) obj;
		return Objects.equals(name, other.name)	&& publishYear == other.publishYear;
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", Director=" + Director + ", genre=" + genre + ", publishYear=" + publishYear
				+ "]";
	}
	
	

}

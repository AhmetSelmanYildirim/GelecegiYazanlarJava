import java.io.Serializable;
import java.util.Objects;

public class Book implements Serializable {

	private String name;
	private int year;
	private Writer writer;
	public Book(String name, int year, Writer writer) {
		super();
		this.name = name;
		this.year = year;
		this.writer = writer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Writer getWriter() {
		return writer;
	}
	public void setWriter(Writer writer) {
		this.writer = writer;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, writer, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(name, other.name) && Objects.equals(writer, other.writer) && year == other.year;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", year=" + year + ", writer=" + writer + "]";
	}
	
	
	
}

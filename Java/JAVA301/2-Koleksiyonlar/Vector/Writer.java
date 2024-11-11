import java.util.Objects;

public class Writer {
	
	private String name;
	private String surname;
	
	public Writer() {
		
	}
	public Writer(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	@Override
	public boolean equals(Object o) {
		Writer writer = (Writer) o;
		return this.name.equals(writer.name) && this.surname.equals(writer.surname);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public String toString() {
		return "Writer [name=" + name + ", surname=" + surname + "]";
	}

}

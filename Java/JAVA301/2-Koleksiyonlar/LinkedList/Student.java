import java.util.Objects;

public class Student {
	
	private int number;
	private String name;
	private String surname;
	
	
	public Student(int number, String name, String surname) {
		super();
		this.number = number;
		this.name = name;
		this.surname = surname;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
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
	public String toString() {
		return "numara: " + number + " ad: " + name + " soyad: " + surname;
	}

	@Override
	public int hashCode() {
		return number;
	}

	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		return number == other.number;
	}
	
	
	
	
	
}

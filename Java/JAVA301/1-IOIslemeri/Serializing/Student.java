import java.io.Serializable;
import java.util.Objects;

// Serializable interface i bir imza interfacedir içinde bir şey yoktur. Ancak java bu interfacei instanceOf ile bularak hangi sınıfları serileştireceğini buluyor
public class Student implements Serializable {

	private int number;
	private String name;
	private String surname;
	private String grade;
	
	public Student() {
		
	}
	
	public Student(int number, String name, String surname, String grade) {
		this.number = number;
		this.name = name;
		this.surname = surname;
		this.grade = grade;
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
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		return this.number == other.number;
	}

	@Override
	public String toString() {
		return "No:" + number + " Ad: " + name + " Soyad: " + surname + " Sınıf: " + grade;
	}
	
}

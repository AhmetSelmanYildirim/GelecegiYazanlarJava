import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Person {
	
	public enum Gender{
		ERKEK,KADIN
	}
	
	private String name;
	private LocalDate birthOfDate;
	private String email;
	private Gender gender;
	
	public int getAge() {
		return LocalDate.now().getYear() - birthOfDate.getYear();
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirthOfDate() {
		return birthOfDate;
	}
	public void setBirthOfDate(LocalDate birthOfDate) {
		this.birthOfDate = birthOfDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Person(String name, LocalDate birthOfDate, String email, Gender gender) {
		super();
		this.name = name;
		this.birthOfDate = birthOfDate;
		this.email = email;
		this.gender = gender;
	}
	@Override
	public int hashCode() {
		return Objects.hash(email);
	}
	@Override
	public String toString() {
		return "isim=" + name + ", doğum tarihi=" + birthOfDate + ", email=" + email + ", cinsiyet= " + gender + ", yaş: " + getAge() ;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(email, other.email);
	}
	
	

}

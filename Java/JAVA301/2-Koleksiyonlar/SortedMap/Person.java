import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable{

	private String name;
	private String surname;
	private Gender gender;
	private String tcno;
	
	public Person(String name, String surname, Gender gender, String tcno) {
		super();
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.tcno= tcno;
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getTcno() {
		return tcno;
	}

	public void setTcno(String tcno) {
		this.tcno = tcno;
	}

	@Override
	public int hashCode() {
		return Objects.hash(gender, name, surname, tcno);
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
		return Objects.equals(tcno, other.tcno);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", gender=" + gender + ", tcno=" + tcno + "]";
	}
	
	
	
	
	
}

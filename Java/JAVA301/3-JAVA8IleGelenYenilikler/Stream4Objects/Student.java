import java.util.Objects;

public class Student {

	private int no;
	private String name;
	private int age;
	
	public Student() {
		
	}

	public Student(int no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, no);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(name, other.name) && no == other.no;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}

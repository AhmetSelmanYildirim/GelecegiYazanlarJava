
public class Student implements Comparable<Student> {
	
	private int number;
	private String name;
	
	
	
	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;
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
	
	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Student o) {

		/*
		if(o.number < this.number) return 1;
		if(o.number > this.number) return -1;
		else return 0;
		*/
		
		// return this.name.compareTo(o.name);	// alfabeye göre de sıralanabilir.
		return this.number - o.number;
	}
	

}

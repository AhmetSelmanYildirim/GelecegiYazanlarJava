
public class Worker {

	private String name;
	private String subject;
	private int salary;
	
	
	public Worker(String _name, String _subject, int _salary) {
		this.name = _name;
		subject = _subject;
		this.salary = _salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void summary() {
		System.out.println("İsim: " + name);
		System.out.println("Görev: " + subject);
		System.out.println("Maaş: " + salary);
	}

	
}

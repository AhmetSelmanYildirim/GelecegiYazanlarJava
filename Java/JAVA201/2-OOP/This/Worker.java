import java.util.Date;

public class Worker {
	
	private String name;
	private double salary;
	private Date startDate;
	
	
	// Chained constructor
	public Worker() {
		this("Bilinmiyor");
	}
	
	public Worker(String name) {
		this(name,0);
	}
	
	public Worker(String name, double salary) {
		this(name,salary,null);
	}
	
	
	public Worker(String name, double salary, Date startDate) {
		this.name = name;
		this.salary = salary;
		this.startDate = startDate;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void print() {
		System.out.println("Name "+ name);
		System.out.println("Salary "+ salary);
		System.out.println("Startdate "+ startDate);
	}
	
	
}

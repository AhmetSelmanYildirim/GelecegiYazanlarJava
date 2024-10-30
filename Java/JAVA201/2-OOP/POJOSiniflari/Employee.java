import java.util.Date;

public class Employee {

	private String name;
	private double salary;
	private Date startDate;
	
	public void setName(String s) {
		name = s;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSalary(double s) {
		salary = s;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setStartDate(Date d) {
		startDate = d;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	
}

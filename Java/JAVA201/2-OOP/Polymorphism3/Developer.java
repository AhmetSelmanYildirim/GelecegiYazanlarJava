
public class Developer extends Worker {
	
	private String unit;
	
	public Developer(String name, String subject, int salary, String _unit) {
		super(name,subject,salary);
		unit = _unit;		
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String _unit) {
		unit = _unit;
	}
	
	public void summary() {
		System.out.println("Geliştirici İsim: "+ getName());
		System.out.println("Geliştirici Görev: "+ getSubject());
		System.out.println("Geliştirici Maaş: "+ getSalary());
		System.out.println("Geliştirici Birim: "+ unit);
	}

}

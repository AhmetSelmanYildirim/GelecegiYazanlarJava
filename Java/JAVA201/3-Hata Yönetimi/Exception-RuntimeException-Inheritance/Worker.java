
public class Worker {
	
	private String name;
	private double salary;
	
	public String getName() {
		return name;
	}
	// Eğer Exception sınıfından kalıtım alındıysa exception bir checked exception olur.
	// Bu yüzden hata fırlatılan yer try-cathc içine alınmalıdır.
	// Ya da aşağıdaki gibi throws anahtar kelimesi kullanılabilir.
	// RuntimeException sınıfından kalıtım alınırsa bu işleme gerek kalmaz.
	public void setName(String name) throws WrongValue {
		if(name == null || name.trim().length() ==0) {
			throw new WrongValue("name",name);
		}
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) throws WrongValue {
		if(salary < 0) {
			throw new WrongValue("salary",salary);
		}
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "isim: "+name+", maaş: "+salary;
	}

}

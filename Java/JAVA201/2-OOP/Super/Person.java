
public class Person {

	private String name;
	
	public Person(String n) {
		name=n;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printInfo() {
		System.out.println("Kişi: "+ name);
	}
	
}

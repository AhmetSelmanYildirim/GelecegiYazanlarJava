
public class Student {
	public int number;
	public String name;
	public String surname;
	
	// ENCAPSULATION
	private int age;
	
	public void setAge(int x) {
		if(x > 0) {
			age = x;			
		}else {
			System.out.println("Yaş negatif olamaz");
		}
	}
	
	public void printInfo() {
		System.out.println("Numara: "+number);
		System.out.println("Ad: "+name);
		System.out.println("Soyad: "+surname);
		System.out.println("Yaş: "+age);
	}
}

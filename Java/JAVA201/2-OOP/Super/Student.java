
public class Student extends Person{

	private int number;
	
	public Student(String n, int nu) {
		super(n);
		number = nu;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public void summary() {
		System.out.println("Ogrenci Numara: "+ number);
		// Üst sınıftaki metot çağrıldı
		super.printInfo();
	}
	
}

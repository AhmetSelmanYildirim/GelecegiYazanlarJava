
public /*final*/ class Student {
	
	private final int number;

	// number final olduğu için sadece contructor da değeri atanabilir. Sonrasında değiştirilemez.
	public Student(int n) {
		number = n;
	}
	
	public int getNumber() {
		return number;
	}
	
	public final void print() {
		System.out.println(number);
	}


}

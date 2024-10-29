
public class Constructors {
	
	int x;
	// Yapıcı method
	public Constructors() {
		System.out.println("ctor");
		x=10;
	}

	public static void main(String[] args) {
		Constructors ctor = new Constructors();
		System.out.println(ctor.x);
		
		Student student2 = new Student();
		System.out.println(student2.name);
		System.out.println(student2.surname);
		System.out.println(student2.age);
		
		Student student = new Student("Ahmet","YILDIRIM",28);
		System.out.println(student.name);
		System.out.println(student.surname);
		System.out.println(student.age);
		
	}

}

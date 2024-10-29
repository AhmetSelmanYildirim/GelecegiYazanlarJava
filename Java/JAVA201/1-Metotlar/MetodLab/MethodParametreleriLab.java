
public class MethodParametreleriLab {

	public static void main(String[] args) {
		Student student = new Student();
		student.name="Ahmet";
		student.age=28;
		
		MethodParametreleriLab mpl = new MethodParametreleriLab();
		mpl.studentInfo(student);
		
		System.out.println("main: "+student.name);
		System.out.println("main: "+student.age);

	}

	public void studentInfo(Student student) {
		// Yeni bir instance oluşturulursa heapte yeni bir alan ayrılır ve stackte bu yeni adresi point eder.
		// student = new Student();
		student.name= "Selman";
		
		System.out.println("studentInfo: "+student.name);
		System.out.println("studentInfo: "+student.age);
	}
	
}

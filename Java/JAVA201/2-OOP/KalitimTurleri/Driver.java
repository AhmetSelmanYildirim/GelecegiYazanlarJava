
public class Driver {

	public static void main(String[] args) {

		// Tek Seviye Kalıtım - Single Inheritance
		// Person -> Student
		Person person = new Person();
		person.setName("Ahmet YILDIRIM");
		System.out.println(person.getName());

		Student student = new Student();
		student.setName("Ali Can");
		student.setLesson("Math");
		System.out.println(student.getName());
		System.out.println(student.getLesson());
		
		// Çoklu Seviye Kalıtım - Multi Level Inheritance
		// Person -> Student -> UniStudent
		UniStudent uStudent = new UniStudent();
		uStudent.setName("Mehmet Veli");
		uStudent.setLesson("JAVA");
		uStudent.setCampus("KTO");
		System.out.println(uStudent.getName());
		System.out.println(uStudent.getLesson());
		System.out.println(uStudent.getCampus());
		
		// Hiyerarşik Kalıtım
		// Person -> Teacher
		// Person -> Doctor
		
		Teacher teacher = new Teacher();
		teacher.setName("John Doe");
		teacher.setSchool("Selçuk");
		System.out.println(teacher.getName());
		System.out.println(teacher.getSchool());
		
		Doctor doc = new Doctor();
		doc.setName("Rafet Roman");
		doc.setSubject("Surgeon");
		System.out.println(doc.getName());
		System.out.println(doc.getSubject());
		
	}

}


public class Super {
	public static void main(String[] args) {
		Person p = new Person("Ahmet");
		System.out.println(p.getName());
		
		Student s = new Student("Selman",2);
		System.out.println(s.getName());
		System.out.println(s.getNumber());
		s.summary();
		
	}
}

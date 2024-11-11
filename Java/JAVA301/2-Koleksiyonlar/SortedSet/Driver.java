import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Driver {

	public static void main(String[] args) {

		/*
		// sortedSet -> Elemanları küçükten büyüğe doğru veya alfabetik sıralı olarak tutar
		SortedSet<Integer> sortedSet = new TreeSet<>(); // generic kullanım

		sortedSet.add(3);
		sortedSet.add(10);
		sortedSet.add(2);
		sortedSet.add(1);
		
		Iterator<Integer> iterator = sortedSet.iterator(); // iterator collection içinde dönmek için oluşturulan bir nesnedir.
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			System.out.println(next);
		}
		*/
		
		SortedSet<Student> studentSet = new TreeSet<Student>();
		studentSet.add(new Student(5, "Ahmet"));
		studentSet.add(new Student(2, "Ali"));
		studentSet.add(new Student(10, "Ayşe"));
		studentSet.add(new Student(5, "Veli")); // uniqueliği bozacak bir compareTo parametresi verilirse yeni nesne set e eklenmeyecektir.
		
		System.out.println(studentSet.size());
		
		Iterator<Student> iterator = studentSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}

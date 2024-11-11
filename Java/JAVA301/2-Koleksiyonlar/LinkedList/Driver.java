import java.util.Iterator;
import java.util.LinkedList;

public class Driver {

	public static void main(String[] args) {
		/*
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(15);
		linkedList.add(2,1);
		linkedList.add(2,10);
		linkedList.addLast(9);
		linkedList.addFirst(11);
		
		System.out.println("Size: "+linkedList.size());
		
		Iterator<Integer> it = linkedList.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		System.out.println("\nSon Eleman: "+linkedList.getLast());
		System.out.println("İlk Eleman: "+linkedList.getFirst());
		
		System.out.println("2. index: "+linkedList.get(2));
		System.out.println("ilk 10 değerli elemanın indexi: "+ linkedList.indexOf(10));
		System.out.println("son 10 değerli elemanın indexi: "+ linkedList.lastIndexOf(10));
		
		
		linkedList.remove(); // parametre verilmezse ilk elemanı kaldırır.
		linkedList.remove(2); 
		
		Iterator<Integer> it2 = linkedList.iterator();
		while(it2.hasNext()) {
			System.out.print(it2.next()+" ");
		}
		*/
		
		LinkedList<Student> studentList = new LinkedList<Student>();
		studentList.add(new Student(1, "Ahmet", "YILDIRIM"));
		studentList.add(new Student(2, "Selman", "YILMAZ"));
		studentList.add(new Student(3, "Kerem", "AKÇA"));
		System.out.println(studentList.toString());
		Iterator sit = studentList.iterator();
		while(sit.hasNext()) {
			System.out.println(sit.next());
		}
		
		System.out.println("-----------------");
		studentList.remove(1);
		
		sit = studentList.iterator();
		while(sit.hasNext()) {
			System.out.println(sit.next());
		}
	}

}

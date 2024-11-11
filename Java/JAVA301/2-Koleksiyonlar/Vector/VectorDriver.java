import java.util.Iterator;
import java.util.Vector;

public class VectorDriver {

	public static void main(String[] args) {

		Vector<Book> bookVector = new Vector<Book>();
		bookVector.add(new Book("X Book", 1996, new Writer("X","Y")));
		bookVector.add(new Book("Y Book", 2022, new Writer("Y","Y")));
		bookVector.add(new Book("Z Book", 2000, new Writer("Z","Y")));
		
		System.out.println(bookVector.size());
		System.out.println(bookVector.capacity());
		Iterator<Book> it = bookVector.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		bookVector.setSize(1);
		System.out.println(bookVector.size());
		System.out.println(bookVector.capacity());
		
		it = bookVector.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

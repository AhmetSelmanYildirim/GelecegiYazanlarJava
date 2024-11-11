import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Driver {

	public static void main(String[] args) {

		NavigableSet<Integer> navigableSet = new TreeSet<Integer>();
		navigableSet.add(10);
		navigableSet.add(2);
		navigableSet.add(15);
		navigableSet.add(10);

		// System.out.println(navigableSet.size());
		
		/*
		Iterator<Integer> iterator = navigableSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		*/
		/*
		System.out.println(navigableSet.ceiling(5)); // verilen parametreye eşit veya daha büyük en yakın değeri döndürür
		System.out.println(navigableSet.floor(5)); // verilen parametreye eşit veya daha küçük en yakın değeri döndürür
		System.out.println(navigableSet.lower(5));
		System.out.println(navigableSet.higher(5));
		*/
		SortedSet<Integer> sortedSet = navigableSet.headSet(13); // verilen parametreye kadar olan değerleri yeni sette döndürür.
		
		Iterator<Integer> iterator2 = sortedSet.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
	}

}

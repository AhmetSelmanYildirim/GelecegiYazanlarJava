import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class PersonSortedMap {

	public static void main(String[] args) {
		SortedMap<Integer, Person> personMap = new TreeMap<Integer, Person>();
		personMap.put(4, new Person("A", "B", Gender.ERKEK, "132"));
		personMap.put(1, new Person("C", "D", Gender.ERKEK, "478"));
		personMap.put(2, new Person("E", "F", Gender.KADIN, "965"));
		personMap.put(3, new Person("E", "F", Gender.KADIN, "865"));
		
		System.out.println(personMap.size());
		
		Set<Entry<Integer, Person>> entrySet = personMap.entrySet();
		Iterator<Entry<Integer,Person>> it = entrySet.iterator();
		while(it.hasNext()) {
			Entry<Integer,Person> entry = it.next();
			System.out.println(entry.getKey() + ". " + entry.getValue());
		}
		
		
	}
	
}

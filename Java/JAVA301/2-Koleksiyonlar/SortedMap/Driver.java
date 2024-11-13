import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Driver {

	public static void main(String[] args) {

		SortedMap<String, String> sortedMap = new TreeMap<String, String>();
		sortedMap.put("Kedi", "Cat");
		sortedMap.put("Köpek", "Dog");
		sortedMap.put("Araba", "Car");
		sortedMap.put("Kalem", "Pencil");
		
		String val = sortedMap.get("Araba");
		System.out.println(val);
		
		Set<String> keySet = sortedMap.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " = " + sortedMap.get(key));
		}

	}

}

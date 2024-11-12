import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Driver {

	public static void main(String[] args) {

		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(35, "İzmir");
		hashmap.put(34, "İstanbul");
		hashmap.put(07, "Antalya");
		hashmap.put(07, "Kemer"); // key mapte zaten olduğu için ilk değeri sildi yerine bunu atadı.
		
		System.out.println(hashmap.size());
		String val = hashmap.get(7);
		System.out.println(val);
		
		Set<Integer> keySet = hashmap.keySet(); // iterate etmek için bir Set nesnesi oluşturup. keySet() ile keyler döndürülebilir.
		Iterator<Integer> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			int key = iterator.next();
			System.out.println(key + "\t" + hashmap.get(key) );
		}

	}

}

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDriver {

	public static void main(String[] args) {

		HashMap<Integer, City> cityMap = new HashMap<Integer, City>();
		
		cityMap.put(34, new City("İstanbul",20_000_000));
		cityMap.put(35, new City("İzmir",6_000_000));
		cityMap.put(42, new City("Konya",4_000_000));

		System.out.println(cityMap.size());
		City city = cityMap.get(34);
		System.out.println(city);
		
		System.out.println("----------------");
		// Key kümesi
		Set<Integer> keySet = cityMap.keySet();
		Iterator<Integer> it = keySet.iterator();
		while(it.hasNext()) {
			int key = it.next();
			System.out.println(key + "\t" + cityMap.get(key) );
		}
				
		System.out.println("----------------");
		// Value kümesi
		Collection<City> cities = cityMap.values();
		Iterator<City> cit = cities.iterator();
		while(cit.hasNext()) {
			System.out.println(cit.next() );
		}
		System.out.println("----------------");
		
		// Key, value kümesi
		Set<Entry<Integer,City>> entries = cityMap.entrySet();
		Iterator<Entry<Integer, City>> eit = entries.iterator();
		while(eit.hasNext()) {
			System.out.println(eit.next() );
		}
	}

}

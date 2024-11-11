import java.util.Iterator;
import java.util.TreeSet;

public class Driver {

	public static void main(String[] args) {

		/*
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("Siyah");
		treeSet.add("Beyaz");
		treeSet.add("Mavi");
		treeSet.add("Turuncu");
		treeSet.add("Turuncu");
		
		System.out.println(treeSet.size());
		
		Iterator<String> it = treeSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		*/
		
		TreeSet<City> citiesSet = new TreeSet<City>();
		citiesSet.add(new City("34", "İstanbul"));
		citiesSet.add(new City("06", "Ankara"));
		citiesSet.add(new City("35", "İzmir"));
		citiesSet.add(new City("07", "Antalya"));
		citiesSet.add(new City("07", "Konya"));
		
		System.out.println(citiesSet.size());
		Iterator<City> it2 = citiesSet.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		

	}

}

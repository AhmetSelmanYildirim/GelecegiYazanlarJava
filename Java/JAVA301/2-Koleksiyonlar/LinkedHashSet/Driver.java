import java.util.Iterator;
import java.util.LinkedHashSet;

public class Driver {

	public static void main(String[] args) {

		/*
		LinkedHashSet<Integer>linkedHashSet = new LinkedHashSet<Integer>();
		linkedHashSet.add(2);
		linkedHashSet.add(1);
		linkedHashSet.add(5);
		linkedHashSet.add(4);
		linkedHashSet.add(4);
		
		System.out.println(linkedHashSet.size());
		System.out.println(linkedHashSet.isEmpty());
		System.out.println("----------------------");
		
		// TreeSet -> eklenme sırası önemli olmadan nesneleri sıralı geri getirir
		// HashSet -> Sıralı geri getirme garantisi yoktur.
		// LinkedHashSet -> Eklenme sırasına göre geri getirmeyi sağlar.
		
		Iterator<Integer> it = linkedHashSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		*/
		
		LinkedHashSet<Car> carsSet = new LinkedHashSet<Car>();
		carsSet.add(new Car("x", "y", "34aa123"));
		carsSet.add(new Car("q", "w", "34aa123"));
		carsSet.add(new Car("a", "x", "35aa123"));
		carsSet.add(new Car("b", "y", "36aa123"));
		carsSet.add(new Car("c", "z", "37aa123"));
		
		Iterator<Car> it = carsSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Ankara");
		arrayList.add("İstanbul");
		arrayList.add("Adana");
		arrayList.add("Konya");
		
		// Anonim sınıflar ile stream
		Stream<String> stream = arrayList.stream();
		Stream<String> stream2 = stream.filter(new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.startsWith("A");
			}
		});
		
		Stream<String> stream3 = stream2.map(new Function<String, String>() {
			@Override
			public String apply(String t) {
				return t.toUpperCase();
			}
		});
		
		Stream<String> stream4 = stream3.sorted(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		stream4.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		
		
		// Lambda expression ile stream
		arrayList.stream()
			.filter((t) -> t.startsWith("A") )
			.map((a) -> a.toUpperCase()) // String::toUpperCase
			.sorted((c1,c2) -> c1.compareTo(c2) )
			.forEach(System.out::println);
		
		

	}

}

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Driver {

	public static void main(String[] args) {
		/*
		Maths math = new Maths() {
			
			@Override
			public void operate(double a, double b) {
				System.out.println(a+b);
				
			}
		};
		math.operate(10, 50);
		
		Maths math1 = (x,y) -> System.out.println(x+y);
		math1.operate(3, 4);
		Maths math2 = (x,y) -> System.out.println(x-y);
		math2.operate(3, 4);
		*/
		
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Konya");
		cities.add("Ankara");
		cities.add("Kayseri");
		cities.add("Sivas");
		cities.add("Erzurum");
		cities.add("Artvin");
		/*
		// Built-in Consumer functional interface i anonim class ile kullanma
		cities.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t+" ");
			}
		});
		cities.forEach((s)->System.out.println(s+" "));
		 */
		
		// Kendisine gönderilen değeri alıp boolean bir değer döndürür.
		Predicate<String> predicate = new Predicate<String>() { 
			@Override
			public boolean test(String t) {
				return t.startsWith("K");
			}
		};
		
		for(String i: cities) {
			if(predicate.test(i)) {
				System.out.println(i);
			}
		}
		
		// lambda expression ile
		Predicate<String> predicate2 = (t)->t.startsWith("A");
		for(String i: cities) {
			if(predicate2.test(i)) {
				System.out.println(i);
			}
		}
		
		
		
		
	}

}

import java.util.Arrays;
import java.util.Comparator;

public class Driver {

	public static void main(String[] args) {

		Apple[] apples = {
				new Apple(5),
				new Apple(3),
				new Apple(2),
				new Apple(1),
				new Apple(4)	
		};
		
		System.out.println(Arrays.toString(apples));
		
		/*
		Arrays.sort(apples, new AppleComparer());
		System.out.println(Arrays.toString(apples));
		*/
		
		// Anonymous Inner Class
		// yeni bir sınıf oluşturmak yerine Comparator Interfaceinden kalıtım alan tek sefer kullanılacak bir sınıf oluşturuldu.
		// Biz yeni dosya oluşturmasak da derleyici bizim için bir class file oluşturur. Ancak bize soyutlanmış olur.
		
		Arrays.sort(apples, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Apple apple1 = (Apple) o1;
				Apple apple2 = (Apple) o2;
				return apple1.getWeight() - apple2.getWeight();
			}
			
		});
		System.out.println(Arrays.toString(apples));
		
		
		
	}
	
}

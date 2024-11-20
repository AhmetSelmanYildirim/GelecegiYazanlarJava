import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {

		Stream.of(1,2,7,3,8)
			.filter(p -> {							//Predicate
				System.out.println("Test");
				return p >2;
			})										
			.forEach(c -> {							//Consumer
				System.out.println("Accept");
				System.out.println(c);
			}
		);
		/* Output
			Test
			Test
			Test
			Accept
			7
			Test
			Accept
			3
			Test
			Accept
			8	
			
				 Outputtan anlaşılan stream methodları dikey sıralı olarak her eleman için çalışır.
				 Bunun sebebi gereken yerde streami bitirip performans sağlamaktır.
		 
		 */
		System.out.println("-----------------------");
		
		Stream.of(1,2,7,3,8)
			.filter(p -> {							//Predicate
				System.out.println("Test");
				System.out.println(p);
				return p >2;
			})										
			.anyMatch(p -> {						//Consumer
				System.out.println("Test anyMatch");
				return p ==7;
		}
		);
		
		/*
			Test
			Test
			Test
			Test anyMatch
				7 yi bulduğu için stream sonlandırılır.
		*/
		
		System.out.println("-----------------------");
		
		Stream.of("b1","a3","d2","e5")
			.map(a -> {								//Function<T,S>
				System.out.println("Map");
				return a.toUpperCase();
			})
			.filter(t-> {							//Predicate
				System.out.println("Filter");
				return t.startsWith("A");
			})							
			.forEach(System.out::println);
		
		System.out.println("-------------------------");
		
		// Filter daha önce çalıştığı için kendisinden değer dönmeyince map e hiç girmeyecek ve performans artacaktır.
		Stream.of("b1","a3","d2","e5")
			.filter(t-> {							//Predicate
				System.out.println("Filter");
				return t.startsWith("a");
			})	
			.map(a -> {								//Function<T,S>
				System.out.println("Map");
				return a.toUpperCase();
			})					
			.forEach(System.out::println);
		
		System.out.println("-------------------------");
		
		Stream.of("b1","a3","d2","e5")
			.sorted((o1,o2)->{
				System.out.println("Sorted");	    //Comparator
				return o1.compareTo(o2);
			})
			.filter(t-> {							//Predicate
				System.out.println("Filter");
				return t.startsWith("a");
			})	
			.map(a -> {								//Function<T,S>
				System.out.println("Map");
				return a.toUpperCase();
			})					
			.forEach(System.out::println);
		
		/* OUTPUT
			Sorted
			Sorted
			Sorted
			Sorted
			Sorted
			Filter
			Map
			A3
			Filter
			Filter
			Filter
			 
			Sorted diğer methodlardan farklı olarak yatay çalışır ve önce tüm elemanları sort eder.
			O yüzden filterdan sonra kullanılması performansı artıracaktır.
		*/

	}

}

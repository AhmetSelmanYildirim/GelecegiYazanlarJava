import java.util.Optional;

public class Driver {

	public static void main(String[] args) {

		Optional<String> emptyObject = Optional.empty();
		System.out.println(emptyObject.isPresent());
		
		String val = "Selam";
		Optional<String> optional = Optional.of(val);
		System.out.println(optional.isPresent());
		
		String s = null;
		Optional optional2 = Optional.ofNullable(s);
		System.out.println(optional2.isPresent());
		
		// Önceden bu şekilde null check yapılmak zorundaydı 
		String s2 = "Selam";
		if(s2 != null) {
			System.out.println(s2.length());
		}
		
		// Ancak Optional class ile bu değişmiştir.
		Optional optional3 = Optional.ofNullable(s2);
		optional3.ifPresent((x)-> System.out.println(((String) x).length()));
		
		// orElse
		String emptyName = "Ali";
		String name = Optional.ofNullable(emptyName).orElse("Ahmet");
		System.out.println(name);
		
		// orElseGet
		String city = "Ahmet";
		String city2 = Optional.ofNullable(city).orElseGet(()->"İstanbul");
		System.out.println(city2);
		
		// orElse & orElseGet farkı
		String empty = "A";
		String str1 = Optional.ofNullable(empty).orElse(test()); // empty boş olsa da olmasa da test() fonksiyonunu tetikler 
		String str2 = Optional.ofNullable(empty).orElseGet(()->test()); // empty gerçekten boş ise test() fonksiyonunu çalıştırır. Daha verimlidir.
		System.out.println(str1);
		System.out.println(str2);
		
	}
	
	public static String test() {
		System.out.println("TEST ÇALIŞTI");
		return "test";
	}
	

}

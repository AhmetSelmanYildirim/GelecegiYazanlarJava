
public class Driver {

	public static int passInteger(Integer x) {
		return x.intValue();
	}
	
	public static void main(String[] args) {
		int i = 10;
		passInteger(new Integer(i)); // fonksiyonun istediği reference type dır ama,
		passInteger(i); // Parametre primitive olarak da gönderilebilir. Java arkada autoboxing yaparak Nesne olarak sarmalar.
		// Bütün primitive typeların Wrapper type classları bulunmaktatır.
		
		Double d = 10.0;
		double x = d;
		
		Integer integer = 10;
		

	}

}

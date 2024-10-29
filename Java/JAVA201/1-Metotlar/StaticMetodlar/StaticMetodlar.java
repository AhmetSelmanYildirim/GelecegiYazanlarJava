
public class StaticMetodlar {

	public static void sayHi() {
		System.out.println("Merhaba");
	}
	
	public static void main(String[] args) {
		StaticMetodlar.sayHi();
		
		Math.pow(2,3);
		Math.sqrt(2);
		int parseInt = Integer.parseInt("5");
		
		HesapMakinesi.sum(2,4);
		HesapMakinesi.sub(354,42);
		HesapMakinesi.multiply(4, 5);
		HesapMakinesi.divide(54.5f, 23.3f);
		
		
	}
	
}

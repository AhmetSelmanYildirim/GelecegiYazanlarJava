
public class MetodAdlandirmalari {
	
	// metodun imzası adından ve aldığı parametrelerden oluşmaktadır.
	private void helloWorld() {
		System.out.println("Hello World");
	}
	
	private int sum(int x, int y) {
		int total = x+y;
		return total;
	}
	
	private float sum(float x, int y) {
		float total = x+y;
		return total;
	}
	
	private float sum(float x, float y) {
		float total = x+y;
		return total;
	}
	
	private int sum(byte x, byte y) {
		int total = x+y;
		return total;
	}

	public static void main(String[] args) {
		
		// metod statik olmadığı için bulunduğu sınıftan bir instance oluşturmak gereklidir.
		new MetodAdlandirmalari().helloWorld();
		
		MetodAdlandirmalari metod = new MetodAdlandirmalari();
		int result = metod.sum(48, 52);
		System.out.println("Sonuç: "+result);
		
		
	}

}

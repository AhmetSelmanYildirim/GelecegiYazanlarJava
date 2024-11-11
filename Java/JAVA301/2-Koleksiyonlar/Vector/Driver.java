import java.util.Vector;

public class Driver {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<String>(4);
		// Yaklaşık bir kapasite belirlenebilir. Eğer kapasite aşılırsa 2 katına otomatik çıkarılır.
		
		vector.add("Kedi");
		vector.add("Köpek");
		vector.add("Kuş");
		System.out.println("Size: " + vector.size());
		System.out.println("Capacity: " + vector.capacity());
		vector.add("At");
		vector.add("Eşek");
		System.out.println("Size: " + vector.size());
		System.out.println("Capacity: " + vector.capacity());
		
		for(String s : vector) {
			System.out.println(s);
		}
		System.out.println(vector.contains("Kedi"));
		System.out.println(vector.indexOf("Kuş"));
		
		vector.clear();
		System.out.println("Size: " + vector.size());
		System.out.println("Capacity: " + vector.capacity());
	}
}

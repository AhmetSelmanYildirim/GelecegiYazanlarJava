
public class StringOrnek {

	public static void main(String[] args) {
		String firstName = "John";
		String lastName = "Locke";
		System.out.println(firstName);
		System.out.println(firstName.charAt(1));
		System.out.println(firstName.length());		
		
		// Karşılaştırma
		System.out.println(firstName.equals(lastName));
		System.out.println(firstName.equalsIgnoreCase(lastName));
		System.out.println(firstName.startsWith("J"));
		System.out.println(firstName.endsWith("o"));
		// Arama
		System.out.println(firstName.indexOf("o"));
		System.out.println(firstName.lastIndexOf("o"));
		// String Modifikasyonu
		System.out.println(firstName.substring(0,2));
		System.out.println(firstName.substring(2));
		System.out.println(firstName.trim());
		System.out.println(firstName.concat(lastName));
		System.out.println(firstName.toUpperCase());
		System.out.println(firstName.toLowerCase());
		System.out.println(firstName.replace('n','o'));

	}
}

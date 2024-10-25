import java.util.Scanner;

public class StringLab {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1.equals(str2));
		str2 = "HELLO";
		System.out.println(str1.equalsIgnoreCase(str2));
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir yazı giriniz: ");
		String line = scanner.nextLine();
		System.out.println(line.toLowerCase());
		System.out.println(line.toUpperCase());
		System.out.println(line.charAt(0)); // string boş gelirse hata verir
		System.out.println(line.length());
		System.out.println(line.substring(3));
		System.out.println(line.isEmpty());
		System.out.println(line.replace("ab", "cd"));
		
		System.out.println(line.indexOf('a'));
		System.out.println(line.lastIndexOf('a'));
		System.out.println(line.trim());
		
		System.out.println("İkinci bir değer giriniz");
		String line2 = scanner.nextLine();
		
		System.out.println(line + line2); 
		// + operatoru kullanıldığında varsayılan string nesnesi kullanılmayıp yeni bir string nesnesi oluşturmakta. Bu yüzden String Builder nesnesi üzerinde işlem yapılmalıdır.
		
	}
}

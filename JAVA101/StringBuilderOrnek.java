import java.util.Scanner;

public class StringBuilderOrnek {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// System.out.println(userInput.toLowerCase());
		
		StringBuffer buffer = new StringBuffer();
		System.out.print("Adınız: ");
		buffer.append("Ad: ");
		buffer.append(scanner.nextLine().trim());
		
		
		System.out.print("Soyadınız: ");
		buffer.append(" ".concat("Soyad: "));
		buffer.append(scanner.nextLine().trim());
		
		System.out.println(buffer.toString());
		
		System.out.println(buffer.length());
		System.out.println(buffer.capacity());
		System.out.println(buffer.charAt(1));
		System.out.println(buffer.reverse());
	
	
	}

}

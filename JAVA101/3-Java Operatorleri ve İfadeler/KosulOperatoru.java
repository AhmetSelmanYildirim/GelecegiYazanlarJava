import java.util.Scanner;

public class KosulOperatoru {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Yaşınız: ");
		int age = scanner.nextInt();

		System.out.println(age >= 18 ? "Ehliyet alabilirsiniz." : "Ehliyet alamazsınız."); // ternary if
		
	}

}

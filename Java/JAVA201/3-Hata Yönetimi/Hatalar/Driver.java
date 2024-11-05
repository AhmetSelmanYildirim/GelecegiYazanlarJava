import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		//arithExcep();
		//arrayExcep();
		nullPointerExcep();
		
	}
	
	public static void arithExcep() {
		// number2 = 0 -> ArithmeticException
		// number = a -> InputMismatchException

		Scanner scanner = new Scanner(System.in);
		System.out.print("İki sayı giriniz: ");
		int number = scanner.nextInt();
		int number2 = scanner.nextInt();
		System.out.println(number/number2);
	}

	
	// index=6 -> Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
	public static void arrayExcep() {
		int[] i = {1,2,3,4,5};
		Scanner scanner = new Scanner(System.in);
		int index = scanner.nextInt();
		System.out.println(i[index]);
	}
	
	public static void nullPointerExcep() {
		//NullPointerException
		Scanner scanner = null;
		String line = scanner.nextLine();
		System.out.println(line);
	}
	
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("1. sayıyı giriniz: ");
			int x = scanner.nextInt();
			System.out.print("2. sayıyı giriniz: ");
			int y = scanner.nextInt();
			int result = x/y;
			System.out.println("Sonuç: "+result);
			
		} catch (ArithmeticException e) {
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getMessage());
			// Hatanın hangi satırda olduğunu gösterir.
			e.printStackTrace();
			System.out.println("0'a bölünemez");
		} catch (InputMismatchException e) {
			System.out.println("Lütfen sayı giriniz");
		} finally {
			// Sistemden alınan kaynaklar geriye iade edilmeli.
			scanner.close();
			System.out.println("Finally");
		}
		System.out.println("Uygulama bitti");
		
	}
	
}

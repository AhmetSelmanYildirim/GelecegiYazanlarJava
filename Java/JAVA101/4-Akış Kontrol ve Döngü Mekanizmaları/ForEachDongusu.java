import java.util.Arrays;
import java.util.Scanner;

public class ForEachDongusu {

	public static void main(String[] args) {

		/*
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		
		for(int i : numbers) {
			System.out.println(i);
		}
		*/
		
		int[] numbers = new int[5];
		System.out.print("5 adet sayı giriniz: ");
		Scanner scanner = new Scanner(System.in);
		for(int i =0; i <numbers.length;i++) {
			numbers[i] = scanner.nextInt();
		}
		for(int i : numbers) {
			System.out.print(i);
		}
		

	}

}

import java.util.Scanner;

public class Driver2 {

	public static void main(String[] args) {
	
		int[] numbers = {0,1,2,3,4};
		Scanner sc = new Scanner(System.in);
		System.out.print("İndex değerini giriniz: ");
		int index = sc.nextInt();
		
		// jvm try-catch bloğunu çalıştırırken özel işlemler kullanır bu da programı yavaşlatır.
		// O yüzden if ile kontrol yapabiliyorsak if ile yapmalıyız.
		
		/*
		try {
			System.out.println(numbers[index]);	
		} catch(Exception e) {
			System.out.println("Yanlış index numarası girdiniz.");
		} finally{
			sc.close();
		}
		*/
		
		if(index <0 || index >=numbers.length) {
			System.out.println("Yanlış index numarası girdiniz.");
		}else {
			System.out.println(numbers[index]);	
		}
		
		
	}
}

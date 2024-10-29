import java.util.Scanner;

public class MetodTanimlama {

	/*
	public void sayHi() {
		System.out.println("Merhaba");
	}
	*/
	
	public static void sayHi() {
		System.out.println("Merhaba");
	}
	
	public int sum(int x, int y) {
		int total = x + y;
		return total;
	}
	
	
	public static void main(String[] args) {
		/*
		MetodTanimlama metodTanimlama = new MetodTanimlama();
		metodTanimlama.sayHi();
		*/
		// metod static olduğu için instance oluşturmaya gerek yok.
		//sayHi();
		/*
		MetodTanimlama metodTanimlama = new MetodTanimlama();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("2 sayı giriniz: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int result = metodTanimlama.sum(a, b);
		System.out.println(result);
		*/
		
		HesapMakinesi hesapMakinesi = new HesapMakinesi();
		System.out.println("Toplam: "+hesapMakinesi.sum(2, 5));
		System.out.println("Çıkarma: "+hesapMakinesi.sub(22.5f, 5));
		System.out.println("Çarpma: "+hesapMakinesi.multiply(1.56f, 5.6f));
		System.out.println("Bölme: "+hesapMakinesi.divide(34.8f, 5.5f));
		System.out.println("Kare: "+hesapMakinesi.rectangle(34.8f));
		System.out.println("Karekök: "+hesapMakinesi.square(34.8f));
		
	}
	
}

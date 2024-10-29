import java.util.Arrays;

public class MethodParametreleri {

	public static void main(String[] args) {
		/*
		int x = 15;
		System.out.println("main1: "+x);
		MethodParametreleri mP = new MethodParametreleri();
		// x in yeni kopyası arkada çıkartılıp gönderilir. O yüzden asıl x in değeri değişmez.
		mP.passByValue(x);
		System.out.println("main2: "+x);
		*/
		/*
		int[] arr = {2,4,6,3,8};
		System.out.println(Arrays.toString(arr));
		// array bir reference tip olduğu için değer heap bölgesinde saklanırken
		// bellek adresi stack bölümünde yer alır. parametre olarak geçilirken gönderilen kopyalar yine bellekteki aynı adresi gösterdiği için
		// array içindeki değerler değişir
		mP.swap(arr);
		System.out.println(Arrays.toString(arr));
		*/
		
		MethodParametreleri mp = new MethodParametreleri();
		mp.test(1);
		
		mp.varArgs(10, new int[] {2,5});
		// var args bu şekilde de kullanılabilir.
		mp.varArgs(100, 1,2,3,4,5);
		

	}
	
	public void passByValue(int x) {
		System.out.println("Pass by value1: "+x);
		x=10;
		System.out.println("Pass by value2: "+x);
	}
	
	public void swap(int[] numbers) {
		for(int i=0; i < numbers.length; i++) {
			numbers[i] = numbers[i] *2;
		}
	}

	// final anahtar kelimesi method içinde değerin değiştirilmesini engeller.
	public void test(final int x) {
		//x=10;
		System.out.println("test: "+x);
	}
	
	// 3 noktalı var args kullanılacaksa mutlaka son parametre olmalıdır.
	public void varArgs(int a, int... numbers) {
		int x = numbers[0];
		int y = numbers[1];
		System.out.println((a*x)+(a*y));
	}
	
}

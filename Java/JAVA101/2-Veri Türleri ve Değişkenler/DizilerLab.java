import java.util.Arrays;
import java.util.Scanner;

public class DizilerLab {

	public static void main(String[] args) {
		/*int[] numbers = new int[5];
		numbers[0]=5;
		numbers[1]=10;
		numbers[2]=20;
		numbers[3]=30;
		numbers[4]=40;
		
		System.out.println(numbers.length);
		System.out.println(Arrays.toString(numbers));
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		*/
		
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen dizi boyutunu giriniz: ");
		int length = scanner.nextInt();
		
		int[] numbers = new int[length];
		int sum =0;
		int average =0;
		
		for(int i=0; i < length;i++) {
			System.out.print(i+1+". sayı:");
			numbers[i] = scanner.nextInt();
			sum = sum + numbers[i];
		}
		
		System.out.println(Arrays.toString(numbers));
		
		average = sum / length;
		
		System.out.println("Elemanlar toplamı: " +sum);
		System.out.println("Elemanların ortalaması: "+average);
		*/
		
		/*
		int[] numbers = {2,4,10,5,56};
		int sum =0;
		for(int i=0; i < numbers.length;i++) {
			sum = sum + numbers[i];
		}
		System.out.println(sum);
		
		int[] numbers2 = new int[numbers.length];
		for(int i=0; i<numbers.length;i++) {
			numbers2[i]=numbers[i];
		}
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(numbers2));
		*/
		
		/*
		String[] names = new String[3];
		names[0]= "Ali";
		names[1]= "Ahmet";
		names[2]= "Ayşe";
		
		System.out.println(Arrays.toString(names));
		for(int i = names.length-1; i >= 0;i--) {
			System.out.println(names[i]);
		}
		*/
		/*
		int[] numbers1 = {1,2,3};
		System.out.println(Arrays.toString(numbers1));
		int[] numbers2 = numbers1; // arrayin heapdeki adresini kopyalar. Yalnızca değerleri değil.
		System.out.println(Arrays.toString(numbers2));
		numbers1[0]=4;
		System.out.println(numbers2[0]);
		 */
		
		int[] numbers = {20,45,86,79,24,35};
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.binarySearch(numbers, 45)); // aranan değerin indexini verir.
		int[] cArray = Arrays.copyOf(numbers, 3); // arrayin kopyalanmasını sağlar
		System.out.println(Arrays.toString(cArray));
		int[] rArray =Arrays.copyOfRange(numbers, 3, 6); // başlangıç indexi inclusive bitiş indexi exclusivedir
		System.out.println(Arrays.toString(rArray));
		Arrays.fill(rArray, 55); // verilen değer ile arrayi doldurur
		System.out.println(Arrays.toString(rArray));
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers)); // Arrayi sıralar
		
		
		
	}

}

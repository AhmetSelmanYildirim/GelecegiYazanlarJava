import java.util.Iterator;

public class Driver {

	public static void main(String[] args) {

		int[] numbers = {1,2,4,5,7,};
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		System.out.println("");
		int i =0;
		while(i<numbers.length) {
			System.out.print(numbers[i++]+" ");
		}
		System.out.println();
		int x =0;
		do {
			System.out.print(numbers[x++]+" ");
		}while(x < numbers.length);
		
		System.out.println();
		for (int j : numbers) { // JAVA 5 ile gelmiştir daha önceden iterator sınıfı kullanıyordu.
			System.out.print(j+" ");
		}
		
	}

}

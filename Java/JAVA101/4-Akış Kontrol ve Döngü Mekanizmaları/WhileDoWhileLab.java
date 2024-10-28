import java.util.Arrays;
import java.util.Scanner;

public class WhileDoWhileLab {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		System.out.print("Bir sayı giriniz: ");
		int starCount = scanner.nextInt();
		int i =1;
		while(i <= starCount) {
			int j = 0;
			while(j < i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		*/
		/*
		long total =0;
		while(true) {
			System.out.print("Yeni bir sayı giriniz: ");
			int number = scanner.nextInt();
			total += number;
			if(number == 0)
				break;
		}
		System.out.println("Toplam: " + total);
		*/
		/*
		int x = 0;
		int y = 100;
		while(x<y) {
			if(x%2==0) {
				System.out.println(x);
			}
			x++;
		}
		*/
		
		/*
		int[] numbers = new int[10];
		int i =0;
		System.out.println("10 sayı giriniz. ");
		while(i < numbers.length) {
			System.out.print(i+1+".sayı: ");
			numbers[i] = scanner.nextInt();
			i++;
		}
		
		Arrays.sort(numbers);
		System.out.println("min: "+numbers[0]);
		System.out.println("max: "+numbers[numbers.length-1]);
		*/
		/*
		int x = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		while(x <10) {
			int input = scanner.nextInt();
			if(input < min) min = input;
			if(input > max) max = input;
			x++;
		}
		System.out.println("Min: "+min+" Max: "+max);
		*/
		/*
		float average = 0.0f;
		int count=0;
		while(true) {
			int number = scanner.nextInt();
			if(number == 0) break;
			count++;
			average +=number;
		}
		System.out.println(average/count);
		*/
		/*
		int positiveCount =0;
		int negativeCount =0;
		while(true) {
			int x = scanner.nextInt();
			if(x == 0) break;
			if(x>0) positiveCount++;
			else if(x<0) negativeCount++;
			else break;
		}
		System.out.println("Pozitif sayıların sayısı: "+ positiveCount);
		System.out.println("Negatif sayıların sayısı: "+ negativeCount);
		*/
		
		
	}

}

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class KosulVeDongulerLab {

	public static void main(String[] args) {
		/*
		Sum toplam = new Sum();
		toplam.exec();
		*/
		/*
		Password parola = new Password();
		parola.exec();
		*/
		/*
		Average ort = new Average();
		ort.exec();
		*/
		/*
		ExamCalculation eC = new ExamCalculation();
		eC.exec();
		*/
		/*
		OddEven oe = new OddEven();
		oe.exec();
		*/
		/*
		Reverse rev = new Reverse();
		rev.exec();
		*/
		/*
		Factorial fac = new Factorial();
		fac.exec();
		*/
		/*
		Circle circle = new Circle();
		circle.exec();
		*/
		Rectangle rect = new Rectangle();
		rect.exec();
	}

}

class Sum{
	public void exec() {
		Scanner scanner = new Scanner(System.in);
		int toplam = 0;
		int input = 0;
		do {
			System.out.print("Bir sayı giriniz: ");
			input = scanner.nextInt();
			toplam += input;
		}while(input != 0);
		System.out.println("Girilen sayıların toplamı = " +toplam);
	}
}

class Password{
	public void exec() {
		Scanner scanner = new Scanner(System.in);
		String parola = "";
		do {
			System.out.print("Parola: ");
			parola = scanner.nextLine();
		}while(!parola.equals("1234"));
		System.out.println("Hoşgeldiniz");
			
	}
}

class Average {
	public void exec() {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kaç adet sayı üretilecek: ");
		int count = scanner.nextInt();
		int[] numbers = new int[count];
		for(int i =0; i < count;i++) {
			numbers[i] = random.nextInt(100);
		}
		System.out.println(Arrays.toString(numbers));
		
		float sum = 0.0f;
		for(int i : numbers) {
			sum += i;
		}
		System.out.print("Ortalama :"+sum/count);
	}
}

class ExamCalculation{
	public void exec() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Vize notu: ");
		int midtermScore = scanner.nextInt();
		System.out.print("Final notu: ");
		int finalScore = scanner.nextInt();
		
		float average = (midtermScore * 0.4f) +(finalScore * 0.6f);
		System.out.println("Ortalamanız: "+average);
		if(average >=50 && finalScore >= 50) {
			System.out.println("Tebrikler Geçtiniz.");
		}else {
			System.out.println("Üzgünüm, Kaldınız!");
		}
	}
}

class OddEven {
	public void exec() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kaç adet sayı alınacak: ");
		int count = scanner.nextInt();
		int[] numbers = new int[count];
		for(int i =0; i<count; i++) {
			numbers[i]=scanner.nextInt();
		}
		System.out.println(Arrays.toString(numbers));
		
		for(int i=0; i<numbers.length;i++) {
			if(numbers[i] % 2 == 0) {
				System.out.println(numbers[i] + " Çift sayı");
			} else {
				System.out.println(numbers[i] + " Tek sayı");
			}
			
		}
	}
}

class Reverse {
	public void exec() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir yazı giriniz: ");
		String text = scanner.nextLine();
		for(int i = text.length() -1; i >= 0;i--) {
			System.out.print(text.charAt(i));
		}
	}
}

class Factorial{
	public void exec() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz: ");
		int number = sc.nextInt();
		int factorial =1;
		for(int i =number ; i >=1; i--) {
			factorial *= i;
		}
		System.out.println("Faktoriyel: "+factorial);
	}
}

class Circle{
	public void exec() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Yarıçapı giriniz: ");
		int r = sc.nextInt();
		float area = (float)( Math.PI * Math.pow(r,2));
		float surface = (float)(2 * Math.PI * r);
		System.out.println("Alan: "+area);
		System.out.println("Çevre: "+surface);
	}
}

class Rectangle{
	public void exec() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir kenar uzunluğunu giriniz: ");
		int x = sc.nextInt();
		int area = (int)(Math.pow(x, 2));
		int surface = 4*x;
		
		System.out.println("Alan: "+ area);
		System.out.println("Çevre: "+ surface);
	
	
	}
}




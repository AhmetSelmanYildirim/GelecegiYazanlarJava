import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LocalDateOrnek {

	public static void main(String[] args) {

		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalDate of = LocalDate.of(1996, 05, 01);
		System.out.println(of);
		
		LocalDate dateParse = LocalDate.parse("1996-05-01");
		System.out.println(dateParse);
		
		LocalDate plus = now.plus(1, ChronoUnit.DAYS);
		System.out.println(plus);
		System.out.println(now.plusDays(10));
		System.out.println(now.minusDays(10));
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getDayOfWeek());

		LocalDate date1 = LocalDate.parse("1980-12-01");
		LocalDate date2 = LocalDate.parse("1999-01-01");
		System.out.println(date1.isAfter(date2));
		System.out.println(date1.isBefore(date2));
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Doğum tarihi: ");
		LocalDate dob = LocalDate.parse(scanner.nextLine()) ;
		System.out.println("Yaşınız: " + (now.getYear() - dob.getYear() )+" Yıl "+ (now.getMonthValue()-dob.getMonthValue() + " Ay " ));
		
		
	}

}

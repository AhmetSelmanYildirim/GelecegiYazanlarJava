import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeOrnek {

	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		System.out.println(LocalDateTime.of(1999, 8, 07, 14, 37));
		
		System.out.println(now.plus(5, ChronoUnit.CENTURIES));
		
		LocalDate localDate = LocalDate.parse("1987-08-09");
		LocalTime localTime = LocalTime.parse("07:09");
		LocalDateTime ldt = LocalDateTime.of(localDate, localTime);
		System.out.println(ldt);
		
		System.out.println(ChronoUnit.DAYS.between(ldt, now));
		

	}

}

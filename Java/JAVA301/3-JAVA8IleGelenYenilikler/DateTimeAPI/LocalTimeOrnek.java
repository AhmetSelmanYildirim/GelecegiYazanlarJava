import java.time.LocalTime;

public class LocalTimeOrnek {

	public static void main(String[] args) {

		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		LocalTime localTime = LocalTime.parse("05:05");
		System.out.println(localTime);
		
		System.out.println(LocalTime.of(17, 59));
		System.out.println(localTime.getHour());
		System.out.println(localTime.getMinute());

	}

}

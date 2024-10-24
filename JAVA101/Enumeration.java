import java.time.DayOfWeek;
import java.time.Month;

public class Enumeration {

	public static void main(String[] args) {
		Aylar ay = Aylar.AGUSTOS;
		System.out.println(ay);

		ay = Aylar.ARALIK;
		System.out.println(ay);
		
		Aylar[] values = Aylar.values();
		for(int i=0; i<values.length;i++) {
			System.out.println(values[i]);
		}
		Aylar valueOf = Aylar.valueOf("OCAK");
		System.out.println(valueOf);
		
		// HAZIR ENUMLAR DA VARDIR
		System.out.println(DayOfWeek.SUNDAY);
		System.out.println(DayOfWeek.of(3));
		System.out.println(Month.APRIL);
	}

}

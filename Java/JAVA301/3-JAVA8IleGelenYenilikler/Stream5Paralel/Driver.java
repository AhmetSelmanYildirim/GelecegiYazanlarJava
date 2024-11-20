import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {

		Arrays.asList("İstanbul","İzmir","Ankara","Konya")
			.parallelStream()
			.filter((p) -> {
				System.out.println("Test: "+ Thread.currentThread().getName());
				return true;
			})
			.map((f)->{
				System.out.println("Apply: "+ Thread.currentThread().getName());
				return f.toUpperCase();
			})
			.forEach(c->{
				System.out.println("Accept: "+ Thread.currentThread().getName());
				System.out.println(c);
			});
		

	}

}

import java.util.Arrays;
import java.util.function.DoubleSupplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {

		IntStream.range(1, 6)
			.forEach(System.out::println);

		Arrays.stream(new int[] {2,3,6,37,1,9})
			.map(x -> x*2)
			.average()
			.ifPresent(System.out::println);

		int sum =IntStream.range(1,111)
			.sum();
		System.out.println(sum);
		
		// object to primitive
		Stream.of("1","2","3","4","5")
			.mapToInt(Integer::parseInt)
			.max()
			.ifPresent(System.out::println);
		
		// primitive to object
		IntStream.range(1,10)
			.mapToObj(a -> a+"a")
			.forEach(System.out::println);
		
		Stream.of(1.1,2.2,3.3,4.4,5.5)
			.mapToInt(Double::intValue)
			.max()
			.ifPresent(System.out::println);
		
		// Bu durumda filter metodu çalışmaz çünkü intermediate stream methoddan sonra terminate stream method çalışmalıdır (laziness)
		Stream.of("Ali","Ahmet","Cem","Burak")
			.filter(p -> {
				System.out.println("Çalıştı");
				return true;
			});
		
	}

}

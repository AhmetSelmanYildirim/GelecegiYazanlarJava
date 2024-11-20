import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStreamDriver {

	public static void main(String[] args) {

		int[] numbers = {1,5,72,6,7,2,4};
		Arrays.stream(numbers)
			.filter(x -> x <6)
			.map(x -> (int) Math.pow(x, 3))
			.sorted()
			.forEach(System.out::println);

		Stream.of("c","g","r","u","b")
			.findFirst()
			.ifPresent(System.out::println);
	}

}

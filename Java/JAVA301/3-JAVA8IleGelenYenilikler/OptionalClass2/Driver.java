import java.util.Optional;

public class Driver {

	public static void main(String[] args) {

		//Engine engine = null;
		Engine engine = new Engine(1600);
		Car car = new Car("X Brand","Y Model", Optional.ofNullable(engine));
		
		System.out.println(car);

	}

}

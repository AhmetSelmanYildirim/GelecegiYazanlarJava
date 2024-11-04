
public class Driver {

	public static void main(String[] args) {
		Car car  = new Car("x","y","2020");
		System.out.println(car.toString());		
		car.setBrand("z");
		System.out.println(car.toString());
	}
	
}

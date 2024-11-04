
public class Driver {

	public static void main(String[] args) {
		Car car = new Car();
		car.setBrand("X MARKA");
		car.setModel("Y MODEL");
		
		Car.Engine engine = car.new Engine();
		engine.setVolume(2000);
		car.setEngine(engine);
		
		System.out.println(car.getBrand());
		System.out.println(car.getModel());
		System.out.println(car.getEngine().getVolume());
		
	}
	
	
}

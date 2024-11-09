import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Driver {

	public static void main(String[] args) {

		Car car = new Car();
		car.setBrand("X Brand");
		car.setModel("Y Model");
		car.setPlate("34QWE42");
		car.setYear(2020);
		
		Engine engine = new Engine();
		engine.setVolume(4000);
		car.setEngine(engine);
		
		File file = new File("car.bin");
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		
		try {
			fileOutputStream = new FileOutputStream(file);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(car);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(objectOutputStream != null) {
					objectOutputStream.close();
				}
				if(fileOutputStream != null) {
					fileOutputStream.close();
				}
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}

		
	}

}

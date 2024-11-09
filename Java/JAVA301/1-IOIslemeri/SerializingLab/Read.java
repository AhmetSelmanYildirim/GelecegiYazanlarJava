import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Read {
	
	public static void main(String[] args) {
		File file = new File("car.bin");
		FileInputStream fileInputStream = null;
		ObjectInputStream inputStream = null;
		
		try {
			fileInputStream = new FileInputStream(file);
			inputStream = new ObjectInputStream(fileInputStream);
			
			Car car = (Car) inputStream.readObject();
			System.out.println(car);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(inputStream != null) {
					inputStream.close();
				}
				if(fileInputStream != null) {
					fileInputStream.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	

}

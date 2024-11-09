import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Driver {

	public static void main(String[] args) {
		
		//write();
		read();

	}
	
	public static void write() {
		Student student = new Student();
		student.setGrade("4A");
		student.setName("Ahmet");
		student.setSurname("YILDIRIM");
		student.setNumber(223);
		System.out.println(student);
		
		File file = new File("student.bin");
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(file);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(student); // nesne diske yazıldı.
			
		} catch (Exception e) {
			e.printStackTrace();
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
	
	public static void read() {
		File file = new File("student.bin");
		if(file.exists()) {
			FileInputStream fileInputStream = null;
			ObjectInputStream objectInputStream = null;
			try {
				
				fileInputStream = new FileInputStream(file);
				objectInputStream = new ObjectInputStream(fileInputStream);
				
				Student student = (Student) objectInputStream.readObject();
				System.out.println(student.toString());
				
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				try {
					if(objectInputStream != null) {
						objectInputStream.close();
					}
					if(fileInputStream != null) {
						fileInputStream.close();
					}
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		}
		
	}

}

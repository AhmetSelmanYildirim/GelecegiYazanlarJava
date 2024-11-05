import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		//write();
		read();
	}
	
	public static void read() {
		File file = new File("Read.me");
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
			int c = 0;
			while((c=fileReader.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		} finally {
			if(fileReader != null)
			try {
				fileReader.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}

	public static void write() {
		File file = new File("Read.me");
		FileWriter fileWriter = null;
		Scanner sc = new Scanner(System.in);
		// File Writer checked Exception fırlatır o yüzden try-catch içinde yazılmalıdır.
		try {
			fileWriter = new FileWriter(file);
			System.out.print("Buraya bir yazı giriniz: " );
			fileWriter.write(sc.nextLine());
		} catch (IOException e) {
			System.out.println(e.getLocalizedMessage());
		}finally {
			sc.close();
			try {
				fileWriter.close();
			} catch (IOException e) {
				System.out.println(e.getLocalizedMessage());
				e.printStackTrace();
			}
		}
	}
	
}

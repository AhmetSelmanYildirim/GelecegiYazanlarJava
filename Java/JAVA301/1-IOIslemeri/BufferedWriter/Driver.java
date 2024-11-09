import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		File file = new File("input.txt");
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter =null;
		try {
			fileWriter = new FileWriter(file);
			bufferedWriter = new BufferedWriter(fileWriter);
			Scanner scanner = new Scanner(System.in);
			String line = null;
			while(!(line = scanner.nextLine()).equals("quit")) {
				bufferedWriter.write(line);
				bufferedWriter.flush(); // manuel olarak o an bufferda bulunan değerler yazdırılır
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(bufferedWriter != null) {
				try {
					bufferedWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}

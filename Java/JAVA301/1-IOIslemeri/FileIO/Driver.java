import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dosya yolu: ");
		String filePath = scanner.nextLine();
		File file = new File(filePath);
		if(!file.exists()) {
			try {
				boolean isCreated =file.createNewFile();
				if(isCreated) {
					System.out.println("Dosya oluşturuldu.");
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(file);
			String line = null;
			do {
				line = scanner.nextLine();
				if(!line.equals("quit")) {
					fileWriter.write(line);
					fileWriter.write(System.lineSeparator());
				}
			}while(!line.equals("quit"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if(fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}
		}
		
		scanner.close();
		System.out.println("Dosya yazdırma başarılı");
		System.out.println("Dosya boyutu: " + file.length() + " bytes");
		
		

	}

}

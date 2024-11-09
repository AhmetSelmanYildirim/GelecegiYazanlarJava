import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		/*
		File file = new File("C:\\Users\\ahmet\\OneDrive\\Desktop\\sample.txt");
		System.out.println(file.exists());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.isDirectory());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getParent());
		System.out.println(file.length());
		System.out.println(new Date(file.lastModified()));
		
		File file2 = new File("C:\\Users\\ahmet\\OneDrive\\Desktop\\ornek.txt");
		if(!file2.exists()) {
			try {
				file2.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		if(file2.exists()) {
			boolean isDeleted = file2.delete();
			System.out.println(isDeleted);
		}
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dosya yolu: ");
		String pathForFile = scanner.nextLine();
		
		File file = new File(pathForFile);
		String[] content = file.list(); // dizinde bulunan dosya ve klasörlerin listesini verir.
		for (int i = 0 ; i < content.length; i++) {
			System.out.println(content[i]);
		}
		scanner.close();
		
	}

}

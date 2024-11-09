import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		/*
		File file = new File("output.dat");
		FileOutputStream fos = null;
		Scanner sc = new Scanner(System.in);
		try {
			fos = new FileOutputStream(file);
			String line = null;
			while( !(line = sc.nextLine()).equals("quit") ) {
				fos.write(line.getBytes());
				fos.write(System.lineSeparator().getBytes());
			}
			
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if(fos !=null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			sc.close();
		}*/

		read();
		
	}
	
	public static void read() {
		File file = new File("output.dat");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			int c = 0;
			while((c = fis.read())!=-1) {
				System.out.println(c);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
	}

}

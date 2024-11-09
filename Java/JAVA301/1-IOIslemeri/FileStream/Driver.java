import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Driver {
	
	public static void main(String[] args) {
		File file = new File("Hello.txt");
		/*
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			fos.write("Merhaba".getBytes());
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			if(fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		*/
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			int c = 0;
			while( (c = fis.read()) != -1) {
				System.out.print(c +"->" +(char)c+" ");
				//System.out.print((char)c);
				
			}
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
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

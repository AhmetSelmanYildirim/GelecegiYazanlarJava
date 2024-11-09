import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Driver {

	public static void main(String[] args) {

		// write();
		read();

	}
	
	public static void write() {
		File file = new File("test.txt");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file); // Dosyaya stream açıldı.
			OutputStreamWriter osw = new OutputStreamWriter(fos); // Yazma işlemi yapılacağı belirtildi.
			osw.write("Merhaba Dünya");
			osw.close();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			if(fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}
		}
	}

	public static void read() {
	
		File file = new File("test.txt");
		FileInputStream fis = null;
		InputStreamReader isr = null; 
		BufferedReader br = null; // Performanslı okuma yapabilmek için buffered reader kullanılır.
		try {
			fis = new FileInputStream(file); // Input stream i açıldı.
			isr = new InputStreamReader(fis); // Stream reader nesnesi oluşturuldu.
			br = new BufferedReader(isr);
			
			String line = null;
			
			while( (line = br.readLine()) != null) { // içeride bir kere readLine() çalıştığında ilk satırı okumuş oluyor
				System.out.println(line);			 // o yüzden line değişkeni yazdırılır.
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}
			if(isr != null) {
				try {
					isr.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}
		}
		
	}
	
}

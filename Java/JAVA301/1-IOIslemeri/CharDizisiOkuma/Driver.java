import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\ahmet\\OneDrive\\Desktop\\sample.txt");
		if(file.exists()) {
			FileReader fileReader = null; // karakter tabanlı okuma yapmak isteniyorsa kullanılır. 
			try {
				fileReader = new FileReader(file);
				int c =0;
				long now = System.currentTimeMillis();
				/*
				while((c=fileReader.read()) != -1)
				{
					System.out.print((char) c);
				}
				System.out.println(System.currentTimeMillis()-now+"ms"); // 10ms
				*/
				// daha performanslı olması için önce byte arrayine atacağız sonra ekrana yazdırmayı gerçekleştireceğiz.
				// performanslı anca file.length i kadar bellekte yer ayırmış oluyoruz.
				/*
				char[] buffer = new char[(int) file.length()];
				fileReader.read(buffer);
				System.out.println(new String(buffer));
				System.out.println(System.currentTimeMillis()-now+"ms");  // 1ms
				*/
				// bellek için byte arrayini kısıtlayıp String builder sınıfı içinde tutabiliriz.
				char[] buffer = new char[1024];
				int length=0;
				StringBuilder builder = new StringBuilder();
				while((length = fileReader.read(buffer)) !=-1) {
					builder.append(Arrays.copyOfRange(buffer, 0, length)); // son kalan 1024 altı karakter limitinde okuma
				}
				System.out.println(new String(buffer));
				System.out.println(System.currentTimeMillis()-now+"ms");  // 1ms
				
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} finally {
				if(fileReader != null) {
					try {
						fileReader.close();
					} catch (IOException e) {
						System.out.println(e.getMessage());
						e.printStackTrace();
					}
				}
			}
			
		} else {
			System.out.println("Dosya bulunamadı.");
		}

	}

}

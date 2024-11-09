import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Driver {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\ahmet\\OneDrive\\Desktop\\sample.txt");
		File outputFile = new File("C:\\Users\\ahmet\\OneDrive\\Desktop\\sample_output.txt");
		
		if(file.exists()) {
			FileInputStream fis = null; // finallyde kullanmak için nesne tanımlamasını null olarak yapıyorum.
			FileOutputStream fos = null;
			
			try {
				fis = new FileInputStream(file); // nesne oluşturmak fis ctor da exception fırlattığı için try-cath içine yazıyorum
				fos = new FileOutputStream(outputFile);
				int c = 0;
				while((c=fis.read()) != -1) {
					char ch =(char) c; // int olarak değer döndüğü için char a cast ediyorum
					fos.write(Character.toUpperCase(ch)); // harfleri büyütüp yeni dosyaya yazıyorum.
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			} finally { // İşi bitince kaynakları belleğe teslim ediyorum.
				if(fis != null) {
					try {
						fis.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(fos != null) {
					try {
						fos.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		
		

	}

}

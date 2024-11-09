import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class Driver {
	public static void main(String[] args) {
	
		try {
			URL url = new URL("https://example-files.online-convert.com/document/txt/example.txt");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection(); // bağlantı açılıyor
			InputStream inputStream = connection.getInputStream(); // stream açılıyor.
			InputStreamReader isr = new InputStreamReader(inputStream); // stream okunuyor.
			char[] buffer = new char[1024]; // 1024 bytelar halinde array oluşuyor
			FileOutputStream fos = new FileOutputStream("output.txt");
			// StringBuilder builder = new StringBuilder();
			int length = 0;
			while((length = isr.read(buffer)) != -1) {
				//builder.append(Arrays.copyOfRange(buffer, 0, length));
				fos.write(new String(Arrays.copyOfRange(buffer, 0, length)).getBytes()); // write metodu byte veya int aldığı için byte haliyle dosyaya yazdırılıyor.
			}
			isr.close();
			inputStream.close();
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}

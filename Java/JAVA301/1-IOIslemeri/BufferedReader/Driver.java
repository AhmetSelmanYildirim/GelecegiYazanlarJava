import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Driver {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\ahmet\\OneDrive\\Desktop\\sample.txt");
		BufferedReader bufferedReader = null;
		// Buffered reader çalışması, için bir input stream gerekli
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader); // file reader input stream olarak görev görür
			String line = null;
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			// dosyadaki linelar önce buffer a alınıp sonra yazdırılmış oldu.
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(bufferedReader !=null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fileReader !=null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
	
}

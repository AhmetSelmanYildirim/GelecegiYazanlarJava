import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		
		ArrayList<String> arrayList = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		String line = null;
		while(!(line = scanner.nextLine()).equals("quit")) {
			arrayList.add(line);
		}
		scanner.close();
		
		System.out.println(arrayList.toString());
		
		for (String str : arrayList) {
			System.out.print(str+" ");
		}
		

	}

}

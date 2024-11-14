import java.util.Arrays;
import java.util.Iterator;

public class IteratorLab {

	public static void main(String[] args) {

		Student student = new Student("Ahmet", null);
		int[] scores = new int[5];
		scores[0] =100;
		scores[1] =95;
		scores[2] =90;
		scores[3] =80;
		scores[4] =70;
		student.setScores(scores);
		
		Iterator<Integer> it = student.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}

}

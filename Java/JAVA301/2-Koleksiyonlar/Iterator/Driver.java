import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Driver {
		public static void main(String[] args) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			Random random = new Random();
			for(int i=0; i<100;i++) {
				list.add(random.nextInt(100));
			}
			System.out.println(list.size());
		
			for(int i =0; i<list.size() ; i++) {
				System.out.print(list.get(i)+" ");
			}
			System.out.println();
			
			Iterator<Integer> it = list.iterator();
			while(it.hasNext()) {
				int next = it.next();
				System.out.print(next+" ");
				if(next > 50 ) {
					it.remove();
				}
			}
			System.out.println("\n"+list.size());
			
		}

}

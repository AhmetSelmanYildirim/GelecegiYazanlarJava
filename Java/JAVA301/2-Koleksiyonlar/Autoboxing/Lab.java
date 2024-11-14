import java.util.ArrayList;
import java.util.Iterator;

public class Lab {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		
		int x = 20;
		list.add(x); // -> autoboxing arkada yapılır Integer x = 20 
		
		int y = list.get(1); // -> auto unboxing list in 1. elemanı olan reference Integer type, primitive int e çevrilerek y ye atanmıştır.
		
		list.add(new Integer(5));
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			int i = it.next();
			System.out.println(i);
		}
		
		//utility methods
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		byte b=10;
		Byte ba = b;
		
		
	}

}

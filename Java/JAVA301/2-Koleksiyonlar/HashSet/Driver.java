import java.util.HashSet;
import java.util.Iterator;

public class Driver {

	public static void main(String[] args) {
		/*
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add("İstanbul");
		hashSet.add("Ankara");
		hashSet.add("İzmir");
		hashSet.add("Konya");
		hashSet.add("İstanbul"); // Uniquelik vardır.
		
		System.out.println(hashSet.size()); // 4
		
		Iterator<String> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		*/
		
		HashSet<Worker> workerSet = new HashSet<Worker>();
		workerSet.add(new Worker("1","ahmet"));
		workerSet.add(new Worker("2","selman"));
		workerSet.add(new Worker("3","Yıldırım"));
		
		// hashset eşitliği hascode ile ölçer o yüzdden ilk durumda bu duplication da set e eklenir.
		workerSet.add(new Worker("3","Yıldırım2")); 
		// hashcode ve equals a bakıldıktan sonra tekrarlanmış nesne hashset e alınmadı.
		
		//System.out.println(workerSet);
		Iterator<Worker> iterator = workerSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		for (Worker worker : workerSet) {
			System.out.println(worker.hashCode());
		}
		
		
		
		

	}

}

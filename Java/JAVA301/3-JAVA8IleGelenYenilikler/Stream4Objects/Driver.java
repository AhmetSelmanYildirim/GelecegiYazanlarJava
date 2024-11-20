import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student(1,"Ahmet",18));
		students.add(new Student(2,"Ayşe",10));
		students.add(new Student(3,"Mehmet",14));
		students.add(new Student(4,"Kerem",10));
		
		/* filtreleme ve yeni liste oluşturma
		List<Student> collect =students.stream()
			.filter(o -> o.getAge() > 12)
			.collect(Collectors.toList());		// stream den dönen değerleri list, set veya map olarak döndürür
			
		collect.forEach(System.out::println);
		*/
		
		/* yaş a göre gruplama
		Map<Integer, List<Student>> group = students
				.stream()
				.collect(Collectors.groupingBy(o->o.getAge()));
			
		Set<Integer> keySet = group.keySet();
		
		Iterator<Integer> it = keySet.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println(key+" "+group.get(key));
		}
		*/
			
		/* ortalama hesaplama
		double ageAverage = students.stream()
			.collect(Collectors.averagingInt(p->p.getAge()));
		
		System.out.println(ageAverage);
		*/
		
		IntSummaryStatistics intSummaryStatistics =  students.stream()
			.collect(Collectors.summarizingInt(o->o.getAge()));
		System.out.println(intSummaryStatistics);
		
	}

}

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Driver {
	
	public static void filterByGender(List<Person> people, Person.Gender gender) {
		for(Person p : people) {
			if(p.getGender().equals(gender)) {
				System.out.println(p);
			}
		}
	}
	public static void listByAge(List<Person> people, int age) {
		for(Person p : people) {
			if(p.getAge() >= age ) {
				System.out.println(p);
			}
		}
	}
	public static void listByAgeRange(List<Person> people, int min, int max) {
		for(Person p : people) {
			if(p.getAge() >= min && p.getAge() <= max ) {
				System.out.println(p);
			}
		}
	}
	public static void filterPeople(List<Person> people, PersonFilter personFilter) {
		for(Person p : people) {
			if(personFilter.filter(p)) {
				System.out.println(p);
			}
		}
	}
	

	public static void main(String[] args) {

		Person person1 = new Person("Ahmet",LocalDate.parse("1990-02-05"),"asy1@asy.com",Person.Gender.ERKEK);
		Person person2 = new Person("Ayşe",LocalDate.parse("2000-02-05"),"asy2@asy.com",Person.Gender.KADIN);
		Person person3 = new Person("YILDIRIM",LocalDate.parse("2020-02-05"),"asy3@asy.com",Person.Gender.ERKEK);

		ArrayList<Person> people = new ArrayList<Person>();
		people.add(person1);
		people.add(person2);
		people.add(person3);
		
		/*
		// classic functions
		filterByGender(people, Person.Gender.ERKEK);
		System.out.println();
		listByAge(people,18);
		System.out.println();
		listByAgeRange(people,1,10);
		System.out.println();
		*/
		/* 
		// anonim class
		filterPeople(people, new PersonFilter() {
			@Override
			public boolean filter(Person person) {
				return person.getAge() >15 && person.getGender().equals(Person.Gender.ERKEK);
			}
		});
		*/ 
		// lambda expression
		filterPeople(people, (p)->p.getAge()>15 && !p.getEmail().isEmpty());
		
		
	}

}

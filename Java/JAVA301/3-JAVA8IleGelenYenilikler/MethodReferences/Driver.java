import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {

		/*
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(10);
		arrayList.add(2);
		arrayList.add(3);
		
		arrayList.forEach((i)->System.out.println(i));
		// method reference ile kullanım - statik metod.
		arrayList.forEach(System.out::println);
		*/
		
		ArrayList<Bisiklet> bicycles = new ArrayList<Bisiklet>();
		bicycles.add(new Bisiklet("x",9));
		bicycles.add(new Bisiklet("y",18));
		bicycles.add(new Bisiklet("z",1));
		
		// anonymous inner class
		/*
		Collections.sort(bicycles, new Comparator<Bisiklet>() {
			@Override
			public int compare(Bisiklet o1, Bisiklet o2) {
				return o1.getGearCount() - o2.getGearCount();
			}
		});
		*/
		
		/*
		BisikletKarsilastirici bisikletKarsilastirici = new BisikletKarsilastirici();
		
		//Collections.sort(bicycles, new BisikletKarsilastirici());
		// instance method reference
		Collections.sort(bicycles, bisikletKarsilastirici::compare);
		
		bicycles.forEach(System.out::println);
		*/
		
		List<String> brands = new ArrayList<String>();
		brands.add("x marka" );
		brands.add("y marka" );
		brands.add("z marka" );
		brands.add("w marka" );
		
		/*
		// anonim class
		// brands de döndü ve
		brands.stream().map(new Function<String, Bisiklet>() {
			@Override
			public Bisiklet apply(String t) {
				return new Bisiklet(t);
			}
			// yapıcıya göre yeni instancelar oluşturdu.
		}).collect(Collectors.toList());
		*/
		
		// constructor reference
		List<Bisiklet> bisikletler = brands.stream().map(Bisiklet::new).collect(Collectors.toList());
		
		bisikletler.forEach(System.out::println);
		
		

	}

}

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Driver {
	
	public static void main(String[] args) {
		/*
		Supplier<Product> s1 = new Supplier<Product>() {
			@Override
			public Product get() {
				Product p = new Product(1, "Telefon", 15100);
				return p;
			}
		};
		System.out.println(s1.get());
		*/
		
		Supplier<Product> s2 = ()-> new Product(2,"PC",85202);
		System.out.println(s2.get());
		
		Supplier<List<Product>> s3 = ()-> {
			ArrayList<Product> productList = new ArrayList<Product>();
			productList.add(new Product(4,"lamba",200));
			productList.add(new Product(5,"door",400));
			return productList;
		};

		// Consumer functional interface de kullanıldı.
		s3.get().forEach((i)-> System.out.println(i));
		
	}

}

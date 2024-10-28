import static java.lang.Math.PI; // Bu şekilde import yapıldığında Math.PI ile çağrıma gerek kalmaz satır25


public class StaticDegiskenler {

	int v=15; // static olmadığı için static olan main metodu içinden çağrılamaz.
	static int i=10;
	
	// static block sınıfın instance ı alınmadan otomatik olarak çağrılır
	static { 
		System.out.println("Static block");
		i = 17;
	}
	
	public static void main(String[] args) {
		System.out.println(i);
		i=16;
		System.out.println(i);
		
		StaticDegiskenler staticDegisken = new StaticDegiskenler();
		staticDegisken.v = 20;
		System.out.println(staticDegisken.v); // Ancak sınıftan yeni bir nesne oluşturularak static olmayan bir değişkene erişilebilir.
		
		System.out.println(Math.PI); // Math sınıfı çoğunlukla static değişkenlerden oluştuğu için nesne almaya gerek yoktur.
		System.out.println(PI);
		
	}

}

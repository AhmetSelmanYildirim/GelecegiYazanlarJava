
public class SiniflarVeNesneler {

	public static void main(String[] args) {

		Circle circle;
		circle = new Circle(); // Bellek üzerinde bir daire nesnesi tanımlandı ve sınıf için yer ayrıldı.
								// Bu yer daire sınıfı içindeki değişkenler kadardır.
		circle.x=10.0;
		circle.y=20.0;
		circle.r=3.5;
		
		System.out.println(circle.x);
		System.out.println(circle.y);
		System.out.println(circle.r);
		
		double area = circle.calculateArea();
		double circumference = circle.calculateCircumference();
		
		System.out.println("Alan: "+area);
		System.out.println("Çevre: "+circumference);
		
		Circle circle2 = new Circle();
		
		circle2.r=30;
		System.out.println(circle2.calculateArea());
		System.out.println(circle2.calculateCircumference());
		
		// circle3 nesnesi circle2 nesnesinin adresini point ediyor.
		Circle circle3 = circle2;
		System.out.println(circle3.calculateArea());
		System.out.println(circle3.calculateCircumference());
		
	}
	
}

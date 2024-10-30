import com.example.Car;


public class ErisimKontrolu {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.name="Ahmet";
		student.surname="YILDIRIM";
		student.number=1;
		//student.age=12;
		student.setAge(19);
		student.printInfo();
		
		
		/*
		Car car = new Car();
		// package-private olduğu için Sınıf import edilse bile brand fieldına erişilemez.
		car.brand = "BMW";
		*/
		
		
	}

}

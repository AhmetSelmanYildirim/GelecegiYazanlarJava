
public class Driver {

	public static void main(String[] args) {

		
		// Bir anonim class oluşturularak interface implement ediliyor.
		/*
		CreateNumber createNumber = new CreateNumber() {
			
			@Override
			public double create() {
				return 45.5;
			}
		};
		
		System.out.println(createNumber.create());
 		*/
		
		// lambda kullanılarak anonim sınıf oluşturmaya gerek kalmıyor.
		CreateNumber number = () -> 45.7; 
		System.out.println(number.create());
		
 
	}

}

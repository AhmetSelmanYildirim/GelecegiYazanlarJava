
public class Bicycle {

	int gear;
	int speed;
	
	static int bicycleCount = 0;
	
	void printInfo() {
		System.out.println("Hız: "+speed);
		System.out.println("Vites: "+gear);
		System.out.println("Bisiklet sayısı: "+Bicycle.bicycleCount);
	}
	
}

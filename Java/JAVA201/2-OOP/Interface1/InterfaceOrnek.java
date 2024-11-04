
public class InterfaceOrnek {
	
	public static void main(String[] args) {
		Driveable driveable = new Driver();
		driveable.drive();
		
		Driveable driveable2 = new Pilot();
		driveable2.drive();
	}

}

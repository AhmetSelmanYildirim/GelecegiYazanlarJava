
public class SinifUyeDegiskenler {

	public static void main(String[] args) {

		/*
		Bicycle bicycle = new Bicycle();
		bicycle.speed=10;
		bicycle.gear=18;
		Bicycle.bicycleCount =1;
		
		//System.out.println("Hız: "+bicycle.speed);
		//System.out.println("Vites: "+bicycle.gear);
		bicycle.printInfo();
	
		Bicycle bicycle2 = new Bicycle();
		bicycle2.speed=20;
		bicycle2.gear=21;
		Bicycle.bicycleCount =2;
		bicycle2.printInfo();
		*/
		
		// Constructor her çalıştığında static olan playerCount 1 arttı
		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();
		
		player3.printPlayerCount();
		
		/*
		System.out.println("Sağlık: "+player1.healt);
		for(int i=0; i<30; i++) {
			player1.damage();
			System.out.println("Darbe alındı: "+player1.healt);
		}
		
		player1.life();
		System.out.println("Sağlık: "+player1.healt);
		*/
		
	}

}

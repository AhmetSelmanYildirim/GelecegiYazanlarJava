
public class AbstractSiniflar {
	
	public static void main(String[] args) {
		
		/*
		Player player = new Player();
		player.setName("ali");
		player.setNumber(10);
		player.pass();
		player.shoot();
		*/
		Player player = new Footballer();
		player.setName("ahmet");
		player.setNumber(20);
		player.pass();
		player.shoot();
		
		Player player2 = new Handballer();
		player2.setName("ahmet");
		player2.setNumber(20);
		player2.pass();
		player2.shoot();
		
		
		
	}

}


public class Player {

	public Player() {
		playerCount++;
	}
	
	static int playerCount=0;
	
	int healt=100;
	
	void life() {
		healt = 100;
	}
	void damage() {
		healt--;
	}
	
	void printPlayerCount() {
		System.out.println("Oyuncu Sayısı: "+playerCount);
	}
	
}

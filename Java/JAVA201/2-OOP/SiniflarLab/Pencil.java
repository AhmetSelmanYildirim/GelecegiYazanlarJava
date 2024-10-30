public class Pencil {
	
	String brand;
	String type;
	Boolean fillable;
	Boolean hasErase;
	
	void write(String text){
		System.out.println(text);
	}
	
	void refill() {
		if(fillable) {
			System.out.println("Kalem dolduruldu.");
		}else {
			System.out.println("Bu kalem doldurulamaz.");
		}
	}
	
	void erase() {
		if(hasErase) {
			System.out.println("Yazı silindi");
		}else {
			System.out.println("Bu kalem silemez");
		}
	}
	
	
}

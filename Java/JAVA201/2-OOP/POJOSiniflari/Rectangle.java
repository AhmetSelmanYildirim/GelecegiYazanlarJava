
public class Rectangle {

	private int x;
	private int y;
	private int height;
	
	public int getX() {
		return x;
	}
	public void setX(int _x) {
		if(_x >= 0) {
			x=_x;
		}else {
			System.out.println("x negatif olamaz.");
		}
	}
	
	public void setY(int _y) {
		if(_y >= 0) {
			y=_y;
		}else {
			System.out.println("y negatif olamaz.");
		}
	}
	public int getY() {
		return y;
	}
	
	public void setHeight(int h) {
		if(h >= 0) {
			height = h;
		}else {
			System.out.println("y negatif olamaz.");
		}
	}
	public int getHeight() {
		return height;
	}
	
	public void print() {
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		System.out.println("Uzunluk: "+height);
	}
	
	
	
	
	
	
	
	
}

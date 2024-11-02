
public class Rectangle extends Shape {
	
	private int weight;
	private int height;
	
	public Rectangle(int w, int h) {
		weight = w;
		height = h;
	}
	
	public void setWeight(int w) {
		weight = w;
	}
	public void setHeight(int h) {
		height = h;
	}
	public int getWeight() {
		return weight;
	}
	public int getHeight() {
		return height;
	}
	
	public void area() {
		System.out.println("Dikdörtgen alanı: "+ weight * height);
	}

}


public class Circle extends Shape {

	private int radius;
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int r) {
		radius = r;
	}
	
	public void calculateArea() {
		System.out.println("Alan: "+(Math.PI * Math.pow(radius, 2)));
	}
	
}


public class Rectangle extends Shape {

	private int length;
	private int height;
	
	public int getLength() {
		return length;
	}
	public int getHeight() {
		return length;
	}
	public void setLength(int l) {
		length = l;
	}
	public void setHeight(int h) {
		height = h;
	}
	
	public void calculateArea() {
		System.out.println("Alan: "+(length * height));
	}
	
	
}
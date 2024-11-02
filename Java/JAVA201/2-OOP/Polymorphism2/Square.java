
public class Square extends Shape {

	private int edgeLength;
	
	public Square(int l) {
		edgeLength =l;
	}
	
	public void setEdgeLength(int el) {
		edgeLength = el;
	}
	public int getEdgeLength() {
		return edgeLength;
	}
	
	public void area() {
		System.out.println("Kare alanı: "+(Math.pow(edgeLength,2)));
	}
	
}

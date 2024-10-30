
public class Square extends Shape {

	private int edgeLength;
	
	public int getEdgeLength() {
		return edgeLength;
	}
	public void setEdgeLength(int l) {
		edgeLength = l;
	}
	
	public void calculateArea() {
		System.out.println("Alan: "+(edgeLength * 4));
	}
	
}

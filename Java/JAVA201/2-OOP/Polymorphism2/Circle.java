
public class Circle extends Shape {
	
	private int r;
	
	public Circle(int _r) {
		r=_r;
	}
	
	public int getR() {
		return r;
	}
	public void setR(int _r) {
		r=_r;
	}
	
	public void area() {
		System.out.println("Daire alanı: "+ (Math.PI * Math.pow(r, 2)) );
	}
	

}


public class Shape {

	private Color color;
	private int posX;
	private int posY;
	
	public void setColor(Color _color) {
		color=_color;
	}
	public void setPosX(int x) {
		posX=x;
	}
	public void setPosY(int y) {
		posY=y;
	}
	
	public Color getColor() {
		return color;
	}
	public int getPosX() {
		return posX;
	}
	public int getPosY() {
		return posY;
	}
	
	public void calculateArea() {
		System.out.println("Alan hesaplanamadı.");
	}
	
	
}

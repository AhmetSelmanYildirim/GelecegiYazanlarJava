
public class Kalitim {
	public static void main(String[] args) {
		 Shape shape = new Shape();
		shape.setPosX(10);
		shape.setPosY(10);
		shape.setColor(Color.KIRMIZI);
		shape.calculateArea();
		
		Square square = new Square();
		square.setPosX(50);
		square.setPosY(50);
		square.setColor(Color.KIRMIZI);
		square.setEdgeLength(10);
		square.calculateArea();
		
		/*
		System.out.println(square.getColor());
		System.out.println(square.getEdgeLength());
		System.out.println(square.getPosX());
		System.out.println(square.getPosY());
		*/
		
		Rectangle rect = new Rectangle();
		rect.setPosX(10);
		rect.setPosY(10);
		rect.setColor(Color.BEYAZ);
		rect.setHeight(10);
		rect.setLength(10);
		rect.calculateArea();
		
		Circle circle = new Circle();
		circle.setPosX(30);
		circle.setPosY(30);
		circle.setColor(Color.BEYAZ);
		circle.setRadius(5);
		circle.calculateArea();
	}
}

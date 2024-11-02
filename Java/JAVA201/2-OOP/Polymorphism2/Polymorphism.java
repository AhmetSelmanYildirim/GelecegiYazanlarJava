
public class Polymorphism {
	
	public static void main(String[] args) {
		
		/*
		Shape shape = new Shape();
		shape.area();
		
		Square square = new Square(10);
		square.area();
		
		Circle circle = new Circle(10);
		circle.area();
		
		Rectangle rectangle = new Rectangle(10,5);
		rectangle.area();
		*/
		
		Shape shape = new Square(5);
		shape.area();
		Shape shape2 = new Circle(5);
		shape2.area();
		Shape shape3 = new Rectangle(10,5);
		shape3.area();
		
		
		
	}

}

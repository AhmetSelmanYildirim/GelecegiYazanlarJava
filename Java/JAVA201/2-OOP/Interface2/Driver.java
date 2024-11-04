
public class Driver {
	
	public static void main(String[] args) {
		Swimable swimable = new Fish();
		swimable.swim();
		
		Flyable flyable = new Raven();
		flyable.fly();
		((Raven) flyable).walk();
		
		Walkable walkable = new Zebra();
		walkable.walk();
		
	}

}
